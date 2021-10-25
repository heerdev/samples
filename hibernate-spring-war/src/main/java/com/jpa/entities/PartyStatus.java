package com.jpa.entities;

import javax.persistence.*;

@Entity
@Table(name = "PARTYSTATUS")
public class PartyStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private long id;

    @Column(name = "NAME")
    private String name;

    @Column(name="DESCRIPTION")
    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
