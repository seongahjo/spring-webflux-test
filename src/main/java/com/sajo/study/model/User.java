package com.sajo.study.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;


    @ManyToOne(fetch=FetchType.EAGER)
    private Univ univ;

    @ManyToOne(fetch=FetchType.EAGER)
    private Circle circle;
}
