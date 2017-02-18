package com.weikun.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class A {
	public static void main(String[] args) {
		new A().update();
	}	
	
	
	public void update(){	
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://192.168.1.146:3306/bz?useUnicode=true&characterEncoding=utf-8", "root", "root");
			String sql="update company set fname=?,email=? where id=?";
			
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, "双鸭山");
			pstmt.setString(2, "佳木斯.com");
			
			pstmt.setInt(3, 8);
			System.out.println(pstmt.executeUpdate()>0?"成功":"失败");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
	public void del(){		
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://192.168.1.146:3306/bz?useUnicode=true&characterEncoding=utf-8", "root", "root");
			
			String sql="delete from company where id=?";
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, 1);
			
			System.out.println(pstmt.executeUpdate()>0?"成功":"失败");
			
			
			
		} catch (Exception e) {
			// TODO: handl exception
			e.printStackTrace();			
		}finally{
			
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	public void add(){
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://192.168.1.146:3306/bz?useUnicode=true&characterEncoding=utf-8", "root", "root");
			String sql="insert into company(fname,email) values(?,?)";
			conn.setAutoCommit(false);
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, "黑龙江2");
			pstmt.setString(2, "黑龙江21.com");
			
			System.out.println(pstmt.executeUpdate()>0?"成功":"失败");
			conn.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally{
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
		
		
	}
	public void queryAll(){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			//1加载驱动到内存
			Class.forName("com.mysql.jdbc.Driver");//org.gjt.mm.mysql.Driver
			//2建立连接
			conn=DriverManager.getConnection("jdbc:mysql://192.168.1.146:3306/bz?useUnicode=true&characterEncoding=utf-8", "root", "root");			
			//3执行sql
			//String sql="select * from company";
			String sql="select * from company where fname=? ";//防止sql注入
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, "哈尔滨");
			rs=pstmt.executeQuery();			
			//4遍历结果集						
			while(rs.next()){				
				System.out.printf("%d-%s-%s",rs.getInt("id"),rs.getString("fname"),rs.getString("email"));
				System.out.println();
			}			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			//5关闭
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
