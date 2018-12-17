package com.example.springboot.jangjh.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Setter
@Getter
@EqualsAndHashCode(exclude = "freeBoardReplyList")
@ToString(exclude = "freeBoardReplyList")
@Table(name = "tbl_free_board")
@Entity
public class FreeBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bno;

    private String title;

    private String write;

    private String content;

    @CreationTimestamp
    private Timestamp regDate;

    @UpdateTimestamp
    private Timestamp updateDate;

    @OneToMany(mappedBy = "freeBoard")
    //mappedBy ~애개 메이게 된다.
    //게시글이 댓글에 매여 있다. 게시글에 댓글이 있으면 삭제가 불가능하다.
    private List<FreeBoardReply> freeBoardReplyList;
}
