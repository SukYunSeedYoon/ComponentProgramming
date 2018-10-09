package com.springbook.biz.user;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class UserServiceClient {

    public static void main(String[] args){


        // 스프링 컨테이너 구동
        AbstractApplicationContext containter =
                new GenericXmlApplicationContext("applicationContext.xml");

        // 스프링 컨테이너로부터 BoardServiceImpl 객체 lookup
        UserService userService = (UserService)containter.getBean("userService");


        // 글 등록 테스트
        UserVO vo = new UserVO();
        vo.setId("user1");
        vo.setPassword("user1");


        UserVO user = userService.getUser(vo);
        if (user != null){
            System.out.println(user.getName() + " 님 환영 합니다.");
        }
        else {
            System.out.println("로그인 실패");
        }

        // Spring 컨테이너 종료
        containter.close();

    }
}
