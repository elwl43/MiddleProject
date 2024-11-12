package kr.or.ddit.notice.dao;

import java.util.List;
import java.util.Map;

import kr.or.ddit.notice.vo.NoticeVO;


public interface INoticeDao {
	/**
	 * 공지사항 등록
	 * @param nv
	 * @return
	 */
	public int insertNotice (NoticeVO nv);
	/**
	 * 공지사항 수정
	 * @param nv
	 * @return
	 */	
	public int updateNotice (NoticeVO nv);
	/**
	 * 공지사항 삭제
	 * @param nv
	 * @return
	 */
	public int deleteNotice (int notNo);
	/**
	 * 공지사항 전체리스트
	 * @param nv
	 * @return
	 */
	public List<NoticeVO> allNoctice(); 
	
	/**
	 * 공지사항 상세정보
	 * @param nv
	 * @return
	 */
	public  NoticeVO detailNotice (int notNo);
	
	
	/**
	 * 공지사항 검색
	 * @param nv
	 * @return
	 */
	public List<NoticeVO> searchNotice(String notTitle);
	
	/**
	 * 전체 게시글 갯수 조회
	 * @param nv
	 * @return
	 */
	public int countNoticeList(Map<String, Object>map);
	
	/**
	 * 공지사항 범위별 게시글 조회
	 * @param nv
	 * @return
	 */
	public List<NoticeVO> noticeList(Map<String, Object>map);
	
	
}
