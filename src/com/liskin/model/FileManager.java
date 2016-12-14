package com.liskin.model;

import java.io.File;

public class FileManager {

	public static void getTree(String path) {
		if (path.equals("") || path.equals(null))
			throw new IllegalArgumentException("Illegal argument:" + path);
		File file = new File(path);
		if (!file.exists())
			throw new IllegalArgumentException("Illegal argument:" + path);
		System.out.println(file.getName());
		
		String fileParent = new String(file.getParent());
		getTree(file, fileParent);
	}

	public static void getTree(File file, String parentFile) {
		if (file.isDirectory()) {
			File[] children = file.listFiles();
			for (int i = 0; i < children.length; i++) {
				if (children[i].isDirectory()) {
					for (int j = 0; j < file.getPath().length() - parentFile.length(); j++)
						System.out.print(" ");
					System.out.print(children[i].getName() + "\n");
					getTree(children[i], parentFile);
				} else {
					for (int j = 0; j < file.getPath().length() - parentFile.length(); j++)
						System.out.print(" ");
					System.out.print(children[i].getName()+ "\n");
				}
			}
		}
	}
}