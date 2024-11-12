package kr.or.ddit.notice.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.notice.service.INoticeSerivce;
import kr.or.ddit.notice.service.NoticeServiceImpl;

@WebServlet("/noticedelete.do")
public class DeleteNoticeController extends HttpServlet {

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		int notNo = Integer.valueOf(req.getParameter("notNo"));
		
		INoticeSerivce noticeSerivce = NoticeServiceImpl.getInstance();
		
		int cnt = noticeSerivce.deleteNotice(notNo);
		
		String msg = "";
		
		if(cnt > 0 ) {
			msg= "성공";
		}else {
			msg = "실패";
		}
		req.getSession().setAttribute("msg", msg);
		
		resp.sendRedirect(req.getContextPath()+ "/noticelist.do");
		
			
			
		
		}
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			doGet(req, resp);
		}
}
