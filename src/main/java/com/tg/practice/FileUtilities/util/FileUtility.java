package com.tg.practice.FileUtilities.util;

import java.io.File;
import java.io.FilenameFilter;

public class FileUtility {
	
	private File dir;
	public FileUtility() {
		this.dir = new File("C:\\Users\\TANMOY\\Downloads");
	}
	public void getAllFiles() {
//		File dir = new File("C:\\Users\\TANMOY\\Downloads");
		if (this.dir.isDirectory()) {
			System.out.println("Pointing to directory => " + dir.getAbsolutePath());
			printFiles();
		} else {
			System.out.println(dir.getAbsolutePath() + " is not a directory !!!");
			System.out.println("Please enter a valid directory name !!");
		}
		
	}
	
	// Get all files and print their names
	private void printFiles() {
		File[]  files = this.dir.listFiles();
		int fileCounter = 0;
		for (File f : files) {
			fileCounter++;
			System.out.println("File name : " + f.getName());
		}
		
		System.out.println("Total files count = " + fileCounter);
	}
	
	// Get the latest file
	public void printLatestFileDetails() {
		System.out.println("Fetching last modified file name...");
		File[]  files = this.dir.listFiles();
		long lastModified = Long.MIN_VALUE;
		File lastModFile = null;
		for (File f : files) {
			if (f.lastModified() > lastModified) {
				lastModified = f.lastModified();
				lastModFile = f;
			}
		}
		
		System.out.println("Last Modified File name = " + lastModFile.getName());
		System.out.println("Last Modified value = " + lastModified);
		
//		Date date = new Date(lastModified);
		
		System.out.println("Last Modified value = " + DateUtil.convertLongValueToDate(lastModified));
	}
	
	// Checks whether the specific file is updated/created/downloaded today
	public void checkSpecificFileIsPresentForToday() {
		final String fileNamePattern = "UHJvZCBPZmZzaG9";
		File[] files = this.dir.listFiles(new FilenameFilter() {

			public boolean accept(File dir, String name) {
				return name.startsWith(fileNamePattern);
			}
		});
		
		long lastModified = DateUtil.convertDateToMiliseconds();
		File lastModFile = null;
		for (File f : files) {
			if (f.lastModified() == lastModified) {
				lastModified = f.lastModified();
				lastModFile = f;
			}
		}
		
		System.out.println("Last Modified File name = " + lastModFile.getName());
		System.out.println("Last Modified value = " + lastModified);
		
//		Date date = new Date(lastModified);
		
		System.out.println("Last Modified value = " + DateUtil.convertLongValueToDate(lastModified));

	}
	

}
