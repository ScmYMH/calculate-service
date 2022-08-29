package com.scm.calculate.controller;

import com.scm.calculate.model.CalculateInfoDto;
import com.scm.calculate.model.CalculateRequestParamDto;
import com.scm.calculate.model.VslCodeDto;
import com.scm.calculate.service.CalculateServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("calculate")
@Slf4j
public class CalculateController {

    @Autowired
    CalculateServiceImpl calculateService;

    @GetMapping("/search")
    public List<CalculateInfoDto> getCodeDefinition(
            @RequestParam String startDate, @RequestParam String endDate
            ,@RequestParam String lspId, @RequestParam String vslCd
            ,@RequestParam String closeNoYn, @RequestParam String transOrderNo
            ,@RequestParam String cdVmeaning
    ) {
        CalculateRequestParamDto calculateRequestParamDto = new CalculateRequestParamDto();
        calculateRequestParamDto.setCdVmeaning(cdVmeaning);
        calculateRequestParamDto.setCloseNoYn(closeNoYn);
        calculateRequestParamDto.setLspId(lspId);
        calculateRequestParamDto.setEndDate(endDate);
        calculateRequestParamDto.setStartDate(startDate);
        calculateRequestParamDto.setVslCd(vslCd);
        calculateRequestParamDto.setTransOrderNo(transOrderNo);
        log.info(String.valueOf(calculateRequestParamDto));
        return calculateService.getSettleInfoList(calculateRequestParamDto);
    }

    @GetMapping("/vslcode")
    public List<VslCodeDto> getVslCodeList() {
        return calculateService.getVslCodeList();
    }

}
