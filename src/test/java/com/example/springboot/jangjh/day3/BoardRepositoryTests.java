package com.example.springboot.jangjh.day3;

import com.example.springboot.jangjh.day2.domain.Board;
import com.example.springboot.jangjh.day3.repository.BoardRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardRepositoryTests {

    @Autowired
    private BoardRepository boardRepository;

    @Test
    public void insert() {
        Board board = new Board();
        board.setTitle("Title1");
        board.setContent("Content1");
        board.setWriter("jangjh");

        boardRepository.save(board);
    }
}
