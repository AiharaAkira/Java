package com.user;

import java.util.HashMap;

public class LoginSVC {

	private HashMap<String, String> loginDatas;
	private HashMap<String, UserVO> userDatas;

	public LoginSVC() {

		loginDatas = new HashMap<String, String>();
		userDatas = new HashMap<String, UserVO>();

		loginDatas.put("java", "java");
		userDatas.put("", new UserVO("java", "java", "영등포동", 20, "홍길동"));

	}

	public UserVO login(String id, String passwd) {

		UserVO user = null;

		if (loginDatas.containsKey(id)) {

			if (loginDatas.get(id).equals(passwd)) {
				user = userDatas.get(id);
			}

		}

		return user;

	}

}
