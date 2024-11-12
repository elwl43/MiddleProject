package kr.or.ddit.member.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.member.service.IMemberService;
import kr.or.ddit.member.service.MemberService;

@WebServlet("/memUpdate.do")
public class memUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("memViews/updateMemberInfo.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String mId = req.getParameter("mem_id");
		String mPw = req.getParameter("mem_pw");
		String mTel = req.getParameter("mem_tel");
		String mLoc = req.getParameter("loc");
		String mAddr = req.getParameter("mem_addr");
		String mAddr2 = req.getParameter("mem_addr2");
		String mMail = req.getParameter("mem_mail");
		
		Map<String, Object> map = new HashMap();
		
		map.put("mId", mId);
		map.put("mPw", mPw);
		map.put("mTel", mTel);
		map.put("mLoc", mLoc);
		map.put("mAddr", mAddr);
		map.put("mAddr2", mAddr2);
		map.put("mMail", mMail);
		
		IMemberService memberService = MemberService.getInstance();
		int res = memberService.updateMember(map);
		
		System.out.println(res);
		HttpSession session = req.getSession();
		
		session.removeAttribute("loginCode");
		
		req.getRequestDispatcher("/index.do").forward(req, resp);
	}

}
