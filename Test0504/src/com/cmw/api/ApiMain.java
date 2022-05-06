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

			// Json������ ������ �Ľ��ϰ� jsonparser��ü�� �ʿ�
			JSONParser jp = new JSONParser();

			// ���� �� ��ü�� isr(����������) �־ �Ľ� �غ�
			JSONObject weatherData = (JSONObject) jp.parse(isr);
			// �µ�
			JSONObject main = (JSONObject) weatherData.get("main");
			System.out.println("���� �µ� : " + main.get("temp"));
			// ����
			JSONObject sys = (JSONObject) weatherData.get("sys");
			System.out.println("���� ���� : " + sys.get("country"));
			// ����
			System.out.println("���� ���� : " + weatherData.get("name"));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
