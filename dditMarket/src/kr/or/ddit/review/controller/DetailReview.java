package kr.or.ddit.review.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.file.Service.AtchFileServiceImpl;
import kr.or.ddit.file.Service.IAtchFileService;
import kr.or.ddit.file.vo.AtchFileVO;
import kr.or.ddit.review.service.IReviewSerivce;
import kr.or.ddit.review.service.ReviewService;
import kr.or.ddit.review.vo.IReviewVO;

@WebServlet("/reviewDetail.do")
public class DetailReview extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DetailReview() {
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		IReviewSerivce reviewSerivce = ReviewService.getInstance();

		int rev_no = Integer.parseInt(req.getParameter("rev_no"));

		IReviewVO irv = reviewSerivce.rvDetail(rev_no);

		if (irv.getAT_FILE_ID() > 0) { // 첨부파일이 존재하는 경우
			IAtchFileService fileService = AtchFileServiceImpl.getInstance();
			
			AtchFileVO atchFileVO = new AtchFileVO();
			atchFileVO.setAtchFileId(irv.getAT_FILE_ID());
			atchFileVO = fileService.getAtchFile(atchFileVO);

			req.setAttribute("atchFileVO", atchFileVO);
		} 
		
		// request에 결과데이터를 담아서 페이지로 전달
		req.setAttribute("irv", irv);

		req.getRequestDispatcher("/views/review/rvDetail.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
