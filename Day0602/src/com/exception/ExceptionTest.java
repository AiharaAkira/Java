package com.exception;

public class ExceptionTest {

	public static void main(String[] args) {
		
		try {
			
			startInstall();
			copyFiles();
			
			
		} catch (SpaceException e) {
			
			System.out.println("���� ����");
			System.out.println("�缳ġ �ʿ�");
			
		}catch (MemoryException me) {

			System.out.println("�޸� ����");
			System.out.println("�缳ġ �ʿ�");
			
		}finally {
			deleteFiles();
		}
		
	}
	
	
	static void Install() throws InstallException, MemoryException{
		
		try {
			
			startInstall();
			copyFiles();
		}catch (SpaceException se) {
		
			InstallException ie = new InstallException("��ġ�� ����");
			ie.initCause(se);
			throw ie;
			
		}
		
		
		
		
		
	}
	
	static void startInstall() throws SpaceException, MemoryException{
		
		if(!enoughMemory()) {
			throw new MemoryException();                    
		}
		
	}
	
	static boolean enoughSpace() throws SpaceException {
		
		if(!enoughSpace()){
			throw new SpaceException();
		}
		
		return false;
	}
	
	static boolean enoughMemory() {
		return true;
	}
	
	static void copyFiles() {
	}
	
	static void deleteFiles() {//�ӽ����� ������''
		
		
	}
	
}
