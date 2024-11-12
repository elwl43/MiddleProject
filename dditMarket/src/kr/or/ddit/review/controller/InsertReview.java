package kr.or.ddit.review.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
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
import kr.or.ddit.review.service.IReviewSerivce;
import kr.or.ddit.review.service.ReviewService;
import kr.or.ddit.review.vo.ReviewVO;

@MultipartConfig
@WebServlet("/reviewinsert.do")
public class InsertReview extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher disp = req.getRequestDispatcher("/views/review/rvInsert.jsp");
		disp.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IReviewSerivce reviewSerivce = ReviewService.getInstance();

		HttpSession session = req.getSession();
		MemberVO vo = (MemberVO) session.getAttribute("loginCode");

		IAtchFileService fileService = AtchFileServiceImpl.getInstance();

		int rev_no = (reviewSerivce.countReviewList() + 1);

		String mem_no = vo.getMem_no();
		int sale_no = Integer.parseInt(req.getParameter("sale_no"));
		AtchFileVO atchFileVO = fileService.saveAtchFileList(req.getParts());
		String rev_content = req.getParameter("rev_content");

		ReviewVO rvo = new ReviewVO(rev_no, mem_no, sale_no, rev_content);

		if (atchFileVO != null) {
			rvo.setAtchFileId(atchFileVO.getAtchFileId());
		}

		int cnt = reviewSerivce.insertReview(rvo);
		reviewSerivce.updateRvEx(sale_no);

		String msg;

		if (cnt > 0) {
			msg = "SUCCESS";
		} else {
			msg = "FAIL";
		}
		req.getSession().setAttribute("msg", msg);

		resp.sendRedirect(req.getContextPath() + "/myBuy.do");

	}

}
