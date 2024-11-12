package kr.or.ddit.notice.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.notice.vo.NoticeVO;

public interface INoticeSerivce {
	public int insertNotice(NoticeVO nv);

	public int updateNotice(NoticeVO nv);

	public int deleteNotice(int notNo);

	public List<NoticeVO> allNoctice();

	public NoticeVO detailNotice(int notNo);

	public List<NoticeVO> searchNotice(String notTitle);
	
	//전체 게시글 갯구 조회
	public int countNoticeList(Map<String, Object>map);
	
	//범위별 게시글 조회
	public List<NoticeVO> noticeList(Map<String, Object>map);
}
