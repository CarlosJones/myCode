package com.mybatis.test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.dao.IBlogDao;
import com.mybatis.model.Blog;
import com.mybatis.model.Post;

public class Test {
	/*** 
     * 获得MyBatis SqlSessionFactory 
     * SqlSessionFactory 负责创建SqlSession ,一旦创建成功，就可以用SqlSession实例来执行映射语句 
     * ，commit,rollback,close等方法 
     * @return 
     */  
    private static SqlSessionFactory getSessionFactory(){  
        SqlSessionFactory sessionFactory=null;  
        String resource="configuration.xml";  
         try {  
            sessionFactory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(resource));  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
        return sessionFactory;  
    }  
      
    /** 
     * main 方法 
     * @param args 
     */  
    public static void main(String[] args) {  
          
          SqlSession session=getSessionFactory().openSession();  
     try {  
         IBlogDao blogDao=session.getMapper(IBlogDao.class);  
         Blog blog=blogDao.selectBlog(1);  
         List<Post> postList=blog.getPosts();  
         for(Post post:postList){  
             System.out.println(post.getBody());  
         }  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        finally{  
            session.close();  
        }  
    }  
}
