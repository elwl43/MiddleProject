package kr.or.ddit.report.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.report.service.IReportService;
import kr.or.ddit.report.service.ReportService;

@WebServlet("/banCancel.do")
public class BanCancel extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int mem_no = Integer.parseInt(req.getParameter("mem_no"));

		IReportService service = ReportService.getInstance();


		service.banCancel(mem_no);

		resp.sendRedirect(req.getContextPath() + "/memberBoard.do");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
