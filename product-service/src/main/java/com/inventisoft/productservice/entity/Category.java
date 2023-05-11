package com.inventisoft.productservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Hector Ajumado
 */

@Entity

public class Category {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    private int id;
    private int parentId;
    private int code;
    private String name;
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
