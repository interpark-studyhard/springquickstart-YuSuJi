package com.springbook.biz.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceClient {
	public static void main(String args[]){
		//1. spring �����̳� ����
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. spring �����̳ʷκ��� BoardServiceImpl ��ü�� lookup �Ѵ�
		UserService userService = (UserService) container.getBean("userService");
		
		//3. �α��α�� �׽�Ʈ
		System.out.println("�α��α���׽�Ʈ");
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("sssc");
		
		UserVO user = userService.getUser(vo);
		if(user != null){
			System.out.println(user.getName() + "�� �ȴ�");
		} else {
			System.out.println("�α����� ��������");
		}
		
		//4. �����̳� ����
		container.close();
	}
}
