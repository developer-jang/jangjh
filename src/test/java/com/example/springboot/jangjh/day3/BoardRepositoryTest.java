package com.example.springboot.jangjh.day3;

import com.example.springboot.jangjh.repository.BoardRepository;
import lombok.extern.apachecommons.CommonsLog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Stream;

@RunWith(SpringRunner.class)
@SpringBootTest
@CommonsLog
public class BoardRepositoryTest {

    @Autowired
    private BoardRepository boardRepository;

    @Test
    public void inspect() {
        Class<?> clz = boardRepository.getClass();
        log.debug(clz.getName());

        //
        Class<?>[] interfaces = clz.getInterfaces();
        Stream.of(interfaces).forEach(inter -> log.debug(inter.getName()));

        Class<?> superClasses = clz.getSuperclass();
        log.debug(superClasses.getName());
    }
}
