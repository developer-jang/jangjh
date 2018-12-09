package com.example.springboot.jangjh.day3.repository;

import com.example.springboot.jangjh.day2.domain.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;


public interface BoardRepository extends CrudRepository<Board, Long> {

     Page<Board> findByBnoGreaterThan(Long bno, Pageable pageable);
}
