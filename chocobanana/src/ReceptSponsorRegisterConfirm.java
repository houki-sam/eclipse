

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.KyosankigyoBeans;

/**
 * Servlet implementation class ReceptSponsorRegisterConfirm
 */
@WebServlet("/recept/sponsor/register/confirm")
public class ReceptSponsorRegisterConfirm extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReceptSponsorRegisterConfirm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//utf-8変換
		request.setCharacterEncoding("UTF-8");
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/recept/sponsor/register.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//utf-8変換
		request.setCharacterEncoding("UTF-8");

		//協賛企業データ
		KyosankigyoBeans data = new KyosankigyoBeans();

		String a = (String)request.getParameter("seikyuyubinbango");
		data.setSeikyuyubinbango(a);

		//forward
		request.setAttribute("a", a);
		request.setAttribute("data", data);
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/recept/sponsor/register_confirm.jsp");
		rd.forward(request, response);
}

}
