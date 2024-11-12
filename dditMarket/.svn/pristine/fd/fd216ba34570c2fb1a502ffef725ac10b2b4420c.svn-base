package kr.or.ddit.board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
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
import kr.or.ddit.review.service.IReviewSerivce;
import kr.or.ddit.review.service.ReviewService;
import kr.or.ddit.review.vo.ReviewVO;

@MultipartConfig
@WebServlet("/updateboard.do")
public class UpdateBoard extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("===========================================시작");
		IBoardService boardService = BoardService.getInstance();

		int sale_no = Integer.parseInt(req.getParameter("sale_no"));

		SailBoardVO sbd = boardService.saleDetail(sale_no);

		// request에 결과데이터를 담아서 페이지로 전달
		req.setAttribute("sbd", sbd);

		RequestDispatcher disp = req.getRequestDispatcher("/bdUpdate.jsp");

		disp.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("=====================================================1");
		IBoardService boardService = BoardService.getInstance();

		HttpSession session = req.getSession();
		MemberVO vo = (MemberVO) session.getAttribute("loginCode");

		IAtchFileService fileService = AtchFileServiceImpl.getInstance();

		String sale_title = req.getParameter("saletitle");
		int prod_price = Integer.parseInt(req.getParameter("prodPrice"));
		String trade = req.getParameter("trade");
		String address2 = req.getParameter("address2");
		String address1 = req.getParameter("address1");
		AtchFileVO atchFileVO = fileService.saveAtchFileList(req.getParts());
		String prod_detail = req.getParameter("detail");
		int sale_no = Integer.parseInt(req.getParameter("sale_no"));

		BoardVO bv = new BoardVO(sale_title, prod_price, trade, address2, address1, prod_detail, sale_no);
		System.out.println("==================================================2");
		System.out.println(bv);

		if (atchFileVO != null) {
			bv.setAt_file_id(atchFileVO.getAtchFileId());
		}

		System.out.println(atchFileVO);

		int cnt = boardService.updateBoard(bv);
		System.out.println("==================================================3");
		System.out.println(cnt);

		String msg;

		if (cnt > 0) {
			msg = "SUCCESS";
		} else {
			msg = "FAIL";
		}
		req.getSession().setAttribute("msg", msg);

		resp.sendRedirect(req.getContextPath() + "/index.do");

	}

}
