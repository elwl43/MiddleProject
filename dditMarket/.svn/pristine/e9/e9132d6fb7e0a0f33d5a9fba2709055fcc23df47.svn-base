package kr.or.ddit.board.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.board.sailvo.SailBoardVO;
import kr.or.ddit.board.service.BoardService;
import kr.or.ddit.board.service.IBoardService;
import kr.or.ddit.file.Service.AtchFileServiceImpl;
import kr.or.ddit.file.Service.IAtchFileService;
import kr.or.ddit.file.vo.AtchSmpleVO;
import kr.or.ddit.member.vo.MemberVO;

@WebServlet(value = "/myBuy.do")
public class BuyBoardList extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		IBoardService boardService = BoardService.getInstance();
		IAtchFileService atchFileService = AtchFileServiceImpl.getInstance();

		HttpSession session = req.getSession();
		MemberVO vo = (MemberVO) session.getAttribute("loginCode");

		int mem_no = Integer.parseInt(vo.getMem_no());

		List<SailBoardVO> buyboardList = boardService.getTotalBuyList(mem_no);
		List<SailBoardVO> buyboardListNl = boardService.getTotalBuyListNl(mem_no);
		List<AtchSmpleVO> smpleList = atchFileService.getAtchSmple();

		req.setAttribute("buyboardList", buyboardList);
		req.setAttribute("buyboardListNl", buyboardListNl);
		req.setAttribute("smpleList", smpleList);

		req.getRequestDispatcher("/myBuy.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
