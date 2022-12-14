package com.sda.spring.data.jpa.association;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "Father")
@Table(name = "father")
public class Father {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JoinColumn(name = "father_id")
    private List<Son> sons = new ArrayList<>();

    public Father() {
    }

    public Father(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public List<Son> getSons() {
        return Collections.unmodifiableList(sons);
    }

    public String getName() {
        return name;
    }

    public void addSon(Son son) {
        this.sons.add(son);
    }

    public void removeSon(Son son) {
        this.sons.remove(son);
    }

}
