package com.edinarobotics.scout;
import com.edinarobotics.filer.*;
import com.edinarobotics.gui.*;
import com.edinarobotics.logger.*;

import java.io.*;
import java.util.*;

/*
 * @author aoneill
 * @breif A data entry and management program for 1816 in Java
 */

public class Main 
{
    private static final String VERSION = "1.0.1";
    public static final String DATA_SEPARATOR = ":";

    public static Logger log = new Logger();

    // Initialize classes dealing with File operation
    private static FileCreator fileCreo = new FileCreator();
    private static FileCreator logger = new FileCreator();
    private static FileScanner configScanner = new FileScanner();
    private static FileScanner teamListFileScanner = new FileScanner();
    private static FileScanner teamFileScanner = new FileScanner();
    private static FileScanner matchFileScanner = new FileScanner();
    private static Extracter extract = new Extracter();

    // Assign a variable the current directory
    private static String currentDir = System.getProperty("user.dir");


    public static String teamFileDir = "C:/";
    public static String commentFileDir = "C:/";
    public static boolean logActivate = false;

    // Initialize important stings used througout the program
    private static String configFile = "config.txt";
    private static String teamListFile = "TeamList.txt";
    private static String matchListFile = "Match-List.txt";
    private static String workspaceFolderName = "Workspace";
    private static String teamFolderName = "TeamDir";
    private static String commentFolderName = "Comments";
    private static String matchFolderName = "Matches";
    private static String teamFile = "team.txt";
    private static String matchFile;

