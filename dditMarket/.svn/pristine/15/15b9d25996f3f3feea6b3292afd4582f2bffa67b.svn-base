package kr.or.ddit.review.controller;

import java.io.IOException;
import java.util.List;

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
import kr.or.ddit.review.vo.IReviewVO;
import kr.or.ddit.review.vo.ReviewVO;

@MultipartConfig
@WebServlet("/reviewupdate.do")
public class UpdateReview extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		IReviewSerivce reviewSerivce = ReviewService.getInstance();

		int rev_no = Integer.parseInt(req.getParameter("rev_no"));

		IReviewVO irv = reviewSerivce.rvDetail(rev_no);

		// request에 결과데이터를 담아서 페이지로 전달
		req.setAttribute("irv", irv);

		RequestDispatcher disp = req.getRequestDispatcher("/views/review/rvUpdate.jsp");
		
		
		
		disp.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("======================================================================시작");
		IReviewSerivce reviewSerivce = ReviewService.getInstance();

		HttpSession session = req.getSession();
		MemberVO vo = (MemberVO) session.getAttribute("loginCode");

		IAtchFileService fileService = AtchFileServiceImpl.getInstance();

		String rev_content = req.getParameter("rev_content");
		AtchFileVO atchFileVO = fileService.saveAtchFileList(req.getParts());
		int rev_no = Integer.parseInt(req.getParameter("rev_no"));

		ReviewVO rvo = new ReviewVO(rev_content, rev_no);

		if (atchFileVO != null) {
			rvo.setAtchFileId(atchFileVO.getAtchFileId());
		}

		int cnt = reviewSerivce.updateReview(rvo);

		String msg;

		if (cnt > 0) {
			msg = "SUCCESS";
		} else {
			msg = "FAIL";
		}
		req.getSession().setAttribute("msg", msg);
		System.out.println("================================================= ends");
		resp.sendRedirect(req.getContextPath() + "/mprank.do");

	}

}
