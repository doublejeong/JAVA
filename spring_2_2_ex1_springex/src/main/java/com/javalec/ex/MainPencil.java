package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.javalec.ex.pencil.Pencil;


public class MainPencil {

	public static void main(String[] args) {
		
		String config = "classpath:appCTX2.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(config);
		Pencil pencil = (Pencil)ctx.getBean("pencil");
		pencil.use();
		
		ctx.close();
		
		
		
	}
	
}
