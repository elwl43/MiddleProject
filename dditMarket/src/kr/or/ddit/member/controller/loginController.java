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

import kr.or.ddit.admin.service.AdminService;
import kr.or.ddit.admin.service.IAdminService;
import kr.or.ddit.admin.vo.AdminVO;
import kr.or.ddit.member.service.IMemberService;
import kr.or.ddit.member.service.MemberService;
import kr.or.ddit.member.vo.MemberVO;

@WebServlet("/login.do")
public class loginController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public loginController() {
        super();
    }

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/loginForm").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uId = req.getParameter("userId");
		String uPw = req.getParameter("userPw");
		
		Map<String, Object> map = new HashMap();
		
		map.put("uId", uId);
		map.put("uPw", uPw);
		
		String memId = null;
		MemberVO mv = null;
		String adminId = null;
		AdminVO adV = null;
		
		IMemberService memberService = MemberService.getInstance();
		IAdminService  adminService = AdminService.getInstance();
		
		adminId = adminService.loginChk(map);
		
		if (adminId != null) {
			adV = adminService.getAdmin(adminId);
			
			HttpSession session = req.getSession();
			session.setAttribute("adminCode", adV);
			
			req.getRequestDispatcher("/index.do").forward(req, resp);
		} else {
			memId = memberService.loginChk(map);
			mv = memberService.getMember(memId);
			
			if(memId != null) {
				HttpSession session = req.getSession(); 
				session.setAttribute("loginCode", mv);
				
				String loginSuccess = "loginSuccess";
				req.setAttribute("loginSuccess", loginSuccess);
				req.getRequestDispatcher("/index.do").forward(req, resp);
			} else {
				String loginFail = "loginFail";
				req.setAttribute("loginFail", loginFail);
				req.getRequestDispatcher("loginForm.jsp").forward(req, resp);
			}
		} 
//		req.getRequestDispatcher("/index.do").forward(req, resp);
	}
}
