package kr.or.ddit.board.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.board.sailvo.SailBoardVO;
import kr.or.ddit.board.service.BoardService;
import kr.or.ddit.board.service.IBoardService;
import kr.or.ddit.file.Service.AtchFileServiceImpl;
import kr.or.ddit.file.Service.IAtchFileService;
import kr.or.ddit.file.vo.AtchSmpleVO;

@MultipartConfig
@WebServlet("/recentpage.do")
public class RecentPage extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		IBoardService boardService = BoardService.getInstance();
		IAtchFileService atchFileService = AtchFileServiceImpl.getInstance();

		int mem_no = Integer.parseInt(req.getParameter("mem_no"));

		List<SailBoardVO> recentPage = boardService.recentPage(mem_no);
		List<AtchSmpleVO> smpleList = atchFileService.getAtchSmple();

		req.setAttribute("recentPage", recentPage);
		req.setAttribute("smpleList", smpleList);

		req.getRequestDispatcher(req.getContextPath() + "/recentPage.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
