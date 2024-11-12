package kr.or.ddit.complain.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.complain.service.BoardServiceImpl;
import kr.or.ddit.complain.service.IBoardService;
import kr.or.ddit.complain.vo.BoardVO;

@WebServlet("/complainDetail.do")
public class DetailList extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int cmpNo = Integer.valueOf(req.getParameter("cmpNo"));
		String cmpTitle = String.valueOf(req.getParameter("cmpTitle"));
		String cmpContent = String.valueOf(req.getParameter("cmpContent"));
		
		IBoardService boardSerivce = BoardServiceImpl.getInstance();
			
		BoardVO bv = boardSerivce.detailBoard(cmpNo, cmpTitle, cmpContent);
		
		req.setAttribute("bv", bv);
		
		req.getRequestDispatcher("/complainDetail.jsp").forward(req, resp);
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
