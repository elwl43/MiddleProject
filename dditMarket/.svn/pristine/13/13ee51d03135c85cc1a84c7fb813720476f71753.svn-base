package kr.or.ddit.board.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.board.service.BoardService;
import kr.or.ddit.board.service.IBoardService;

@WebServlet("/buy.do")
public class buySale extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IBoardService boardService = BoardService.getInstance();

		int sale_no = Integer.parseInt(req.getParameter("sale_no"));
		int mem_no = Integer.parseInt(req.getParameter("mem_no"));
		String trade_method = req.getParameter("trade_method");

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("sale_no", sale_no);
		map.put("mem_no", mem_no);
		map.put("trade_method", trade_method);

		int cnt = boardService.buySale(map);
		
		boardService.buyUpdateSale(sale_no);
		
		resp.sendRedirect(req.getContextPath() + "/index.do");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
