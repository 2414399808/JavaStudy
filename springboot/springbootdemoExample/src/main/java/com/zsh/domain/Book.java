package com.zsh.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
