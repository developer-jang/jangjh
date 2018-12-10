package com.example.springboot.jangjh.repository;

import com.example.springboot.jangjh.domain.Member;
import org.springframework.data.repository.CrudRepository;


public interface MemberRepository extends CrudRepository<Member, String> {
}
