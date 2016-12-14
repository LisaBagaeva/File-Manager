
package com.liskin.tests;

import org.junit.Test;

import com.liskin.model.FileManager;

public class FileManagerTests {
 String correctPath = new String("C:\\Users\\Home\\workspace\\File Manager");
 String incorrectPath = new String("");

 @Test(expected = IllegalArgumentException.class)
 public void testIncorrectPath() {
  FileManager.getTree(incorrectPath);
 }

 @Test
 public void testCorrectPath() {
  FileManager.getTree(correctPath);
 }

}