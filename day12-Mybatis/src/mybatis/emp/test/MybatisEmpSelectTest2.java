package mybatis.emp.test;

import static mybatis.emp.client.MybatisClient.getFactory;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.emp.vo.Emp;

/**
 * 조회 조건 1개로 사번을 받는 쿼리를 테스트
 * @author CHO
 *
 */
public class MybatisEmpSelectTest2 {

	public static void main(String[] args) {
		
		// 0. sqlSession Factory 생성
		SqlSessionFactory factory = getFactory();
		
		// 1. sqlSession 얻기
		SqlSession session = factory.openSession();	
		
		try {
			// 2. 세션 객체를 통해서 쿼리 실행
			Emp emps = session.selectOne("mybatis.emp.mapper.EmpMapper.selectOne", 7839);
			
				System.out.println(emps);
			
		} catch (Exception e) {

		} finally {
			// 3. sqlSession 닫기
			session.close();
		}

	}

}
