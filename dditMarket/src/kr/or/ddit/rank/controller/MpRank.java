package kr.or.ddit.rank.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.board.service.BoardService;
import kr.or.ddit.board.service.IBoardService;
import kr.or.ddit.file.Service.AtchFileServiceImpl;
import kr.or.ddit.file.Service.IAtchFileService;
import kr.or.ddit.file.vo.AtchFileVO;
import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.rank.service.IRankService;
import kr.or.ddit.rank.service.RankService;

@WebServlet("/mprank.do")
public class MpRank extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MpRank() {
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		IRankService rankService = RankService.getInstance();
		IBoardService boardService = BoardService.getInstance();
		IAtchFileService fileService = AtchFileServiceImpl.getInstance();

		HttpSession session = req.getSession();
		MemberVO vo = (MemberVO) session.getAttribute("loginCode");

		int mem_no = Integer.valueOf(vo.getMem_no());
		int salecount = rankService.sailCount(mem_no);
		int buycount = rankService.buyCount(mem_no);
		int scount = salecount + buycount;
		int buy = boardService.buyPrice(mem_no);
		int sell = boardService. sellPrice(mem_no);
		int total = sell - buy;
		
		System.out.println(">>>>>>>>>>>>>>>>>"+buy+sell+total);
		req.setAttribute("totalPrice", total);
		req.setAttribute("scount", scount);

		if (scount <= 3) {
			AtchFileVO atchFileVO = new AtchFileVO();
			atchFileVO.setAtchFileId(78);
			atchFileVO = fileService.getAtchFile(atchFileVO);
			req.setAttribute("atchFileVO", atchFileVO);
		} else if (scount > 3 && scount <= 4) {
			AtchFileVO atchFileVO = new AtchFileVO();
			atchFileVO.setAtchFileId(79);
			atchFileVO = fileService.getAtchFile(atchFileVO);
			req.setAttribute("atchFileVO", atchFileVO);
		} else {
			AtchFileVO atchFileVO = new AtchFileVO();
			atchFileVO.setAtchFileId(81);
			atchFileVO = fileService.getAtchFile(atchFileVO);
			req.setAttribute("atchFileVO", atchFileVO);
		}

		req.getRequestDispatcher("/myPage.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
