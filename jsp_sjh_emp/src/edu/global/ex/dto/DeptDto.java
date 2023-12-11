package edu.global.ex.dto;

/*
아래의 테이블 참고 Dept 테이블
DEPTNO NOT NULL NUMBER(2)    
DNAME           VARCHAR2(14) 
LOC             VARCHAR2(13) 
*/
//Dto=date transfer object = 데이터베이스에 있는걸 자바로 옮긴다는 뜻
public class DeptDto {
	private int deptno;
	private String dname;
	private String loc;
	
	
	public DeptDto() { //디폴트 생성자 잊지말고 생성! 
		
	}
	
	public DeptDto(int deptno, String dname, String loc) { //콘스트락트유징필드 만들기
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	
	public int getDeptno() { //게터세터 만들기
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
	
}
