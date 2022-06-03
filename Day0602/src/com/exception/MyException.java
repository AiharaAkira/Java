package com.exception;

import java.io.PrintStream;
import java.io.PrintWriter;

public class MyException extends Exception {

	//예외 내용 저장하는 변수 선언
	private String message;
	//예외의 원인을 Throwable 객체의 형태로 저장하겠다.
	//Throwable은 예외하고 에러 모두를 관리
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
		System.out.println("에러원인" + message);
		System.out.println("관련 클래스" + cause);
		System.out.println(":: error end");
		
		super.printStackTrace(System.out);
		
	}
	

	
}
