package kr.or.ddit.rank.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.file.Service.AtchFileServiceImpl;
import kr.or.ddit.file.Service.IAtchFileService;
import kr.or.ddit.file.vo.AtchFileVO;
import kr.or.ddit.rank.service.IRankService;
import kr.or.ddit.rank.service.RankService;

@WebServlet("/sdrank.do")
public class SdRank extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SdRank() {
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IRankService rankService = RankService.getInstance();
		IAtchFileService fileService = AtchFileServiceImpl.getInstance();

		HttpSession session = req.getSession();

		int mem_no = Integer.parseInt(req.getParameter("mem_no"));
		int salecount = rankService.sailCount(mem_no);
		int buycount = rankService.buyCount(mem_no);

		int scount = salecount + buycount;
		req.setAttribute("scount", scount);

		if (scount <= 3) {
			AtchFileVO atchFileVOs = new AtchFileVO();
			atchFileVOs.setAtchFileId(78);
			atchFileVOs = fileService.getAtchFile(atchFileVOs);
			req.setAttribute("atchFileVOs", atchFileVOs);
		} else if (scount > 3 && scount <= 4) {
			AtchFileVO atchFileVOs = new AtchFileVO();
			atchFileVOs.setAtchFileId(79);
			atchFileVOs = fileService.getAtchFile(atchFileVOs);
			req.setAttribute("atchFileVOs", atchFileVOs);
		} else {
			AtchFileVO atchFileVOs = new AtchFileVO();
			atchFileVOs.setAtchFileId(81);
			atchFileVOs = fileService.getAtchFile(atchFileVOs);
			req.setAttribute("atchFileVOs", atchFileVOs);
		}

		req.getRequestDispatcher("/saleDetail.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);

	}
}
