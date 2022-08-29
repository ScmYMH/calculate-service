package com.scm.calculate.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class VslCodeDto {
    private String vsl_cd;
    private String vsl_nm;
    private String vsl_dead_wt;
    private String vsl_load_posbl_wt;
}
