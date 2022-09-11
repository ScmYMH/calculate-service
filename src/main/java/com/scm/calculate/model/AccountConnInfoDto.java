package com.scm.calculate.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class AccountConnInfoDto {
    private String  closeNo;
    private String  closeNoYn;
    private String  acctgYn;
    private double  acctgAmt;
}
