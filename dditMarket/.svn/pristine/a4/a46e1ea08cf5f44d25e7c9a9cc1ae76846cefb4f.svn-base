package kr.or.ddit.notice.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;
import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;

import com.sun.xml.internal.ws.api.message.HeaderList;

import kr.or.ddit.notice.vo.NoticeVO;
import kr.or.ddit.util.MybatisUtil;

public class NoticeDaoImpl implements INoticeDao {

	private static INoticeDao noticeDao = new NoticeDaoImpl();

	public NoticeDaoImpl() {
	}

	public static INoticeDao getinstance() {

		return noticeDao;
	}
	//임시 페이징처리 떄문에
	public static INoticeDao getInstance() {
		if(noticeDao == null) noticeDao = new NoticeDaoImpl();
		return noticeDao;
	}

	// 공지사항 등록
	@Override
	public int insertNotice(NoticeVO nv) {

		SqlSession session = MybatisUtil.getSqlseSession();

		int cnt = 0;

		try {
			cnt = session.insert("notice.InsertNocice", nv);

			if (cnt > 0) {
				session.commit();
			}
		} catch (PersistenceException e) {
			session.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return cnt;
	}

	// 공지사항 수정
	@Override
	public int updateNotice(NoticeVO nv) {
		SqlSession session = MybatisUtil.getSqlseSession();
		
		int cnt= 0;
		try {
			cnt = session.update("notice.updateNotice",nv);
			
			if (cnt > 0  ) {
				session.commit();
			}
			
		} catch (PersistenceException e) {
			session.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		return cnt;
	}

	// 공지사항 삭제
	@Override
	public int deleteNotice(int notNo) {
		
		SqlSession session = MybatisUtil.getSqlseSession();
		
		int cnt= 0;
		
		try {
			cnt = session.update("notice.deleteNotice",notNo);
			
			if ( cnt > 0) {
				session.commit(); 
			}
			
		} catch (PersistenceException e) {
			session.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
		return cnt;
	}

	// 공지사항 전체리스트
	@Override
	public List<NoticeVO> allNoctice() {
//		SqlSession session = MybatisUtil.getSqlseSession(); //Mybatis => sql 문장도와주는거
//		
//		List<NoticeVO> noticeList = session.selectList("notice.allNotice"); //파라미터 값이없어서 적어줌 ns.id > mapper 넘어갔을떄 namespace
//		
//		return noticeList;

		List<NoticeVO> noticeList = new ArrayList<NoticeVO>();
		SqlSession session = MybatisUtil.getSqlseSession(true);

		try {
			noticeList = session.selectList("notice.allNotice");
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return noticeList;
	}

	// 공지사항 상세정보
	@Override
	public NoticeVO detailNotice(int notNo) {

		NoticeVO nv = null;
		
		SqlSession session = MybatisUtil.getSqlseSession(true);
		
		try {
			nv = session.selectOne("notice.detailNotice", notNo);
		} catch (PersistenceException e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return nv;
	}

	// 공지사항 검색
	@Override
	public List<NoticeVO> searchNotice(String notTitle) {
		List<NoticeVO> notList = new ArrayList<NoticeVO>();
		//List<NoticeVO> notList = searchNotice(notTitle);;
		
		SqlSession session = MybatisUtil.getSqlseSession(true);
		
		try {
			notList = session.selectList("notice.searchNotice", notTitle); //NAMESPACE.ID
			
		}catch (PersistenceException e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		
		return notList;
	}

	
	
	
	// 페이징 처리(전체 게시글 갯수 조회)
	@Override
	public int countNoticeList(Map<String, Object>map) {
		
		int rst = 0;
		
		SqlSession session = MybatisUtil.getSqlseSession();
		
		try {
			rst = session.selectOne("notice.countNoticeList",map);
		} catch (PersistenceException e) {
			throw new RuntimeException("데이터 조회 중 예외 발생",e);
		}finally {
			session.close();
		}
		return rst;
	}
	
	// 페이징 처리(공지사항 범위별 게시글 조회)
	@Override
	public List<NoticeVO> noticeList(Map<String, Object> map) {
		
		List<NoticeVO> list = null;
		
		SqlSession session = MybatisUtil.getSqlseSession();
		try {
			list = session.selectList("notice.noticeList", map);
			
		}catch (Exception e) {
			throw new RuntimeException("데이터 조회 중 예외 발생",e);
		}finally {
			session.close();
		}
		return list;
	}

}
