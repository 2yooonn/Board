package com.myboard.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
	
	@Autowired
	private BoardRepository boardRepository;
		
	
	public void write(Board board) {
		
		boardRepository.save(board);
	}

}
