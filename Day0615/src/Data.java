import java.io.Serializable;

class MyObject implements Serializable{
	
}

public class Data implements Serializable{

	//데이터 직렬화
	private int no;
	private String mail;
	private String name;
	
	public Data() {
	}

	public Data(int no, String mail, String name) {
		super();
		this.no = no;
		this.mail = mail;
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
