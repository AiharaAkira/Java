package com.ioex;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) {

		FileOutputStream fos = null;

		try {

			fos = new FileOutputStream("D:\\Akira\\zzz.txt");
			String message = "Work hard Java Programming!";
			fos.write(message.getBytes());
			fos.close();
			
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (fos != null) {

					fos.close();
				}

			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}

	}

}
