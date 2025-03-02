package com.nace.db.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class NaceEntity {
    @Id
    private Long ord;
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
