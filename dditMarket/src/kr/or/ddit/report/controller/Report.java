package kr.or.ddit.report.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.report.service.IReportService;
import kr.or.ddit.report.service.ReportService;
import kr.or.ddit.report.vo.ReportVO;

@MultipartConfig
@WebServlet("/report.do")
public class Report extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int sale_no = Integer.parseInt(req.getParameter("sale_no"));
		int mem_no = Integer.parseInt(req.getParameter("mem_no"));
		int re_ctgy_id = Integer.parseInt(req.getParameter("reportCate"));
		
		ReportVO rv = new ReportVO(sale_no, mem_no, re_ctgy_id);
				
		IReportService service = ReportService.getInstance();
		
		int cnt = service.report(rv);
		
		if(cnt > 0) {
			System.out.println("입력성공");
			req.setAttribute("report", 1);
		}			
		
		resp.sendRedirect("/index.do");
	}

}
