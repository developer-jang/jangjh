package com.example.springboot.jangjh.day3;

import com.example.springboot.jangjh.day2.domain.Board;
import com.example.springboot.jangjh.day3.repository.BoardRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardRepositoryTests {

    @Autowired
    private BoardRepository boardRepository;

    @Test
    @Ignore
    public void insert() {
        Board board = new Board();
        board.setTitle("Title1");
        board.setContent("Content1");
        board.setWriter("jangjh");

        boardRepository.save(board);
    }

    @Test
    public void testBnoPagingSort() {
        PageRequest paging = new PageRequest(0, 10, Sort.Direction.ASC, "bno");
        Page<Board> result = boardRepository.findByBnoGreaterThan(0L, paging);


    }
}
