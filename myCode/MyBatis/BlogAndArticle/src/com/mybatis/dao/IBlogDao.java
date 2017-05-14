package com.mybatis.dao;

import com.mybatis.model.Blog;

public interface IBlogDao {
	public Blog selectBlog(int id);
}
