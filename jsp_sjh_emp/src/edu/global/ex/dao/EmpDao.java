package edu.global.ex.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import edu.global.ex.dto.EmpDto;

public class EmpDao {

	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String uid = "scott";
	private String upw = "tiger";

	public EmpDao() {
		try {
			Class.forName(driver);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public List<EmpDto> getEmps() {
		ArrayList<EmpDto> emps = new ArrayList<EmpDto>();

		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			String query = "select*from emp"; 
			con = DriverManager.getConnection(url, uid, upw); 
			stmt = con.prepareStatement(query); 
			stmt.executeQuery(); 
			rs = stmt.executeQuery(); 

			while (rs.next()) { 
				int empno = rs.getInt("empno"); 
				String ename = rs.getString("ename");
				String job = rs.getString("job");

				EmpDto dto = new EmpDto(empno, ename, job);

				emps.add(dto); 
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
	
			try {
				if (rs != null)
					rs.close(); 
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return emps;

	}

}