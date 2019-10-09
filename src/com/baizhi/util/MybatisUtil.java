package com.baizhi.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {

	private static SqlSessionFactory factory=null;
	static{
		 try {
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			SqlSessionFactoryBuilder ssfd = new SqlSessionFactoryBuilder();
			factory=ssfd.build(reader);
		 
		 } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	
	public static SqlSession getSqlSession() {
		SqlSession sqlsession=factory.openSession();
		
		return sqlsession;
	}

	public static void colseSqlSession(SqlSession sql) {
		sql.close();
	}

	
	
	

}
