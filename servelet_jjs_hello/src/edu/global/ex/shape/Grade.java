package edu.global.ex.shape;

public class Grade {
	double kor, eng, math;
	double avg;
	char grade;
	
	public void setGrade(double kor, double eng, double math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public double getAvg() {
		avg =(kor + eng + math) / 3;
		return avg;
	}
	public char getGrade() {
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