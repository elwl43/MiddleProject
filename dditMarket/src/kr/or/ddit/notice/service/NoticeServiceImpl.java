package kr.or.ddit.notice.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.notice.dao.INoticeDao;
import kr.or.ddit.notice.dao.NoticeDaoImpl;
import kr.or.ddit.notice.vo.NoticeVO;

public class NoticeServiceImpl implements INoticeSerivce {

//		dao > service 싱글톤
	private static INoticeSerivce noticeService = new NoticeServiceImpl();

	private INoticeDao noticeDao;

	private NoticeServiceImpl() {
		noticeDao = NoticeDaoImpl.getinstance();
	}
	public static INoticeSerivce getInstance() {
		if(noticeService == null) noticeService = new NoticeServiceImpl();
		return noticeService;
	}

	/**
	 * 공지사항 등록 
	 */
	@Override
	public int insertNotice(NoticeVO nv) {

		int cnt = noticeDao.insertNotice(nv);
		
		return cnt;
	}
	
	/**
	 * 공지사항 수정 
	 */
	@Override
	public int updateNotice(NoticeVO nv) {
		
		int cnt = noticeDao.updateNotice(nv);
		
		return cnt;
	}
	
	/**
	 * 공지사항 삭제
	 */
	@Override
	public int deleteNotice(int notNo) {
		
		int cnt = noticeDao.deleteNotice(notNo);
		
		return cnt;
	}
// 	공지사항 전체리스트 조회
	@Override
	public List<NoticeVO> allNoctice() {
		
		List<NoticeVO> noticeList = noticeDao.allNoctice();
		return noticeList;
	}

	/**
	 * 공지사항 상세정보 
	 */
	@Override
	public NoticeVO detailNotice(int notNo) {
		
		return noticeDao.detailNotice(notNo);
	}
	/**
	 * 공지사항 검색 
	 */
	@Override
	public List<NoticeVO> searchNotice(String notTitle) {
		
		
		return noticeDao.searchNotice(notTitle);
	}
	
	
	
	@Override
	public int countNoticeList(Map<String , Object> map) {

		return noticeDao.countNoticeList(map);
	}
	@Override
	public List<NoticeVO> noticeList(Map<String, Object> map) {

		return noticeDao.noticeList(map);
	}

}
