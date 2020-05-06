package com.tg.practice.FileUtilities;

import com.tg.practice.FileUtilities.util.FileUtility;

/**
 * File Utilities!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to File Utilities program ...." );
        
        FileUtility fileUtil = new FileUtility();
        fileUtil.getAllFiles();
        fileUtil.printLatestFileDetails();
        fileUtil.checkSpecificFileIsPresentForToday();
        
        System.out.println();
        System.out.println("Thanks for using this utility program !! ");
    }
}
