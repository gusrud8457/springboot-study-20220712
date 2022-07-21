package com.springboot.studykyeong.service.board;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.studykyeong.domain.board.Board;
import com.springboot.studykyeong.domain.board.BoardRepository;
import com.springboot.studykyeong.web.dto.board.CreateBoardReqDto;
import com.springboot.studykyeong.web.dto.board.CreateBoardRespDto;
import com.springboot.studykyeong.web.dto.board.ReadBoardRespDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
	
	private final BoardRepository boardRepository;

	@Override
	public CreateBoardRespDto createBoard(CreateBoardReqDto createBoardReqDto) throws Exception {
		Board boardEntity = createBoardReqDto.toEntity();	
		boolean insertStatus = boardRepository.save(boardEntity) > 0;
		
		return boardEntity.toCreateBoardDto(insertStatus);
	} 
	
	@Override
	public List<ReadBoardRespDto> readBoardList(int page) throws Exception {
		List<ReadBoardRespDto> BoardDtoList = new ArrayList<ReadBoardRespDto>();
		
		boardRepository.getBoardListOfIndex ((page - 1)* 10).forEach(board -> {
			BoardDtoList.add(board.toReadBoardDto());
		});
		return BoardDtoList;
	}
		
	
	@Override
	public boolean updateBoard(int boardcode, CreateBoardReqDto createBoardReqDto) throws Exception {
		return false;
	}

	@Override
	public boolean deleteBoard(int boardcode) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ReadBoardRespDto readBoard(int boardcode) throws Exception {
		return boardRepository.findBoardByBoardcode(boardcode).toReadBoardDto();
	}
	
	
	

}
