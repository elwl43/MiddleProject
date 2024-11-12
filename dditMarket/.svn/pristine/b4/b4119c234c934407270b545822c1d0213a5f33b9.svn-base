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
@WebServlet("/noticeinsert.do")
public class InsertNoticeController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/notice/insert.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
 	String notTitle =req.getParameter("notTitle");
	String notContent = req.getParameter("notContent");
	
	INoticeSerivce noticeSerivce = NoticeServiceImpl.getInstance();
	
	NoticeVO nv = new NoticeVO();
	nv.setNotTitle(notTitle);
	nv.setNotContent(notContent);
	
	int cnt = noticeSerivce.insertNotice(nv);
	
	String msg = "";
	
	if(cnt > 0) {
		msg="성공";
	}else {
		msg="실패";
	}
	req.getSession().setAttribute("msg", msg);
	
	resp.sendRedirect(req.getContextPath()+ "/noticelist.do");
	
	
	}

}
