package kr.or.ddit.questionboard.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.questionboard.vo.QnaBoardVO;
import kr.or.ddit.util.MybatisUtil;

// IQnaBoardDao 싱글톤
public class QnaBoardDaoImpl implements IQnaBoardDao {

	private static IQnaBoardDao qnaboardDao= new QnaBoardDaoImpl();
	
	public QnaBoardDaoImpl() {
	}
	
	public static IQnaBoardDao getinstance() {
		return qnaboardDao;
	}
	
	//QnA 등록
	@Override
	public int insertQnaboard(QnaBoardVO qv) {
		
		SqlSession session = MybatisUtil.getSqlseSession();
		
		int cnt = 0;
		
		try {					//namnspace?
			cnt = session.insert("qnaboard.insertQnaboard", qv);
		
			if( cnt > 0 ) {
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
	
	//QnA 수정
	@Override
	public int updateQnaboard(QnaBoardVO qv) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//QnA 삭제
	@Override
	public int deleteQnaboard(int qnaNo) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//QnA 전체리스트
	@Override
	public List<QnaBoardVO> allQnaboard() {
	
	List<QnaBoardVO> qnaboardlist = new ArrayList<QnaBoardVO>();
	SqlSession session = MybatisUtil.getSqlseSession(true);
	
	try {
		qnaboardlist = session.selectList("qnaboard.allQnaboard");
	} catch (PersistenceException e) {
			e.printStackTrace();
	}finally {
		session.close();
	}
		return qnaboardlist;
	}
	
	
	//상세보기
	@Override
	public QnaBoardVO detailQnaboard(int qnaNo) {
		// TODO Auto-generated method stub
		return null;
	}
	
	//QnA 검색
	@Override
	public List<QnaBoardVO> searchQnaboard(String qnaTitle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countQnaList(Map<String, Object> map) {
		int rst = 0;
		
		SqlSession session = MybatisUtil.getSqlseSession();
		
		try {
			rst = session.selectOne("qnaboard.countQnaList",map);
		} catch (PersistenceException e) {
			throw new RuntimeException("데이터 조회 중 예외 발생",e);
		}finally {
			session.close();
		}
		return rst;
	}

	@Override
	public List<QnaBoardVO> qnaList (Map<String, Object> map) {
		
		List<QnaBoardVO> list = null;
		
		SqlSession session = MybatisUtil.getSqlseSession();
		try {
			list = session.selectList("qnaboard.qnaList", map);
			
		}catch (Exception e) {
			throw new RuntimeException("데이터 조회 중 예외 발생",e);
		}finally {
			session.close();
		}
		return list;
	}


}
