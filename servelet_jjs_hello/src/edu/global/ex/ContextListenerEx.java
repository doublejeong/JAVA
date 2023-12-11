package edu.global.ex;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListenerEx implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("컨텍스트 죽음");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("컨텍스트 초기화 됨");
	}
}
