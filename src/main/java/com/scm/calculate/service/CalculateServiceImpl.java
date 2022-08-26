package com.scm.calculate.service;

import com.scm.calculate.model.SettleInfoDto;
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
    public List<SettleInfoDto> getSettleInfoList() {
        return calculateMapper.getSettleInfoList();
    }
}
