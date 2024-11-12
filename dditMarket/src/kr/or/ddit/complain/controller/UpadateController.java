package kr.or.ddit.complain.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.complain.service.BoardServiceImpl;
import kr.or.ddit.complain.service.IBoardService;
import kr.or.ddit.complain.vo.BoardVO;

@MultipartConfig
@WebServlet("/complainupdate.do")
public class UpadateController extends HttpServlet{ 

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int cmp_no = Integer.valueOf(req.getParameter("cmpNo"));
		String cmp_title = String.valueOf(req.getParameter("cmp_title"));
		String cmp_content = String.valueOf(req.getParameter("cmp_content"));
//		System.out.println("cmp >>>>"+cmp_No);
		
		IBoardService boardSerivce = BoardServiceImpl.getInstance();
		
//		BoardVO bv = boardSerivce.detailBoard(cmpNo);
		BoardVO bv = boardSerivce.detailBoard(cmp_no, cmp_title, cmp_content);
		
		req.setAttribute("bv", bv);
		
		req.getRequestDispatcher("complainUpdate.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//	int cmpNo = Integer.valueOf(req.getParameter("cmpNo"));
//	String cmpTitle = req.getParameter("cmpTitle");
//	String cmpContent = req.getParameter("cmpContent");
	int cmp_no = Integer.valueOf(req.getParameter("cmp_no"));
	String cmp_title = req.getParameter("cmp_title");
	String cmp_content = req.getParameter("cmp_content");
	
	IBoardService boardService = BoardServiceImpl.getInstance();
	
	BoardVO bv = new BoardVO();
	bv.setCmp_no(cmp_no);
	bv.setCmp_title(cmp_title);
	bv.setCmp_content(cmp_content);
	
	int cnt = boardService.updateBoard(bv);
	
	String msg = "";
	
	if(cnt >0) {
		msg = "성공";
		
	}else {
		msg = "실패";
	}
	req.getSession().setAttribute("msg", msg);
	
	resp.sendRedirect(req.getContextPath()+ "/Main");
//	resp.sendRedirect(req.getContextPath()+ "/complainupdate.do");
	}
}	
