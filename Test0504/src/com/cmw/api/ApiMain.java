package com.cmw.api;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ApiMain {

	public static void main(String[] args) {
		Scanner k = null;
		HttpsURLConnection huc = null;

		try {
			k = new Scanner(System.in);
			System.out.println("city : ");
			String str = k.next();

			// api.openweathermap.org/data/2.5/weather?q=seoul&appid=aa7b9386aea6402f6b5f06d2db012668

			String url = "https://api.odcloud.kr/api/15035771/v1/uddi:993923fe-3270-4fc6-89e6-e4c1b3ff511c_201909041431?page=1&perPage=10&serviceKey=%09%20TLtv07DU2VazaRI0IKuZqa3hBupDXvsL1ubnjOsj1FNtxjM5X%2Ftba%2B4Q75lipY7oTFyyKmbzYeYy13JEvVlkNg%3D%3D";

			URL u = new URL(url);
			huc = (HttpsURLConnection) u.openConnection();

			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");

			// Json데이터 받은거 파싱하게 jsonparser객체가 필요
			JSONParser jp = new JSONParser();

			// 만든 그 객체로 isr(받은데이터) 넣어서 파싱 준비
			JSONObject weatherData = (JSONObject) jp.parse(isr);
			// 온도
			JSONObject main = (JSONObject) weatherData.get("main");
			System.out.println("현재 온도 : " + main.get("temp"));
			// 국가
			JSONObject sys = (JSONObject) weatherData.get("sys");
			System.out.println("현재 국가 : " + sys.get("country"));
			// 도시
			System.out.println("현재 도시 : " + weatherData.get("name"));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
