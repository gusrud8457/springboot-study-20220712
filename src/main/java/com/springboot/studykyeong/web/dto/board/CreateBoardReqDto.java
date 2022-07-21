package com.springboot.studykyeong.web.dto.board;

import com.springboot.studykyeong.domain.board.Board;
import com.springboot.studykyeong.domain.board.Board.BoardBuilder;

import lombok.Data;

@Data
public class CreateBoardReqDto {
	private String title;
	private int usercode;
	private String content;
	
	public Board toEntity() {
		return Board.builder()
				.title(title)
				.usercode(usercode)
				.content(content)
				.build();
	}

	public static BoardBuilder builder() {
		// TODO Auto-generated method stub
		return null;
	}

}
