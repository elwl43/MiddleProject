package kr.or.ddit.board.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
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

@WebServlet(value = "/index.do")
public class SailList extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String sale_title = req.getParameter("search");
		String prod_ctgy_id = req.getParameter("prod_ctgy_id");
		
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		if (sale_title != null) {
			map.put("sale_title", sale_title);
			System.out.println("제목 : " + sale_title);
		} else if (prod_ctgy_id != null) {
			map.put("prod_ctgy_id", prod_ctgy_id);
			System.out.println("카테고리 넘버 : " + prod_ctgy_id);
		}
		
		IBoardService boardService = BoardService.getInstance();
		IAtchFileService atchFileService = AtchFileServiceImpl.getInstance();
		
//		판매 상품 VO 카테고리, 제목에 따른 상품 출력 가능
		List<SailBoardVO> sailList = boardService.getTotalSail(map);
		List<AtchSmpleVO> smpleList = atchFileService.getAtchSmple();
		
		req.setAttribute("sailList", sailList);
		req.setAttribute("smpleList", smpleList);
		
		System.out.println("전송");
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
