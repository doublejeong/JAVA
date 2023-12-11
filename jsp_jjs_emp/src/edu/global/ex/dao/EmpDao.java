package edu.global.ex.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import edu.global.ex.dto.EmpDto;

public class EmpDao {

	private String driver = "oracle.jdbc.driver.OracleDriver";
	// 오라클을 사용하므로 oracle드라이버를 넣어서 초기화
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String uid = "scott";
	private String upw = "tiger";
	// DB에 접근하기 위해 id와 pw를 입력한다.

	public EmpDao() {
		try {
			// 객체를 동적으로 메모리에 올림(new 드라이버)
			// driver를 객체생성하여 메모리에 올린다 = 동적생성
			// 이때 driver는 클래스상단에 초기화한 값
			Class.forName(driver);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public int insertEmp(int empno, String ename, String job, int mgr, Timestamp hiredate, int sal, int comm, int deptno) {
		
		Connection con = null;
		PreparedStatement stmt = null;
		String query = "insert into emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) values(?, ?, ?, ?, ?, ?, ?, ?)";
		int result = 0;
		try {

			con = DriverManager.getConnection(url, uid, upw);
			stmt = con.prepareStatement(query);
			stmt.setInt(1, empno);
			stmt.setString(2, ename);
			stmt.setString(3, job);
			stmt.setInt(4, mgr);
			stmt.setTimestamp(5, hiredate);
			stmt.setInt(6, sal);
			stmt.setInt(7, comm);
			stmt.setInt(8, deptno);

			result = stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return result;

	}
	
	public int deleteEmp(int empno) {
		
		Connection con = null;
		PreparedStatement stmt = null;
		String query = "delete from emp where empno = ?";
		int result = 0;
		
		try {
			
			con = DriverManager.getConnection(url, uid, upw);
			stmt = con.prepareStatement(query);
			
			stmt.setInt(1, empno);
			result = stmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
				
			} catch (Exception e3) {
				e3.printStackTrace();
			}
		}
		
		return result;
		
	}

	public List<EmpDto> getemps() {
		// 테이블을 가져올때 Dto는 한 행을 객체로 보고 한 줄을 그대로 가져온다.
		// 메모리에 연속된방을 잡는 ArrayList을 리턴타입으로 설정해준다.
		ArrayList<EmpDto> etos = new ArrayList<EmpDto>();

		// Connection, Statement, ResultSet 3종세트를 순서대로 객체생성한다.
		// 이때 import할시 java.sql에 있는 인터페이스를 가져와야한다!!(※주의)
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			String query = "select * from emp"; // (가지고 오고자하는 쿼리문을 넣어준다)
			// 내 어플리케이션과 오라클하고 접속(connection)
			con = DriverManager.getConnection(url, uid, upw);

			// stmt = 빨대 = 커넥션객체에서 빨대 가져옴
			stmt = con.prepareStatement(query);

			// stmt.executeQuery() = 채팅 처럼 sql 구문을 엔터쳐서 전달
			// 결과를 ResultSet으로 받아옴
			rs = stmt.executeQuery();

			// 반복문을 사용해서 ArrayList에 가져온 데이터를 집어넣는다.
			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				Timestamp hiredate = rs.getTimestamp("hiredate");
				int sal = rs.getInt("sal");
				int comm = rs.getInt("comm");
				int deptno = rs.getInt("deptno");
					
				EmpDto eto = new EmpDto(empno,ename,job,mgr,hiredate,sal,comm,deptno);

				etos.add(eto);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// ※제일 나중에 연거를 먼저 닫아줘야한다. Connection, Statement, ResultSet순서로
			// 열었으므로 거꾸로 닫아준다.
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

		return etos;

	}

}