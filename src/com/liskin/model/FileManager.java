package com.liskin.model;

import java.io.File;

public class FileManager {
	private static String offset;

	public static void getTree(String path) {
		if (path.equals("") || path.equals(null))
			throw new IllegalArgumentException("Illegal argument:" + path);
		File file = new File(path);
		if (!file.exists())
			throw new IllegalArgumentException("Illegal argument:" + path);
		System.out.println(file.getName());
		offset = new String(new char[file.getName().length()]);
		String defaultOffset = new String(new char[file.getName().length()]);
		getTree(file,defaultOffset);
	}

	public static void getTree(File file, String defaultOffset) {
		if(file.isDirectory()){
		File[] children = file.listFiles();
		for (int i = 0; i < children.length; i++) {
			if (children[i].isDirectory()) {
				System.out.print(offset + children[i].getName() + "\n");
				offset = offset.concat(" ");
				getTree(children[i],defaultOffset);
			} else {
				System.out.print(offset + children[i].getName() + "\n");
				offset = defaultOffset;
			}
		}
	}
	}
}