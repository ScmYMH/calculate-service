package com.scm.calculate.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class CalculateInfoDto {
    private String nation_nm;
    private String lsp_id;
    private String cd_v_meaning;
    private String cd_v;
    private String vsl_cd;
    private String vsl_nm;
    private String trans_order_no;
    private String close_no_yn;
    private String clear_curr;
    private String clear_qty;
    private String clear_amt;
    private String acctg_amt;
    private String acctg_yn;
    private String bl_date;
    private String tot_gross_wt;
    private String vsl_load_posbl_wt;
}