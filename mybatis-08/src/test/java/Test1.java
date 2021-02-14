
import com.shk.dao.BlogMapper;
import com.shk.pojo.Blog;
import com.shk.utils.IDUtils;
import com.shk.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Test1 {
@Test
    public void insertBolg(){
    SqlSession sqlSession = MybatisUtils.getSqlSession();
    BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
    Blog blog = new Blog();
    blog.setId(IDUtils.getId());
    blog.setAuthor("shk");
    blog.setTitle("练习");
    blog.setViews(123);
    blog.setCreatTime(new Date());
    int i = mapper.insertBolg(blog);
    System.out.println(i);
    sqlSession.commit();
    sqlSession.close();
}

@Test
    public void queryBolg(){
    SqlSession sqlSession = MybatisUtils.getSqlSession();
    BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
    HashMap map = new HashMap();
    map.put("title","练习");

    List<Blog> blog = mapper.queryBolg(map);


    System.out.println(blog);

    sqlSession.close();
}
}
