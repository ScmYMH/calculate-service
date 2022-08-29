package com.scm.calculate.service;

import com.scm.calculate.model.CalculateInfoDto;
import com.scm.calculate.model.CalculateRequestParamDto;
import com.scm.calculate.model.VslCodeDto;

import java.util.List;

public interface CalculateService {
    List<CalculateInfoDto> getSettleInfoList(CalculateRequestParamDto calculateRequestParamDto);

    List<VslCodeDto> getVslCodeList();

    List<CalculateInfoDto> getCalculateDetailList(String transOrderNo);
}
