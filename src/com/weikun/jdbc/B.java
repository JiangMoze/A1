package com.weikun.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class B {
	public static void main(String[] args) {
		new B().testFun();
	}
	public void testFun(){
		
		Connection conn=null;
		CallableStatement cs=null;
		
		try {
			
			Class.forName("org.gjt.mm.mysql.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://192.168.1.146:3306/bz?useUnicode=true&characterEncoding=utf-8", "root", "root");
			String sql="{?=call f_7(?)}";
			cs=conn.prepareCall(sql);
			cs.registerOutParameter(1, java.sql.Types.FLOAT);
			cs.setInt(2, 20005);
			
			
			cs.execute();			
						
			System.out.println(cs.getFloat(1));	
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			
			try {
			
				cs.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}
	public void testProc(){
		Connection conn=null;
		CallableStatement cs=null;
		ResultSet rs=null;
		try {
			
			Class.forName("org.gjt.mm.mysql.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://192.168.1.146:3306/bz?useUnicode=true&characterEncoding=utf-8", "root", "root");
			String sql="call p_7(?,?)";
			cs=conn.prepareCall(sql);
			
			cs.setFloat(1, 10.00f);
			cs.registerOutParameter(2, java.sql.Types.VARCHAR);
			
			boolean flag=cs.execute();
			
			while(flag){
				
				rs=cs.getResultSet();
				
				System.out.println(cs.getString(2));
				while(rs.next()){
					
					System.out.printf("%s-%s-%s",rs.getString("prod_id"),rs.getString("prod_name"),rs.getString("prod_price"));
					System.out.println();
				}
				
				
				flag=cs.getMoreResults();
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			
			try {
				rs.close();
				cs.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
}
