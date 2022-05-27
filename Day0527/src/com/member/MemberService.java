package com.member;

import java.util.Scanner;

public class MemberService {
	
	//dao
	void process(Action action, Scanner sc) {
		//Action action = new WriteAction();
		action.excute(sc);
	}

	
	
}
