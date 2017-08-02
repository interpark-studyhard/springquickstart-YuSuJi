package com.springbook.biz.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceClient {
	public static void main(String args[]){
		//1. spring 컨테이너 구동
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. spring 컨테이너로부터 BoardServiceImpl 객체를 lookup 한다
		UserService userService = (UserService) container.getBean("userService");
		
		//3. 로그인기능 테스트
		System.out.println("로그인기능테스트");
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("sssc");
		
		UserVO user = userService.getUser(vo);
		if(user != null){
			System.out.println(user.getName() + "님 안뇽");
		} else {
			System.out.println("로그인이 실패했음");
		}
		
		//4. 컨테이너 종료
		container.close();
	}
}
