package com.company;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create instance of Docs to work with
        Docs currentDocs = new Docs();
        // Set root folder to work with
        String root = "C:\\Users\\Charlie\\OneDrive\\Desktop\\mwcDocsDir";
        // Create a file
        File root_dir = new File(root);
        // User input - file name to find
        //String searchForFile = "file 1";
        // TODO - allow client to enter folder(bundle) name and file extension
        System.out.println("Please enter the file name: ");
        Scanner fileScanner = new Scanner(System.in);
        String searchForFile = fileScanner.nextLine();
        // Start the directory search
        currentDocs.matchFilenames(root_dir, searchForFile);

        // Print out list of files
        // TODO - Handle no files found - go back to search
        System.out.println("The following matched files were found: ");
        currentDocs.printMatchedFiles();
        System.out.println();
        // ASk user what file they want to open
        System.out.println("Which number file would you like to open?");
        Scanner fileToSelect = new Scanner(System.in);
        int fileNum = fileToSelect.nextInt();
        //System.out.println(fileNum);
        // Open file
        currentDocs.openFile(fileNum);
    }
}
