package com.exception;

import java.io.PrintStream;
import java.io.PrintWriter;

public class MyException extends Exception {

	//���� ���� �����ϴ� ���� ����
	private String message;
	//������ ������ Throwable ��ü�� ���·� �����ϰڴ�.
	//Throwable�� �����ϰ� ���� ��θ� ����
	private Throwable cause;

	public MyException() {
		super();

	}

	public MyException(String msg) {
		super(msg);
		message = msg;
	}

	public MyException(Throwable cause) {
		super(cause);
		this.cause = cause;
	}

	public MyException(String message, Throwable cause) {
		super();
		this.message = message;
		this.cause = cause;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Throwable getCause() {
		return cause;
	}

	public void setCause(Throwable cause) {
		this.cause = cause;
	}

	public void printStackTrace(PrintStream out) {

		super.printStackTrace(out);
		
	}

	public void printStackTrace(PrintWriter out) {

		super.printStackTrace(out);
		
	}

	public void printStackTrace() {

		System.out.println(":: error");
		System.out.println("��������" + message);
		System.out.println("���� Ŭ����" + cause);
		System.out.println(":: error end");
		
		super.printStackTrace(System.out);
		
	}
	

	
}
