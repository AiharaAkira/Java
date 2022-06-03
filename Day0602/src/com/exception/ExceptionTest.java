package com.exception;

public class ExceptionTest {

	public static void main(String[] args) {
		
		try {
			
			startInstall();
			copyFiles();
			
			
		} catch (SpaceException e) {
			
			System.out.println("공간 부족");
			System.out.println("재설치 필요");
			
		}catch (MemoryException me) {

			System.out.println("메모리 부족");
			System.out.println("재설치 필요");
			
		}finally {
			deleteFiles();
		}
		
	}
	
	
	static void Install() throws InstallException, MemoryException{
		
		try {
			
			startInstall();
			copyFiles();
		}catch (SpaceException se) {
		
			InstallException ie = new InstallException("설치중 오류");
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
	
	static void deleteFiles() {//임시파일 각색제''
		
		
	}
	
}
