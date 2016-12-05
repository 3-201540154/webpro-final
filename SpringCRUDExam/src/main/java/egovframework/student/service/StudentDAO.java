package egovframework.student.service;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import egovframework.student.StudentVO;


@Repository//sql문 실행하는 class
public class StudentDAO{
	
	@Inject
	private SqlSession session;
	

    public void insertStudent(StudentVO vo) throws Exception {//insert문 실행
        session.insert("Student_SQL.insert", vo);
    }

    public List<StudentVO> selectStudent() throws Exception { //select문 실행 
        return session.selectList("Student_SQL.select");
    }

  

}
