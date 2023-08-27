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
public class CircleVO {
	
	private double radius; 

	public double getArea() {
		return radius * radius * Math.PI;
	}
	
}
