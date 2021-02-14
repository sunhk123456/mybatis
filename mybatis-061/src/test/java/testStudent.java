import com.shk.utils.MybatisUtils;
import com.shk.dao.StudentMapper;
import com.shk.pojo.Student;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class testStudent {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent();
        for (Student student1 : student) {
            System.out.println(student1 );
        }
        sqlSession.close();
    }

    @Test
    public void getStudentx(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentx = mapper.getStudentx();
        for (Student student : studentx) {
            System.out.println(student);
        }
        sqlSession.close();
    }

    @Test
    public  void getStudent2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student2 = mapper.getStudent2();
        for (Student student : student2) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}
