import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GameController
 */
@WebServlet("/play")
public class GameController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int random, count;
	private String msg;
	private boolean isCorrect;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GameController() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println(random());
	}

	private int random() {
		int min = 1, max = 1000;
		random = new Random().nextInt(max - min + 1) + min;
		return random;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (request.getSession().getAttribute("isWin") != null) {
			System.out.println(random());
			msg = "";
			isCorrect = false;
			count = 0;
			request.getSession().removeAttribute("isWin");
		}
		request.setAttribute("msg", msg);
		request.setAttribute("isCorrect", isCorrect);
		request.getSession().setAttribute("count", count);
		request.getRequestDispatcher("play.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (Integer.parseInt(request.getParameter("num")) == random) {
			msg = "Ban da doan dung!";
			isCorrect = true;
		} else {
			if (Integer.parseInt(request.getParameter("num")) < random)
				msg = "So vua doan nho hon dap an!";
			if (Integer.parseInt(request.getParameter("num")) > random)
				msg = "So vua doan lon hon dap an!";
			isCorrect = false;
		}
		count++;
		doGet(request, response);
	}
}
