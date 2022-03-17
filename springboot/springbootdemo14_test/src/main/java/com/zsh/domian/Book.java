package com.zsh.domian;


import lombok.Data;
import org.springframework.boot.convert.DataSizeUnit;

@Data
public class Book {
    private int id;
    private String name;
    private String type;
    private String description;
}
