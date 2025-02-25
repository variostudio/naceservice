package com.nace.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class NaceData {
    private long order;
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
