package com.scm.calculate.service;

import com.scm.calculate.model.*;
import com.scm.calculate.repository.CalculateMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CalculateServiceImpl implements CalculateService{

    @Autowired
    CalculateMapper calculateMapper;

    @Override
    public List<CalculateInfoDto> getSettleInfoList(CalculateRequestParamDto calculateRequestParamDto) {
        return calculateMapper.getSettleInfoList(calculateRequestParamDto);
    }

    @Override
    public List<VslCodeDto> getVslCodeList(String vslCd, String vslNm) {
        return calculateMapper.getVslCodeList(vslCd, vslNm);
    }

    @Override
    public List<CalculateInfoDto> getCalculateDetailList(String transOrderNo, String blDate) {
        return calculateMapper.getCalculateDetailList(transOrderNo, blDate);
    }

    @Override
    public Integer updateFrtStatus(FrtStatusDto frtStatusDto) {
        log.info(String.valueOf(frtStatusDto));

        return calculateMapper.updateFrtStatus(frtStatusDto);
    }

    @Override
    public Integer updateAccountConnInfo(AccountConnInfoDto accountConnInfoDto) {
        accountConnInfoDto.setCloseNoYn("Y");
        accountConnInfoDto.setAcctgYn("Y");
        log.info("after : ", accountConnInfoDto);
        return calculateMapper.updateAccountConnInfo(accountConnInfoDto);
    }

    @Override
    public String getAutoIncrementAccountId(String expNo) {
        return calculateMapper.getAutoIncrementAccountId(expNo);
    }

    @Override
    public Integer insertCalculateInfo(String transOrderNo) {
        return calculateMapper.insertCalculateInfo(transOrderNo);
    }

}
