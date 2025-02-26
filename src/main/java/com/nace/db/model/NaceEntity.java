package com.nace.db.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class NaceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long order;
    @Column(name = "level_id")
    private Integer level;
    private String code;
    private String parent;
    private String description;
    private String inc;
    private String also;
    private String rulings;
    private String excl;
    private String ref;
}
