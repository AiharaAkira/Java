package joinex;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
@WebServlet("/JoinOK")
public class JoinOK extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	private Connection connection;
	private Statement stmt;
	
	private String name, id, pw, phone1, phone2, phone3, gender;

	public JoinOK() {
		// TODO Auto-generated constructor stub
	super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServeletException, IOException{
		System.out.println("doGet");
		actionDo(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServeletException, IOException{
		System.out.println("doGet");
		actionDo(request, response);
	}
	
	private void actionDo(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		 	request.setCharacterEncoding("EUC-KR");
		 	
		 	name = request.getParameter("name");
		 	id = request.getParameter("id");
		 	pw = request.getParameter("pw");
		 	phone1 = request.getParameter("phone1");
		 	phone2 = request.getParameter("phone2");
		 	phone3 = request.getParameter("phone3");
		 	gender = request.getParameter("gender");
	}
	String query = "insert into member values('" +name + "', '" +id + "', '" +pw + "', '" +phone1 + "', '" +phone2 + "', '" +phone3 + "', '" +gender + "')"; 
	
}

try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	connection = DriverManager.getConnection("jdbc:oracle:thin@localhost:1522:orcl", "scott", "tiger");
	stmt = connection.createStatement();
	int i = stmt.executeUpdate(query);
	if(i == 1) {
		System.out.println("insert success");
		response.sendRedirect("joinResult.jsp");
	}else {
		System.out.println("insert fail");
		response.sendRedirect("join.html");
	}
}
