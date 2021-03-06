/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.edinarobotics.data;

import com.edinarobotics.filer.*;
import com.edinarobotics.logger.Logger;
import com.edinarobotics.scout.Global;

import java.util.ArrayList;

/*
 * @author aoneill
 * @breif
 */

public class CommentFileOut 
{
    private static FileReader commentFileScanner = new FileReader();
    private static FileWriter fileCreo = new FileWriter();
    
    private static String commentFileDir = Global.commentFileDir;

    private static Logger log = Global.log;
    private static String LOG_TAG = "Comments File";

    private static String[] header = {"# Comments #"}; 
    /**
     * Create a file to hold the comments for a team
     * @param teamNumber the team to create the file for
     * @param matchNumber the match number the team was in
     * @param comments the comments to be added
     */
    public CommentFileOut(int teamNumber, int matchNumber, String comments)
    {
        // Store the Team's Comment file as the team's number plus the ending of "-Comments.txt"
        String teamFile = Integer.toString(teamNumber) + "-Comments.txt";

        // Create a list to store the information to be written to the comments file
        ArrayList<String> list = new ArrayList<String>();

        // If the file does not exist, create the file, and add a standard header
        if(!commentFileScanner.isFileCreated(commentFileDir, teamFile))
        {
            // Remember the changelskjdflakjf? This is where it would be implimented
            log.log(LOG_TAG, "Creating Team " + teamNumber + "'s Commnent File");

            // Create the file, add content, and close it
            fileCreo.createFile(commentFileDir, teamFile);
            fileCreo.openFile(commentFileDir, teamFile);
            fileCreo.addEntry(header);
            fileCreo.closeFile();
        }

        // If the team comments file already has content, go through the same process for the team files
        if(!comments.equals(""))
        {
            // Debug statement
            log.log(LOG_TAG, "Adding content to Team " + teamNumber + "'s Commnent File");

            // Open the file for Reading
            commentFileScanner.openFile(commentFileDir, teamFile);

            // Add the existing content to the list of information
            while(commentFileScanner.hasNextEntry())
            {
                list.add(commentFileScanner.getNextLine());
            }
            commentFileScanner.close();

            // Add a seperator to the comments file to clearly mark where comments start and stop
            list.add("");
            list.add("#########################");
            list.add(String.format("Round: %d", matchNumber));
            list.add("");

            // Add the next entry
            list.add(comments);

            // Write the entry out
            fileCreo.openFile(commentFileDir, teamFile);
            fileCreo.addEntry(list);
            
            // Close the team file to save changes
            fileCreo.closeFile();
        }
    }
}