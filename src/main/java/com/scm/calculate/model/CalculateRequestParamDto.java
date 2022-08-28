package com.scm.calculate.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class CalculateRequestParamDto {
    private String startDate;
    private String endDate;
    private String lspId;
    private String vslCd;
    private String closeNoYn;
    private String transOrderNo;
    private String cdVmeaning;
}