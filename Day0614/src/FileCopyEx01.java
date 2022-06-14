import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyEx01 {

	public static void main(String[] args) {

		System.out.println("���� ���� ����....");
		long start = System.currentTimeMillis();

		FileInputStream src = null;
		FileOutputStream dest = null;

		try {
			//���� ������ �б� ���� FileInputStream ��ü ����
			src = new FileInputStream(new File("c:/windows/win.ini"));
			//���� ������ �����ϱ� ���� FileOutputStream ��ü ����
			dest = new FileOutputStream(new File("d:/Akira/dest.txt"));

			//FileInputStream�� ���ؼ� �о���� ���� ������ ���� ����
			int readValue = 0;
			//FileInputSteam�� read()�޼ҵ带 ���ؼ� �о���� ���� readValue�� ����
			
			while((readValue = src.read()) != -1) {
				
				//readValue�� ����� ���� FileOutputStream�� write()�޼ҵ带 ���ؼ�
				//���Ͽ� ����
				dest.write(readValue);
				
			}
			
			
			
			
		} catch (FileNotFoundException fnfe) {

			fnfe.printStackTrace();

		} catch (IOException ioe) {

			ioe.printStackTrace();

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

		long end = System.currentTimeMillis();

		long copyTime = (end - start) / 1000;
		System.out.println("���翡 �ɸ� �ð�: " + copyTime + "�� ");

	}

}
