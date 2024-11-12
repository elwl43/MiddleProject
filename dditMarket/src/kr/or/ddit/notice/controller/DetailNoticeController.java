package kr.or.ddit.notice.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.notice.service.INoticeSerivce;
import kr.or.ddit.notice.service.NoticeServiceImpl;
import kr.or.ddit.notice.vo.NoticeVO;

@WebServlet("/noticedetail.do")
public class DetailNoticeController extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//String x > Integer.valueOf 받으면 ok
		
		int notNo = Integer.valueOf(req.getParameter("notNo"));
		INoticeSerivce noticeSerivce = NoticeServiceImpl.getInstance();
			
		NoticeVO nv = noticeSerivce.detailNotice(notNo);
		
		req.setAttribute("nv", nv);
		
		req.getRequestDispatcher("/views/notice/detail.jsp").forward(req, resp);
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
