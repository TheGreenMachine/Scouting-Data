/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.edinarobotics.data;

import com.edinarobotics.filer.FileWriter;
import com.edinarobotics.filer.FileReader;
import com.edinarobotics.logger.Logger;
import com.edinarobotics.scout.Global;
import java.util.ArrayList;

/*
 * @author aoneill
 * @breif
 */

public class MatchListFileOut
{
    // Initialize classes dealing with File operation
    private static FileWriter fileCreo = new FileWriter();
    private static FileReader matchFileScanner = new FileReader();
    
    // Create the logger
    public static Logger log = Global.log;

    // Assign Variables for file creation
    public static String currentDir = Global.currentDir;
    public static String workspaceDir = Global.workspaceDir;

    public static String matchListFile = Global.matchListFile;
    public static String matchFolderName = Global.matchFolderName;
    
    private static String[] header = {"# Match List #"};

    /**
     * Creates a Math List File for storing the list of matches
     * @param matchNumber the match number
     */
    public MatchListFileOut(int matchNumber)
    {
        // If the Match file has no content, give it a header line
        if(!matchFileScanner.isFileCreated(workspaceDir, matchListFile))
        {
            fileCreo.openFile(workspaceDir, matchListFile);
            fileCreo.addEntry(header);
            fileCreo.closeFile();
        }
        
        // Open the file
        matchFileScanner.openFile(workspaceDir, matchListFile);
        
        // Transfer the contents of the file to a list
        ArrayList<String> list = new ArrayList<String>();
        while(matchFileScanner.hasNextEntry())
        {
            list.add(matchFileScanner.getNextLine());
        }
        matchFileScanner.close();

        // Add the match number if it does not already exist
        if(!hasRepeatEntry(list, list.size()))
        {
            list.add(String.valueOf(matchNumber));
        }

        // Open up, write to, and close the file
        fileCreo.openFile(workspaceDir, matchListFile);
        fileCreo.addEntry(list);
        fileCreo.closeFile();

        // For Debug purposes
        log.log();
    }
    
    /**
     * Checks to see if a list of integers has a repeat
     * @param list the list to be tested
     * @param compareTo the entry to compare to
     * @return if it has a repeat entry or not
     */
    private boolean hasRepeatEntry(ArrayList<String> list, int compareTo)
    {
        // iterate throug the list and compare against the first entry
        for(int i = 1; i < list.size(); i++)
        {
            // If the two equal, return true
            if(list.get(0).equals(list.get(i)))
            {
                return true;
            }
        }
        
        // Else return false
        return false;
    }
}