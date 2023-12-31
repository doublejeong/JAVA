package edu.global.emp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import edu.global.emp.dto.EmpDto;

public class EmpDao {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url =  "jdbc:oracle:thin:@localhost:1521:xe";
	private String user =  "scott";
	private String pwd =  "tiger";

	
	public EmpDao() {
		try {
			Class.forName(driver);
			System.out.println("드라이버 검색 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public List<EmpDto> getEmps(){
		List<EmpDto> emps = new ArrayList<>();

		Connection connection;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from emp";
		
		try {
//			Class.forName(driver);
			connection = DriverManager.getConnection(url,user,pwd);	//DB연결
			pstmt = connection.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				EmpDto emp = new EmpDto();
				
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setMgr(rs.getInt("mgr"));
				emp.setHiredate(rs.getTimestamp("hiredate"));
				emp.setSal(rs.getInt("sal"));
				emp.setComm(rs.getInt("comm"));
				emp.setDeptno(rs.getInt("deptno"));
			
				emps.add(emp);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return emps;
	}
}
