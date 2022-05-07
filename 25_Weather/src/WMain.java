import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class WMain {

	public static void main(String[] args) {

		Scanner k = null;
		
		HttpsURLConnection huc =null;
		
		try {
			k = new Scanner(System.in);
			System.out.println("city : ");
			String str = k.next();
			
			//api.openweathermap.org/data/2.5/weather?q=seoul&appid=aa7b9386aea6402f6b5f06d2db012668


			String url = "https://api.openweathermap.org/data/2.5/weather?q="+str+"&appid=e7b1a57cd2158c8d195bfb24b7597bad";
			
			URL u = new URL(url);
			huc = (HttpsURLConnection)u.openConnection();
			
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			
			//Json데이터 받은거 파싱하게 jsonparser객체가 필요
			JSONParser jp = new JSONParser();
			
			//만든 그 객체로 isr(받은데이터) 넣어서 파싱 준비
			JSONObject weatherData = (JSONObject) jp.parse(isr);
			//온도 
			JSONObject main = (JSONObject) weatherData.get("main");
			System.out.println("현재 온도 : " + main.get("temp"));
			//국가
			JSONObject sys = (JSONObject) weatherData.get("sys");
			System.out.println("현재 국가 : " + sys.get("country"));
			//도시
			System.out.println("현재 도시 : " + weatherData.get("name"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
