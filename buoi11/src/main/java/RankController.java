import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RankController
 */
@WebServlet("/rank")
public class RankController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Rank> list;
	private Comparator<Rank> comparator;
	private boolean isWin;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RankController() {
		super();
		list = new ArrayList<>();
		comparator = Comparator.comparing(Rank::getAttempt);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		list.sort(comparator);
		request.setAttribute("list", list);
		request.getRequestDispatcher("rank.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		list.add(new Rank(request.getParameter("name"),
				Integer.parseInt(request.getSession().getAttribute("count").toString())));
		isWin = true;
		request.getSession().setAttribute("isWin", isWin);
		response.sendRedirect(request.getContextPath());
	}
}
