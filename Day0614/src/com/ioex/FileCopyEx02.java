package com.ioex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyEx02 {

	public static void main(String[] args) {

		// byte[]������ ����

		FileInputStream src = null;
		FileOutputStream dest = null;

		try {
			// ���� ������ �б� ���� FileInputStream ��ü ����
			src = new FileInputStream(new File("d:/Akira/zzz.txt"));
			// ���� ������ �����ϱ� ���� FileOutputStream ��ü ����
			dest = new FileOutputStream(new File("d:/Akira/dest.txt"));
			//�ӽ� ����ҿ� ����� data�� ��ü ������ ������ ������ ����
			int length = 0;
			//�ӽ� ����ҷ� ����� byte[]����
			byte[] buffer = new byte[1024*8];
		
			//InputStream�� ���ؼ� �о���� �����͸� �ӽ� ����ҿ� �����ϰ�
			//����� �������� ���� ��ŭ length�� ������
			
			while((length = src.read(buffer)) != -1) {
				//OutputStream�� ���ؼ� �ӽ� ����ҿ� ����Ǿ� �ִ� �����͸� 
				//length��ŭ ���Ͽ� �����Ѵ�.
				
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
