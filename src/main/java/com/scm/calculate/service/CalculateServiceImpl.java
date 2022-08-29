package com.scm.calculate.service;

import com.scm.calculate.model.CalculateInfoDto;
import com.scm.calculate.model.CalculateRequestParamDto;
import com.scm.calculate.model.VslCodeDto;
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
    public List<VslCodeDto> getVslCodeList() {
        return calculateMapper.getVslCodeList();
    }

    @Override
    public List<CalculateInfoDto> getCalculateDetailList(String transOrderNo) {
        return calculateMapper.getCalculateDetailList(transOrderNo);
    }

}
