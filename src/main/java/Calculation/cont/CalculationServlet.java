package Calculation.cont;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CalculationServlet
 */
@WebServlet("/CalculationServlet")
public class CalculationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CalculationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String str1=request.getParameter("num1");
		String str2=request.getParameter("num2");

		// convert string to int;
		int num1=Integer.parseInt(str1);
		int num2=Integer.parseInt(str2);

		//	    int sum=num1+num2;
		
		Calculation con=new Calculation();
		con.setNum1(num1);
		con.setNum2(num2);
		con.setSum(con.getNum1()+ con.getNum2());


		PrintWriter pw=response.getWriter();
		HttpSession session=request.getSession();
		session.setAttribute("data", con);
		response.sendRedirect("result.jsp");
//		pw.println("<h1> Number1 is \t"+con.getNum1()+"</h1>");
//		pw.println("<h1> Number2 is \t"+con.getNum2()+"</h1>");
//		pw.println("<h1> Addition is \t"+con.getSum()+"</h1>");
		//	    pw.println("<h1> Addition is \t"+sum+"</h1>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
