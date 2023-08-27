package edu.global.ex.mapper;

import static org.junit.jupiter.api.Assertions.*;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;


@Slf4j	//System.out.println 대신 
@SpringBootTest
class SampleMapperTest {

	// 테스트폴더에는 반드시 들어
	@Autowired
	private DataSource ds;	//DataSource = 커넥션 = 서버쪽에 있는 Connection 객
	
	@Autowired	// 선언된 객체 보고 알아서 'sampleMapper'에게 집어 넣으라고 spring에게 명시킴! (다이렉트 x)
	private SampleMapper sampleMapper;
	
	@Test
	void testDatasource() {
		System.out.println("DS=" + ds);
		
	}
	
	@Test
	void testGetTime() {
		System.out.println(sampleMapper.getTime());
		
	}
	
	

}
