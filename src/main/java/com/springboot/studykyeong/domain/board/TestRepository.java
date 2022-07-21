package com.springboot.studykyeong.domain.board;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestRepository {

	public int save(Board board);
}
