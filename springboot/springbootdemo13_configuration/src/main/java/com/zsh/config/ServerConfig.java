package com.zsh.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.stereotype.Component;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

@Data
//@Component
@ConfigurationProperties("servers")
//开启对当前Bean的属性注入校验
@Validated
public class ServerConfig {

    private String ipAddress;
    @Max(8888)
    private int port;
    private long timeout;//long默认是毫秒单位
    @DurationUnit(ChronoUnit.HOURS)
    private Duration serverTimeOut;
    @DataSizeUnit(DataUnit.KILOBYTES)
    private DataSize dataSize;


}
