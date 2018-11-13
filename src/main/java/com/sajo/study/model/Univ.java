package com.sajo.study.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Univ {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable=false)
    private String name;

    @Column
    private String description;

    @Builder
    public Univ(String name, String description){
        this.name=name;
        this.description=description;
    }

}
