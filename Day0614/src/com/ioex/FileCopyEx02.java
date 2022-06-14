package com.ioex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyEx02 {

	public static void main(String[] args) {

		// byte[]단위로 복사

		FileInputStream src = null;
		FileOutputStream dest = null;

		try {
			// 원본 파일을 읽기 위한 FileInputStream 객체 생성
			src = new FileInputStream(new File("d:/Akira/zzz.txt"));
			// 복사 파일을 생성하기 위한 FileOutputStream 객체 생성
			dest = new FileOutputStream(new File("d:/Akira/dest.txt"));
			//임시 저장소에 저장된 data의 전체 개수를 저장할 변수를 선언
			int length = 0;
			//임시 저장소로 사용할 byte[]선언
			byte[] buffer = new byte[1024*8];
		
			//InputStream을 통해서 읽어들인 데이터를 임시 저장소에 저장하고
			//저장된 데이터의 길이 만큼 length에 저장함
			
			while((length = src.read(buffer)) != -1) {
				//OutputStream을 통해서 임시 저장소에 저장되어 있는 데이터를 
				//length만큼 파일에 저장한다.
				
				dest.write(buffer, 0, length);
				
				
			}
			
		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			try {
				if ((dest != null)) {

					dest.close();
				}

			} catch (Exception e) {

				e.printStackTrace();
			}

			try {

				if ((src != null)) {

					src.close();
				}

			} catch (Exception e) {

				e.printStackTrace();
			}

		}

	}

}
