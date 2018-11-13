package com.sajo.study.model;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Circle {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @ManyToOne(fetch=FetchType.EAGER)
    private Univ univ;

    @Builder
    public Circle(String name, Univ univ){
        this.name=name;
        this.univ=univ;
    }

    @OneToMany
    private List<User> userList;
}
