package kr.or.ddit.report.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.report.service.IReportService;
import kr.or.ddit.report.service.ReportService;
import kr.or.ddit.report.vo.ReportBoardVO;

@WebServlet("/reportBoard.do")
public class ReportBoard extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		IReportService service = ReportService.getInstance();
		
		List<ReportBoardVO> reportList = new ArrayList<ReportBoardVO>();
		
		reportList = service.reportBoard();		
		
		req.setAttribute("reportList", reportList);
		
		req.getRequestDispatcher("/reportBoard.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
