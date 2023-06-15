package com.inventisoft.productservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Hector Ajumado
 */

@Entity
@Getter
@Setter
public class Category {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    private int id;
    private int parentId;
    private int code;
    private String name;
    
}
