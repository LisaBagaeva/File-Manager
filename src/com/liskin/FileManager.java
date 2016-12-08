package com.liskin;

import java.io.File;

public class FileManager {
//	private static List<String> listFiles = new ArrayList<String>();
	public static void getTree(String path) {
		File file = new File(path);
		if (file.isDirectory()) {
			File[] children = file.listFiles();
			for (int i = 0; i < children.length; i++) {
				if (children[i].isDirectory()) {
			//		listFiles.add(children[i].getPath());
					System.out.println(children[i].getPath());
					getTree(children[i].getPath());
				} else
					System.out.println(children[i].getPath());
				//	listFiles.add(children[i].getPath());
			}
		}
	}
}
