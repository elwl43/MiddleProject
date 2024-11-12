package kr.or.ddit.complain.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.complain.service.BoardServiceImpl;
import kr.or.ddit.complain.service.IBoardService;
import kr.or.ddit.complain.vo.BoardVO;
import kr.or.ddit.member.vo.MemberVO;

@MultipartConfig
@WebServlet("/complainInsert.do")
public class InsertConroller extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		RequestDispatcher disp = req.getRequestDispatcher("/complainInsert.jsp");
		disp.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();
		MemberVO mv = (MemberVO) session.getAttribute("loginCode");

		String cmp_title = req.getParameter("title");
		String cmp_ctgy_id = req.getParameter("cmpCtgyId");
		String cmp_content = req.getParameter("cmpContent");
		String cmp_writer = mv.getMem_no();

		IBoardService boardService = BoardServiceImpl.getInstance();

//		HttpSession session = req.getSession();
//		BoardVO vo = (BoardVO) session.getAttribute("loginCode");

//		BoardVO bv = new BoardVO(com_title, cmp_ctgy_id, cmp_content);
		BoardVO bv = new BoardVO(cmp_title, cmp_content, cmp_ctgy_id, cmp_writer);

		System.out.println(cmp_title + ", " + cmp_content + ", " + cmp_ctgy_id + ", " + cmp_writer);

		int cnt = boardService.insertComplain(bv);

		String msg;

		if (cnt > 0) {
			msg = "SUCCESS";
		} else {
			msg = "FAIL";
		} // 포워딩 처리
		req.getSession().setAttribute("msg", msg);

		// redirect 처리
		resp.sendRedirect(req.getContextPath() + "/Main");

	}

}