package com.nace.db.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class NaceEntity {
    @Id
    @Column(name = "order_id")
    private long order;
    @Column(name = "level_id")
    private int level;
    private String code;
    private String parent;
    private String description;
    private String inc;
    private String also;
    private String rulings;
    private String excl;
    private String ref;
}
