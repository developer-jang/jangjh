package com.example.springboot.jangjh.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "tbl_pds_files")
@ToString
@EqualsAndHashCode(of = "fno")
//첨부된 파일
public class PDSFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fno;

    private String pdsFileName;
}
