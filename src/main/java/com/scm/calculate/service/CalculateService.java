package com.scm.calculate.service;

import com.scm.calculate.model.*;

import java.util.List;

public interface CalculateService {
    List<CalculateInfoDto> getSettleInfoList(CalculateRequestParamDto calculateRequestParamDto);

    List<VslCodeDto> getVslCodeList(String vslCd, String vslNm);

    List<CalculateInfoDto> getCalculateDetailList(String transOrderNo);
    Integer updateFrtStatus(FrtStatusDto frtStatusDto);
    Integer updateAccountConnInfo(AccountConnInfoDto accountConnInfoDto);
    String getAutoIncrementAccountId(String expNo);
}
