package com.springboot.studykyeong.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class CMRespDto<T> {
	private int code;
	private String message;
	private T data;

}
