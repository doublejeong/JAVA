package edu.global.emp;

import java.util.List;

import edu.global.emp.dao.EmpDao;
import edu.global.emp.dto.EmpDto;

public class EmpMain {

	public static void main(String[] args) {
		EmpDao dao = new EmpDao();
		
		List<EmpDto> emps = dao.getEmps();
		
		for (EmpDto emp : emps) {
			System.out.print("사원번호" + emp.getEmpno() + '\t');
			System.out.print("사원이름" + emp.getEname() + '\t');
			System.out.print("직업" + emp.getJob() + '\t');
			System.out.print("월급" + emp.getSal() + '\t');
			System.out.print("커미션" + emp.getComm() + '\t');
			System.out.print("그룹" + emp.getDeptno() + '\t');
			System.out.println(emp.getHiredate());
		}
	}
}
