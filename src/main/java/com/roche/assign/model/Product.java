package com.roche.assign.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Document
@Data
public class Product {

    @Id
    @JsonIgnore
    private String id;

    @Indexed(unique = true)
    private String sku;

    private String name;

    private Double price;

    private Date createdDate = new Date();

    private Boolean isActive = Boolean.TRUE;

}