    public static void main(String[] args) throws InterruptedException
    {
        log.setEnabled(true);
        log.log("Main", "Working in " +  currentDir);

        // This string holds misc. data at different points in the program
        String data;

        // Set default values for the Directories of the different user-set options

        // Initialize Arrays / Variables to store team data input
        int teamNumbers[] = new int[6];
        int teamScores[][] = new int[3][6];
        String teamPenalties[] = new String[6];
        String teamComments[] = new String[6];

        // Variable to store the Current Match
        int currentMatch = 0;

        // If the default Workspace folder is not created, create it.
        if(!(new File(workspaceFolderName).isDirectory()))
        {
            log.log("Main", "Creating default Work Space");
            new File(workspaceFolderName).mkdir();
        }

        // If the default Team folder is not created, create it.
        if(!(new File(workspaceFolderName + "/" + teamFolderName).isDirectory()))
        {
            log.log("Main", "Creating default Team Folder");
            new File(workspaceFolderName + "/" + teamFolderName).mkdir();
        }

        // If the default Comments folder is not created, create it.
        if(!(new File(workspaceFolderName + "/" + commentFolderName).isDirectory()))
        {
            log.log("Main", "Creating default Comment Folder");
            new File(workspaceFolderName + "/" + commentFolderName).mkdir();
        }

        // If the Config file is not created, create it.
        if(!configScanner.isFileCreated(currentDir + "/" + workspaceFolderName, configFile))
        {
            log.log("Main", "Creating Config File");
            fileCreo.createFile(currentDir + "/" + workspaceFolderName, configFile);
            fileCreo.openFile(currentDir + "/" + workspaceFolderName, configFile);
            
            fileCreo.addConfigEntries();
            fileCreo.closeFile();
        }

        // If the Team List file is not created, create it.
        if(!teamListFileScanner.isFileCreated(currentDir + "/" + workspaceFolderName, teamListFile))
        {
            log.log("Main", "Creating Team List");
            fileCreo.createFile(currentDir + "/" + workspaceFolderName, teamListFile);
            fileCreo.openFile(currentDir + "/" + workspaceFolderName, teamListFile);

            fileCreo.addTeamListHeader();
            fileCreo.closeFile();
        }

        // if the Match folder is not created, create it.
        if(!(new File(workspaceFolderName + "/" + matchFolderName).isDirectory()))
        {
            log.log("Main", "Creating default Match Folder");
            new File(workspaceFolderName + "/" + matchFolderName).mkdir();
        }

        // If the Match List file is not created, create it.
        if(!matchFileScanner.isFileCreated(currentDir + "/" + workspaceFolderName, matchListFile))
        {
            log.log("Main", "Creating Match List");
            fileCreo.createFile(currentDir + "/" + workspaceFolderName + "/" + matchFolderName, matchListFile);
            fileCreo.openFile(currentDir + "/" + workspaceFolderName + "/" + matchFolderName, matchListFile);

            fileCreo.addMatchListHeader();
            fileCreo.closeFile();
        }

        log.log();

        // Open the Config file to read defaults
        configScanner.openFile(currentDir + "/" + workspaceFolderName, configFile);

        // Read the config file until the line does not start with '#"
        // Used to skip a header comment on the file
        String nextLine = configScanner.getNextLine();
        while(nextLine.startsWith("#"))
        {
            nextLine = configScanner.getNextLine();
        }

        // Once you have found the content of the config file, take the data you need
        boolean abort = false;
        while(!abort)
        {
            // If the next line found in the scanner indicates the default Team Dir.
            // Extract the second entry and store it as the defaultTeaDir
            if(nextLine.startsWith("defaultTeamDir"))
            {
                teamFileDir = extract.extractEntry(nextLine, 2);

                // Due to the file structure of Windows, we need to also extract entry 3 because of the colon
                // in C:/
                if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
                {
                    teamFileDir = teamFileDir + ":" + extract.extractEntry(nextLine, 3);
                }
            }

            // This method is deprecated. It will be implimented in the future. Its purpose is
            // to print to a file what the System.out.print() methods would show on the console.
            if(nextLine.startsWith("changelskjdflakjf"))
            {
                if(extract.extractEntry(nextLine, 2).equals("true"))
                {
                    logActivate = true;
                }
            }

            // If the next line found in the scanner indicates the default Comment Dir.
            // Extract the second entry and store it as the defaultTeaDir
            if(nextLine.startsWith("defaultCommentDir"))
            {
                commentFileDir = extract.extractEntry(nextLine, 2);
                if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
                {
                    commentFileDir = commentFileDir + ":" + extract.extractEntry(nextLine, 3);
                }
            }

            // Once the configScanner runs out of lines, abort the loop, else, get the next line
            if(!configScanner.hasNextEntry())
            {
                abort = true;
            }
            else
            {
                nextLine = configScanner.getNextLine();
            }
        }

        // Initialize the Settings GUI
        SettingsGUI sGUI = new SettingsGUI();

        // Set the feilds in the Settings GUI
        sGUI.setTeamDirField(teamFileDir);
        sGUI.setCommentsDirField(commentFileDir);
        sGUI.setLogBox(logActivate);

        // Wait for the User to hit the Scout button
        while(!sGUI.getScoutStatus()) {}

        // Store the values from the SettingsGUI in case the user chnged a file path or something
        teamFileDir = sGUI.getTeamDirPath();
        commentFileDir = sGUI.getCommentDirPath();
        logActivate = sGUI.getLogBox();
        log.setEnabled(logActivate);

        // Hide the GUI
        sGUI.setVisible(false);

        // Open and update the Config File
        fileCreo.openFile(currentDir + "/" + workspaceFolderName, configFile);
        fileCreo.addUpdatedConfigEntries(teamFileDir, commentFileDir, logActivate);
        fileCreo.closeFile();



        // Data Entry starts here
        // Initialize the Data Entry GUI
        // DataEntryGUI deGUI = new DataEntryGUI(VERSION);
        DataEntryGUI_3 deGUI3 = new DataEntryGUI_3(VERSION);

        // Wait for 100 Miliseconds to let the GUI load
        Thread.sleep(100);

        // Start an infinite loop
        // The loop will exit once the user hits the 'x' button in the window
        while(true)
        {
            // Wait for the submitted button to be pressed
            while(!deGUI3.getSubmittedFlag()) {}

            // Reset the boolean to hold the state of the submitted button
            deGUI3.resetSubmittedFlag();

            // Wait for 100 miliseconds to let the computer think
            // The program would have issues here, and giving it a small period to rest seemed to fix it
            Thread.sleep(100);

            // Store the data from the GUI to their respective arrays
            currentMatch = deGUI3.getMatch();
            teamNumbers = deGUI3.getTeamNumbers();
            teamScores = deGUI3.getScores();
            teamPenalties = deGUI3.getPenalties();
            teamComments = deGUI3.getComments();

            // Start the main for() loop for the 6 Teams represented in the GUI
            for(int i = 0; i < 6; i++)
            {
                // Store the Team's text file as their team number plus the .txt extension
                teamFile = Integer.toString(teamNumbers[i]) + ".txt";

                // If the team's file is not created, create the team's file, and add some standard content
                if(!teamFileScanner.isFileCreated(teamFileDir, teamFile))
                {
                    // Remember the changelskjdflakjf? This is where it would be implimented
                    System.out.println("Creating Team " + teamNumbers[i] + "'s Data File");

                    // Create the File
                    fileCreo.createFile(teamFileDir, teamFile);
                    fileCreo.addTeamHeader();
                }

                // If the team file exists, do the following
                if(teamFileScanner.isFileCreated(teamFileDir, teamFile))
                {
                    // Open the file for Reading
                    teamFileScanner.openFile(teamFileDir, teamFile);

                    // Find how many lines there are in the team's file
                    int countLine = 0;
                    while(teamFileScanner.hasNextEntry())
                    {
                        countLine++;
                        teamFileScanner.getNextLine();
                    }

                    // Create an array to hold the already existing Data with a length
                    // determined by the number of lines in the file
                    String dataArray[] = new String[countLine];

                    // Open the file again to start scanning from the beginning of the file
                    teamFileScanner.openFile(teamFileDir, teamFile);

                    // Reset the line count
                    countLine = 0;

                    // While the file has content, add it to the newly created array
                    while(teamFileScanner.hasNextEntry())
                    {
                        dataArray[countLine] = teamFileScanner.getNextLine();
                        countLine++;
                    }

                    // Open the teams file with the File Creator
                    fileCreo.openFile(teamFileDir, teamFile);
                    for(int j = 0; j < countLine; j++)
                    {
                        // Add the old entries
                        fileCreo.addEntry(dataArray[j]);
                    }
                }
                // Add the new entry fro the round
                data = String.format("%d%s%d%s%d%s%d%s%s%s", currentMatch, DATA_SEPARATOR, teamScores[0][i], DATA_SEPARATOR, teamScores[1][i], DATA_SEPARATOR, teamScores[2][i], DATA_SEPARATOR, teamPenalties[i], System.getProperty("line.separator"));
                fileCreo.addEntry(data);

                // Close the file to save changes
                fileCreo.closeFile();

                // The reason the file's contents had to be read, stored, then written again is because
                // when you open the file with the file creator, it seems to wipe the data already there
                // And leave nothing behind. So the existing data must be stored and written before
                // Adding the next entry to avoid data loss.

                log.log();


                // Store the Team's Comment file as the team's number plus the ending of "-Comments.txt"
                teamFile = Integer.toString(teamNumbers[i]) + "-Comments.txt";

                // Try to open the file
                teamFileScanner.openFile(commentFileDir, teamFile);

                // If the file does not exist, create the file, and add a standard header
                if(!teamFileScanner.isFileCreated(commentFileDir, teamFile))
                {
                    // Remember the changelskjdflakjf? This is where it would be implimented
                    System.out.println("Creating Team " + teamNumbers[i] + "'s Commnent File");

                    // Create the file, add content, and close it
                    fileCreo.createFile(commentFileDir, teamFile);
                    fileCreo.openFile(commentFileDir, teamFile);
                    fileCreo.addCommentHeader();
                }
                // If the team comments file already has content, go through the same process for the team files
                if(!teamComments[i].equals(""))
                {
                    // Open the file for Reading
                    teamFileScanner.openFile(commentFileDir, teamFile);

                    // Find how many lines there are in the team's file
                    int countLine = 0;
                    while(teamFileScanner.hasNextEntry())
                    {
                        countLine++;
                        teamFileScanner.getNextLine();
                    }

                    // Create an array to hold the already existing Data with a length
                    // determined by the number of lines in the file
                    String dataArray[] = new String[countLine];

                    // Open the file again to start scanning from the beginning of the file
                    teamFileScanner.openFile(commentFileDir, teamFile);

                    // Reset the line count
                    countLine = 0;

                    // While the file has content, add it to the newly created array
                    while(teamFileScanner.hasNextEntry())
                    {
                        dataArray[countLine] = teamFileScanner.getNextLine();
                        countLine++;
                    }

                    // Open the teams file with the File Creator
                    fileCreo.openFile(commentFileDir, teamFile);
                    for(int j = 0; j < countLine; j++)
                    {
                        // Add old entries
                        fileCreo.addEntry(dataArray[j]);
                    }

                    // Add a seperator to the comments file to clearly mark where comments start and stop
                    fileCreo.addEntry();
                    fileCreo.addEntry("#########################");
                    fileCreo.addEntry(String.format("Round: %d", currentMatch));
                    fileCreo.addEntry();

                    // Add the next entry
                    fileCreo.addEntry(teamComments[i]);
                    
                }
                // Close the team file to save changes
                fileCreo.closeFile();

                log.log();

                // Do the same process as the comments again, but with a different file...
                // Open the Team List File
                teamListFileScanner.openFile(currentDir + "/" + workspaceFolderName, teamListFile);

                // Find how many lines there are in the Team List File
                int countLine = 0;
                while(teamListFileScanner.hasNextEntry())
                {
                    countLine++;
                    teamListFileScanner.getNextLine();
                }

                // Create an array to hold the already existing Data with a length
                // determined by the number of lines in the file
                String dataArray[] = new String[countLine];

                // Open the file again to start scanning from the beginning of the file
                teamListFileScanner.openFile(currentDir + "/" + workspaceFolderName, teamListFile);

                // Reset the line count
                countLine = 0;

                // While the file has content, add it to the newly created array
                while(teamListFileScanner.hasNextEntry())
                {
                    dataArray[countLine] = teamListFileScanner.getNextLine();
                    //log.log("Main", "           [" + dataArray[countLine] + "]\t[" + teamNumbers[i] + "]");

                    countLine++;
                }

                // Create a flag to check if a team is already present in the Team List File
                boolean teamAlreadyPresent = false;

                // Open the teams file with the File Creator
                fileCreo.openFile(currentDir + "/" + workspaceFolderName, teamListFile);
                for(int j = 0; j < countLine; j++)
                {
                    // Add the old entries
                    fileCreo.addEntry(dataArray[j]);

                    // If the team is already present in the Team File, cange the flag
                    if(dataArray[j].equals(Integer.toString(teamNumbers[i])))
                    {
                        log.log("Main", "Found Team " + dataArray[j] + " in TeamFile!");
                        teamAlreadyPresent = true;
                    }
                }

                // As long as the team is not present in the FIle, add the team
                if(!teamAlreadyPresent)
                {
                    fileCreo.addEntry(Integer.toString(teamNumbers[i]));
                }

                // Close and save the file
                fileCreo.closeFile();
                
                log.log();
            }

            matchFile = "Match_" + String.valueOf(currentMatch) + ".txt";
            log.log("Main", "Match File name is " + matchFile);

            if(matchFileScanner.isFileCreated(currentDir + "/" + workspaceFolderName + "/" + matchFolderName, matchFile))
            {
                log.log("Main", "Overwriting existing Match File with new data...");
                fileCreo.openFile(currentDir + "/" + workspaceFolderName + "/" + matchFolderName, matchFile);
                fileCreo.addMatchHeader(currentMatch);

                for(int i = 0; i < 6; i++)
                {
                    data = String.format("%d%s%d%s%d%s%d%s%s", teamNumbers[i], DATA_SEPARATOR, teamScores[0][i], DATA_SEPARATOR, teamScores[1][i], DATA_SEPARATOR, teamScores[2][i], DATA_SEPARATOR, teamPenalties[i]);
                    fileCreo.addEntry(data);
                }
                fileCreo.closeFile();
            }
            else
            {
                log.log("Main", "Creating new Match File");
                fileCreo.createFile(currentDir + "/" + workspaceFolderName + "/" + matchFolderName, matchFile);
                fileCreo.openFile(currentDir + "/" + workspaceFolderName + "/" + matchFolderName, matchFile);
                fileCreo.addMatchHeader(currentMatch);

                for(int i = 0; i < 6; i++)
                {
                    data = String.format("%d%s%d%s%d%s%d%s%s", teamNumbers[i], DATA_SEPARATOR, teamScores[0][i], DATA_SEPARATOR, teamScores[1][i], DATA_SEPARATOR, teamScores[2][i], DATA_SEPARATOR, teamPenalties[i]);
                    fileCreo.addEntry(data);
                }
                fileCreo.closeFile();
            }




            matchFileScanner.openFile(currentDir + "/" + workspaceFolderName + "/" + matchFolderName, matchListFile);

            int countLine = 0;
            while(matchFileScanner.hasNextEntry())
            {
                countLine++;
                matchFileScanner.getNextLine();
            }

            String dataArray[] = new String[countLine];

            matchFileScanner.openFile(currentDir + "/" + workspaceFolderName + "/" + matchFolderName, matchListFile);
            countLine = 0;
            while(matchFileScanner.hasNextEntry())
            {
                dataArray[countLine] = matchFileScanner.getNextLine();
                countLine++;
            }

            fileCreo.openFile(currentDir + "/" + workspaceFolderName + "/" + matchFolderName, matchListFile);
            for(int j = 0; j < countLine; j++)
            {
                fileCreo.addEntry(dataArray[j]);
            }

            fileCreo.addEntry(String.valueOf(currentMatch));
            fileCreo.closeFile();

            // For Debug purposes
            log.log();
        }
    }
}