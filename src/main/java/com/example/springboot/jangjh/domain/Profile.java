package com.example.springboot.jangjh.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Setter
@Getter
@Entity
@ToString(exclude = "member")
@Table(name = "tbl_profile")
@EqualsAndHashCode
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // GenerationType.IDENTITY -- 기본 키 생성을 데이터베이스에 위힘하는 방법
    private Long fno;

    private String fname;

    private boolean current;

    @ManyToOne
    private Member member;
}
