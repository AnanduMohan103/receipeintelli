package com.nestdigital.receipebackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="receipe")
public class ReceipeModel {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String ing;
    private String category;
    private  String duration;

    public ReceipeModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIng() {
        return ing;
    }

    public void setIng(String ing) {
        this.ing = ing;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public ReceipeModel(int id, String name, String ing, String category, String duration) {
        this.id = id;
        this.name = name;
        this.ing = ing;
        this.category = category;
        this.duration = duration;
    }
}
