package com.example.springboot.jangjh.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@ToString(exclude = "pdsFiles")
@Entity
@Table(name = "tbl_pds_board")
@EqualsAndHashCode(of = "pid")
public class PDSBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pid;

    private String pname;

    private String pwriter;

//    아래처럼 선언하면 별도의 테이블이 추가된다. pid, fno를 가진...
//    별도의 테이블이 생성되는 것이 싫다면

//    별도의 지정한 이름을 가진 특정한 테이블을 조인할 것이라고 명시하거나(@JoinTable)

//    @JoinColumn을 명시해서 기존 테이블의 컬럼을 추가한다고 표현해야함
//    @OneToMany
//    private List<PDSFile> pdsFiles;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fno")
    private List<PDSFile> pdsFiles;
}
