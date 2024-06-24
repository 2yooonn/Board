package com.myboard.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myboard.domain.Board;
import com.myboard.domain.BoardService;

@Controller
@RequestMapping("/myboard")
public class BoardController {
    
    @Autowired
    private BoardService boardService;
    
    @GetMapping("/write") // localhost:8080/myboard/write
    public String boardWriteForm() {
        return "boardwrite";
    }
    
    @PostMapping("/writepro")
    public String boardWritePro(Board board) {
        boardService.write(board);
        // 작성 후에 어디로 이동할지 리턴 값으로 설정
        return ""; // 예시로 다시 글 작성 페이지로 리다이렉션
    }
}
