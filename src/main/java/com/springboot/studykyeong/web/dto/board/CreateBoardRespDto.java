package com.springboot.studykyeong.web.dto.board;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CreateBoardRespDto {
	private int boardcode;
	private String title;
	private int usercode;
	private String content;
	private boolean insertStatus;

}
