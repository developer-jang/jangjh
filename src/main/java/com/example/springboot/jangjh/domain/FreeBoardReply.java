package com.example.springboot.jangjh.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Setter
@Getter
@ToString(exclude = "freeBoard")
@EqualsAndHashCode(exclude = "freeBoard")
@Entity
@Table(name = "tbl_free_board_reply")
public class FreeBoardReply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rno;

    private String reply;

    private String replyer;

    @CreationTimestamp
    private Timestamp replyRegDate;

    @UpdateTimestamp
    private Timestamp replyUpdateDate;

    @ManyToOne
    private FreeBoard freeBoard;
}
