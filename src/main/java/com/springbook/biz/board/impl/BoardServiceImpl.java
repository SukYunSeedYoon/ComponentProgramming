package com.springbook.biz.board.impl;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("boardservice")
public class BoardServiceImpl implements BoardService {


    // DI
    public void setBoardDAO(BoardDAO dao) {
        boardDAO = dao;
    }


    @Autowired
    private BoardDAO boardDAO;


    public void InsertBoard(BoardVO vo) {
        boardDAO.InsertBoard(vo);
    }

    public void UpdteBoad(BoardVO vo) {
        boardDAO.UpdteBoad(vo);
    }

    public void DeleteBoard(BoardVO vo) {
        boardDAO.DeleteBoard(vo);
    }

    public BoardVO GetBoard(BoardVO vo) {
        return boardDAO.GetBoard(vo);
    }

    public List<BoardDAO> GetBoardList(BoardVO vo) {
        return boardDAO.GetBoardList(vo);
    }
}
}
