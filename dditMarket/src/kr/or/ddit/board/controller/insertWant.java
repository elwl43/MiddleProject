package kr.or.ddit.board.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.board.service.BoardService;
import kr.or.ddit.board.service.IBoardService;
import kr.or.ddit.board.vo.BoardVO;

@MultipartConfig
@WebServlet("/insertWant.do")
public class insertWant extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher disp = req.getRequestDispatcher("/saleDetail.jsp");
		disp.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IBoardService boardService = BoardService.getInstance();

		int sale_no = Integer.parseInt(req.getParameter("sale_no"));
		String mem_no = req.getParameter("mem_no");

		BoardVO bd = new BoardVO(sale_no, mem_no);
		int chk = boardService.checkWant(bd);
		
		System.out.println("============================================chk");
		System.out.println(chk);
		if (chk == 0) {
			int cnt = boardService.insertWant(bd);

			String msg;

			if (cnt > 0) {
				msg = "SUCCESS";
			} else {
				msg = "FAIL";
			}
			req.getSession().setAttribute("msg", msg);
		}

		resp.sendRedirect(req.getContextPath() + "/index.do");
	}

}
