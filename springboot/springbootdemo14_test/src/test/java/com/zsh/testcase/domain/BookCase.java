package com.zsh.testcase.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "testcase.book")
public class BookCase {

    private int id;
    private int id2;
    private String type;
    private String name;
    private String uuid;
    private long publishTime;
}
