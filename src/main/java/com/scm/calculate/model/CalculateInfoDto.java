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
    private String inv_inner_no;
    private String inv_inner_seq_no;
    private String item_cd;
    private String local_supp_amt;
    private String local_curr_cd;
    private String local_exr;
    private String unit_price;
    private String tot_gross_wt_unit_cd;
    private String fac_cd;
    private String arr_node_nm;
    private String ref_doc_no;
}