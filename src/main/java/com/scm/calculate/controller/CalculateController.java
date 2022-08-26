package com.scm.calculate.controller;

import com.scm.calculate.model.SettleInfoDto;
import com.scm.calculate.service.CalculateServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("calculate")
@Slf4j
public class CalculateController {

    @Autowired
    CalculateServiceImpl calculateService;

    @GetMapping("")
    public List<SettleInfoDto> getCodeDefinition() {
        return calculateService.getSettleInfoList();
    }

}
