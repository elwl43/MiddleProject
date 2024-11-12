package kr.or.ddit.member.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.member.service.IMemberService;
import kr.or.ddit.member.service.MemberService;
import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.report.service.IReportService;
import kr.or.ddit.report.service.ReportService;
import kr.or.ddit.report.vo.ReportVO;

@WebServlet("/memberBoard.do")
public class memberBoard extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IMemberService service = MemberService.getInstance();
		IReportService reportService = ReportService.getInstance();

		List<MemberVO> memberList = new ArrayList<MemberVO>();
		List<Integer> blackList = new ArrayList<Integer>();

		memberList = service.memberBoard();
		blackList = reportService.blackMemList();

		req.setAttribute("memberList", memberList);
		req.setAttribute("blackList", blackList);
		
		req.getRequestDispatcher("/memberBoard.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
