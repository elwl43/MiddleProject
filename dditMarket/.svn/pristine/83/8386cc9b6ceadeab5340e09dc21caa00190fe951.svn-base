package kr.or.ddit.notice.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.notice.service.INoticeSerivce;
import kr.or.ddit.notice.service.NoticeServiceImpl;
import kr.or.ddit.notice.vo.NoticeVO;

@MultipartConfig
@WebServlet("/noticeupdate.do")
public class UpadateNoticeController extends HttpServlet{ 
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int notNo = Integer.valueOf(req.getParameter("notNo"));
		
		INoticeSerivce noticeSerivce = NoticeServiceImpl.getInstance();
		
		NoticeVO nv = noticeSerivce.detailNotice(notNo);
		
		req.setAttribute("nv", nv);
		
		req.getRequestDispatcher("/views/notice/update.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int notNo = Integer.valueOf(req.getParameter("notNo"));
	String notTitle = req.getParameter("notTitle");
	String notContent = req.getParameter("notContent");
	
	INoticeSerivce noticeSerivce = NoticeServiceImpl.getInstance();
	
	NoticeVO nv = new NoticeVO();
	nv.setNotNo(notNo);
	nv.setNotTitle(notTitle);
	nv.setNotContent(notContent);
	
	int cnt = noticeSerivce.updateNotice(nv);
	
	String msg = "";
	
	if(cnt >0) {
		msg = "성공";
		
	}else {
		msg = "실패";
	}
	req.getSession().setAttribute("msg", msg);
	
	resp.sendRedirect(req.getContextPath()+ "/noticelist.do");
	}
}	
