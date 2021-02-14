package com.shk.dao;

import com.shk.pojo.Blog;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface BlogMapper {
    int insertBolg(Blog blog);

    List<Blog> queryBolg(Map map);
}
