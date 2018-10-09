package com.springbook.biz.board;


import java.util.List;

public interface BoardService {
    void InsertBoard(BoardVO vo);

    void UpdateBoard(BoardVO vo);

    void DeleteBoard(BoardVO vo);

    // 상세 조회
    BoardVO GetBoard(BoardVO vo);

    // 글 목록 조회
    List<BoardVO> GetBoardList(BoardVO vo);
}
