package kr.or.ddit.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.board.sailvo.SailBoardVO;
import kr.or.ddit.board.service.BoardService;
import kr.or.ddit.board.service.IBoardService;
import kr.or.ddit.board.vo.BoardVO;
import kr.or.ddit.file.Service.AtchFileServiceImpl;
import kr.or.ddit.file.Service.IAtchFileService;
import kr.or.ddit.file.vo.AtchFileVO;
import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.rank.service.IRankService;
import kr.or.ddit.rank.service.RankService;

@WebServlet("/saleDetail.do")
public class SaleDetail extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		MemberVO vo = (MemberVO) session.getAttribute("loginCode");
		IBoardService boardService = BoardService.getInstance();
//		int rp_no = (boardService.getRPCount() + 1);
		int sale_no = Integer.parseInt(req.getParameter("sale_no"));
		String mem_no = vo.getMem_no();

		BoardVO bv = new BoardVO(sale_no, mem_no);

		boardService.insertRtPage(bv);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		MemberVO vo = (MemberVO) session.getAttribute("loginCode");
		try {
			if (vo.getMem_no() != null) {
				doPost(req, resp);
			}
		} catch (Exception e) {
			
		}
		int sale_no = Integer.parseInt(req.getParameter("sale_no"));

		IBoardService boardService = BoardService.getInstance();
		IRankService rankService = RankService.getInstance();
		IAtchFileService fileService = AtchFileServiceImpl.getInstance();

		SailBoardVO sbd = boardService.saleDetail(sale_no);

		req.setAttribute("sbd", sbd);

		if (sbd.getAt_file_id() > 0) { // 첨부파일이 존재하는 경우

			AtchFileVO atchFileVO = new AtchFileVO();
			atchFileVO.setAtchFileId(sbd.getAt_file_id());
			atchFileVO = fileService.getAtchFile(atchFileVO);
			req.setAttribute("atchFileVO", atchFileVO);
		}
		SailBoardVO memNm = boardService.saleMemNm(sale_no);

		req.setAttribute("memNm", memNm);

		SailBoardVO salect = boardService.salect(sale_no);

		req.setAttribute("salect", salect);
		
		int count = boardService.getWant(sale_no);

		req.setAttribute("wantCount", count);
		
		req.getRequestDispatcher(req.getContextPath() + "/sdrank.do").forward(req, resp);
	}

}
