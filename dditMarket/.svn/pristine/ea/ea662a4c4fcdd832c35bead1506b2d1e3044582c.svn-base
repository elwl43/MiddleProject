package kr.or.ddit.notice.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import kr.or.ddit.notice.service.INoticeSerivce;
import kr.or.ddit.notice.service.NoticeServiceImpl;
import kr.or.ddit.notice.vo.NoticeVO;

@WebServlet("/noticelist.do")
public class ListNoticeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public ListNoticeController() {
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String notTitle = req.getParameter("searchnotice"); // 아까 넣어준걸 꺼낸다. get이니까 검색값이 getParameter 들어감
		
		INoticeSerivce noticeSerivce = NoticeServiceImpl.getInstance();
		
		
		int currentPage =1;
		
		currentPage = req.getParameter("page") == null ? 1 : Integer.parseInt(req.getParameter("page"));
		
		//검색(notTitle > map 넣어주기)
		//제목 넣기
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("notTitle",notTitle);
		
		//전체 글 갯수
		int totalCount = noticeSerivce.countNoticeList(map);
		
		//화면에 표시될 페이지수
		int perPage= 5;
		
		//한 페이지 당 출력할 글 갯수
		int perList= 10;
		
		//전체 페이지 수 = 전체 글 갯수(totalCount) / 페이지 당 글 갯수(perList)
		// 행변환으로 정확한 값 도출
		int totalPage= (int)Math.ceil((double)totalCount / (double)perList);
		System.out.println("totalPage" + totalPage);
		
		//페이지 별 게시글 범위 (시작 ~끝) 구하기
		int start = (currentPage -1) * perList +1;
		
		int end = start + perList -1;
		if(end > totalCount) end = totalCount; //전체 글 갯수 값 조절
		
		//페이지 범위(시작페이지~ 끝 페이지) 구하기
		int startPage = ((currentPage -1 )/ perPage * perPage) +1 ;
		
		int endPage = startPage + perPage -1;
		if(endPage >totalPage) endPage = totalPage;
		 
		map.put("start",start);
		map.put("end",end);
		
		
		List<NoticeVO> noticelist = noticeSerivce.noticeList(map);
		System.out.println("noticelist" + noticelist);
		
		
		//request에 결과데이터를 담아서 페이지로 전달
				req.setAttribute("noticelist", noticelist);
				req.setAttribute("str", start); 
				req.setAttribute("sPage", startPage);
				req.setAttribute("ePage", endPage);
				req.setAttribute("ttPage", totalPage);
				req.setAttribute("cPage", currentPage); 
				req.getRequestDispatcher("/views/notice/list.jsp?page="+currentPage).forward(req, resp);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("여기로 들어옵니다. ");
		doGet(req, resp);
	}
	
}
