package com.springboot.studykyeong.domain.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardRepository {
	
	public int save(Board board);
	public Board findBoardByBoardcode(int boardcode);
	public List<Board> getBoardListOfIndex(int index);

}
