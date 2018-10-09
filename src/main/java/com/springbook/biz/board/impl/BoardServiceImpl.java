package com.springbook.biz.board.impl;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


// 구현 객체 등록
@Service("boardService")
public class BoardServiceImpl implements BoardService {


    // DAO 객체 주
    @Autowired
    private BoardDAO boardDAO;

    public void InsertBoard(BoardVO vo) {
        boardDAO.InsertBoard(vo);
    }

    public void UpdateBoard(BoardVO vo) {
        boardDAO.UpdateBoard(vo);
    }

    public void DeleteBoard(BoardVO vo) {
        boardDAO.DeleteBoard(vo);
    }

    public BoardVO GetBoard(BoardVO vo) {
        return boardDAO.GetBoard(vo);
    }

    public List<BoardVO> GetBoardList(BoardVO vo) {
        return boardDAO.GetBoardList(vo);
    }

}
