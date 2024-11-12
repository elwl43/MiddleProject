package kr.or.ddit.complain.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.complain.service.BoardServiceImpl;
import kr.or.ddit.complain.service.IBoardService;
import kr.or.ddit.complain.vo.BoardVO;

@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Main() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int currentPage = 1; // 현재 페이지
		currentPage = request.getParameter("page") == null ? 1 : Integer.parseInt(request.getParameter("page"));

		String searchType = request.getParameter("searchType"); // 검색 유형
		String searchKeyword = request.getParameter("searchKeyword"); // 검색 키워드
		System.out.println("============================================================");
		System.out.println("검색유형 : " + searchType + "," + "검색키워드 : " + searchKeyword);
		System.out.println("============================================================");
		System.out.println(searchKeyword);

		// 검색 결과 갯수 조회
		Map<String, Object> searchMap = new HashMap<String, Object>();
		searchMap.put("searchType", searchType);
		searchMap.put("searchKeyword", searchKeyword);

		// 범위 별 게시물 가져오기
		IBoardService boardService = BoardServiceImpl.getInstance();
		List<BoardVO> boardList = boardService.searchBoardList(searchMap);
		System.out.println("============================================================검색");
		System.out.println(boardList);

		// 전체 글 갯수
		int totalCount = boardService.countList(searchMap);
		System.out.println("totalCount" + totalCount);

		// 화면에 표시될 페이지의 수
		int perPage = 10;

		// 한 페이지 당 출력할 글 갯수
		int perList = 5;

		// ◆전체 페이지 수 = 전체 글 갯수(totalCount) / 페이지 당 글 갯수(perList)
		// *형 변환으로 정확한 값을 도출
//		int totalPage = 21 / perList; //5page가 나와야 하지만 그렇지 못함 
		int totalPage = (int) Math.ceil((double) totalCount / (double) perList);
		System.out.println("totalPage" + totalPage);

		// ◆페이지 별 게시글 범위(start ~ end) 구하기
		// start = (currentPage - 1) * perList + 1;
		// 1page: (1-1)*5+1 = 1 | 2page: (2-1)*5+1 = 6 | 3page: (3-1)*5+1 = 11 | 4page:
		// (4-1)*5+1 = 16
		int start = (currentPage - 1) * perList + 1;

		// end = start + perList - 1;
		// 1page: 1+5-1 = 5 | 2page: 6+5-1 = 10 | 3page: 11+5-1 = 15 | 4page: 16+5-1 =
		// 20
		// 5page: 21+5-1 = 25
		int end = start + perList - 1;
		if (end > totalCount)
			end = totalCount; // *전체 글 갯수 초과 값 조절

		// ◆페이지 범위(startPage ~ endPage) 구하기
		// startPage = ((currentPage - 1) / perPage * perPage) + 1;
		int startPage = ((currentPage - 1) / perPage * perPage) + 1;

		// endPage = startPage + perPage - 1;
		int endPage = startPage + perPage - 1;
		if (endPage > totalPage)
			endPage = totalPage;

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("start", start);
		map.put("end", end);

		List<BoardVO> list = new ArrayList<BoardVO>();
		
//		//범위 별 게시물 가져오기
		if (searchType == null) {
			list = boardService.boardList(map);
			System.out.println("list" + list);
		}else {
			list = boardList;
		}

//		HttpSession session = request.getSession();
//		session.setAttribute("listDetail", list);

		// request에 결과데이터를 담아서 페이지로 전달
		request.setAttribute("list", list);
		request.setAttribute("str", start); // 게시글 순번 적용시 전체 게시물에 순차적인 넘버링을 적용하기 위해 사용(str + index)
		request.setAttribute("sPage", startPage);
		request.setAttribute("ePage", endPage);
		request.setAttribute("ttPage", totalPage);
		request.setAttribute("cPage", currentPage); // 페이지번호 활성화 조건으로 사용
		request.getRequestDispatcher("/complainBoard.jsp?page=" + currentPage).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
