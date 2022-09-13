package com.scm.calculate.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class FrtStatusDto {
    private String transOrderNo;
    private String frtStatus;
    private String dstConfYn;
}
