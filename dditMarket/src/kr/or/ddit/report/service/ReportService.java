package kr.or.ddit.report.service;

import java.util.List;

import kr.or.ddit.report.dao.IReportDao;
import kr.or.ddit.report.dao.ReportDao;
import kr.or.ddit.report.vo.ReportBoardVO;
import kr.or.ddit.report.vo.ReportVO;

public class ReportService implements IReportService {

	private static IReportService service;
	private IReportDao reportDao;

	private ReportService() {
		reportDao = ReportDao.getInstance();
	}

	public static IReportService getInstance() {
		if (service == null)
			service = new ReportService();
		return service;
	}

	@Override
	public int report(ReportVO rv) {
		return reportDao.report(rv);
	}

	@Override
	public List<ReportBoardVO> reportBoard() {
		return reportDao.reportBoard();
	}

	public int ban(int mem_no) {
		return reportDao.ban(mem_no);
	}

	@Override
	public void updateReport(int sale_no) {
		reportDao.updateReport(sale_no);
	}

	@Override
	public List<Integer> blackMemList() {
		return reportDao.blackMemList();
	}

	@Override
	public void banCancel(int mem_no) {
		reportDao.banCancel(mem_no);
	}
}
