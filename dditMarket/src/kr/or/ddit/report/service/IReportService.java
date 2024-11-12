package kr.or.ddit.report.service;

import java.util.List;

import kr.or.ddit.report.vo.ReportBoardVO;
import kr.or.ddit.report.vo.ReportVO;

public interface IReportService {

	public int report(ReportVO rv);
	
	public List<ReportBoardVO> reportBoard();
	
	public int ban(int mem_no);

	public void updateReport(int sale_no);

	public List<Integer> blackMemList();

	public void banCancel(int mem_no);
}
