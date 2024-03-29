package com.scm.calculate.repository;

import com.scm.calculate.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CalculateMapper {
    List<CalculateInfoDto> getSettleInfoList(CalculateRequestParamDto calculateRequestParamDto);
    List<VslCodeDto> getVslCodeList(String vslCd, String vslNm);
    List<CalculateInfoDto> getCalculateDetailList(String transOrderNo, String blDate);
    Integer updateFrtStatus(FrtStatusDto frtStatusDto);
    Integer updateAccountConnInfo(AccountConnInfoDto accountConnInfoDto);
    String getAutoIncrementAccountId(String expNo);
    Integer insertCalculateInfo(String transOrderNo,String facCd,String blDate, String invInnerNo);
}
