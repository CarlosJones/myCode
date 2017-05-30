package com.mainApp;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.entity.StudentEntity;

public class MainApp {
	public static void main(String[] args) {
		Reader reader;
		SqlSessionFactory sqlSessionFactory;
		SqlSession sqlSession;
		StudentEntity stu;
		try {
			reader = Resources.getResourceAsReader("MybatisConfig.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			sqlSession = sqlSessionFactory.openSession();
			Object obj = sqlSession.selectOne("com.data.mapping.StudentMapper.getStudent","12");
			if(null == obj){
				System.out.println("The result is null.");
			}else{
				stu = (StudentEntity)obj;
				System.out.println(stu.getStudentID());
				System.out.println(stu.getStudentName());
				System.out.println(stu.getStudentSex());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
