package adress;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdressServlet1
 */
@WebServlet("/AdressServlet1")
public class AdressServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdressServlet1() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//ボタン名の文字化けを防ぐために文字コードを設定してから取得
		request.setCharacterEncoding("UTF-8");
		String btn = request.getParameter("submit");

		//HttpSession session = request.getSession();
		RequestDispatcher rd;

		if ("送信1".equals(btn)) {
			//入力画面から値を取得
			String post = request.getParameter("post");
			String test1 = request.getParameter("text1");
			String test2 = request.getParameter("text2");

			//値を結合
			String display = post + test1 + test2;

			//リクエストスコープにセット
			request.setAttribute("ads", display);

			//サーブレットからの場所
			rd = request.getRequestDispatcher("./Kadai1/DisplayAdress1.jsp");

		} else {
			String post = request.getParameter("post");
			String test1 = request.getParameter("text1");
			String test2 = request.getParameter("text2");

			//値を結合
			String display = post + test1 + test2;

			//リクエストスコープにセット
			request.setAttribute("ads", display);

			rd = request.getRequestDispatcher("./Kadai2/DisplayAdress2.jsp");
		}

		rd.forward(request, response);

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doPost(request, response);
	}

}
