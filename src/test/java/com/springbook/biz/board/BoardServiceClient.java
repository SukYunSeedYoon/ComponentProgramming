package com.springbook.biz.board;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

public class BoardServiceClient {

    public static void main(String[] args){


        // 스프링 컨테이너 구동
        AbstractApplicationContext containter =
                new GenericXmlApplicationContext("applicationContext.xml");

        // 스프링 컨테이너로부터 BoardServiceImpl 객체 lookup
        BoardService boardService = (BoardService)containter.getBean("boardService");


        // 글 등록 테스트
        BoardVO vo = new BoardVO();
        vo.setTitle("임시 제목");
        vo.setWriter("홍길동");
        vo.setContent("temp data......");
        boardService.InsertBoard(vo);

        // 글 목록 검색
        List<BoardVO> boardList = boardService.GetBoardList(vo);
        for (BoardVO board: boardList){
            System.out.println("===>" + board.toString());
        }

        // Spring 컨테이너 종료
        containter.close();


    }
}
