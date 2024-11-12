package kr.or.ddit.report.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.report.service.IReportService;
import kr.or.ddit.report.service.ReportService;

@WebServlet("/ban.do")
public class Ban extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int sale_no = Integer.parseInt(req.getParameter("sale_no"));
		int mem_no = Integer.parseInt(req.getParameter("mem_no"));

		IReportService service = ReportService.getInstance();

		int cnt = service.ban(mem_no);

		if (cnt > 0) {
			service.updateReport(sale_no);
		}

		resp.sendRedirect(req.getContextPath() + "/reportBoard.do");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
