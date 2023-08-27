package edu.global.ex.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GradeVO {
	
	private Double kor;
	private Double eng;
	private Double math;

	public double getTotal() {
		double total = kor + eng + math;
		return total;
	}
	public double getAvg() {
		double avg =(kor + eng + math) / 3.0;
		return avg;
	}
	public char getGrade() {
		char grade;
		double avg = getAvg();
		
		if (avg >= 90) {
			grade = '수';
		} else if (avg >= 80) {
			grade = '우';
		} else if (avg >= 70) {
			grade = '미';
		} else if (avg >= 60) {
			grade = '양';
		} else {
			grade = '가';
		}
		return grade;
	}
	
}
