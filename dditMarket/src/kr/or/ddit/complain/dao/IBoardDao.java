package kr.or.ddit.complain.dao;

import java.util.List;
import java.util.Map;
import kr.or.ddit.complain.vo.BoardVO;

public interface IBoardDao {


	//범위별 게시글 조회
	public List<BoardVO> boardList(Map<String, Object> map);
		
	//게시글 추가
	public int insertComplain (BoardVO bv);
	
	//전체 조회
	public List<BoardVO> allBoard();

	//상세 조회
	public BoardVO detailBoard(int cmpNo);

	//게시글 수정
	public int updateBoard(BoardVO bv);

	//게시글 삭제
	public int deleteBoard(int cmp_no); 
	
	//게시글 검색
	public List<BoardVO> searchBoard(String searchType, String searchKeyword);
		
	//검색된 게시글 갯수 조회
	public int countSearchList(Map<String, Object> searchMap);

	//검색된 게시글 리스트 조회
	public List<BoardVO> searchBoardList(Map<String, Object> searchMap);

	public int countList(Map<String, Object> searchMap);

	//처리내역 조회
	public BoardVO confirmList(int cmp_no);


}
