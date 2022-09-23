package com.scm.calculate.controller;

import com.scm.calculate.model.*;
import com.scm.calculate.service.CalculateServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("calculate")
@Slf4j
public class CalculateController {

    @Autowired
    CalculateServiceImpl calculateService;

    @PostMapping("")
    public Integer insertCalculateInfo(@RequestParam String transOrderNo){
        log.info(transOrderNo);
        return calculateService.insertCalculateInfo(transOrderNo);
    }
    @GetMapping("/search")
    public List<CalculateInfoDto> getSettleInfoList(
            @RequestParam String startDate, @RequestParam String endDate
            ,@RequestParam String lspId, @RequestParam String vslCd
            ,@RequestParam String dstConfYn, @RequestParam String transOrderNo
            ,@RequestParam String cdVmeaning
    ) {
        CalculateRequestParamDto calculateRequestParamDto = new CalculateRequestParamDto();
        calculateRequestParamDto.setCdVmeaning(cdVmeaning);
        calculateRequestParamDto.setDstConfYn(dstConfYn);
        calculateRequestParamDto.setLspId(lspId);
        calculateRequestParamDto.setEndDate(endDate);
        calculateRequestParamDto.setStartDate(startDate);
        calculateRequestParamDto.setVslCd(vslCd);
        calculateRequestParamDto.setTransOrderNo(transOrderNo);
        log.info(String.valueOf(calculateRequestParamDto));
        return calculateService.getSettleInfoList(calculateRequestParamDto);
    }

    @GetMapping("/detail")
    public List<CalculateInfoDto> getCalculateDetail( @RequestParam String transOrderNo, @RequestParam String blDate ) {
        return calculateService.getCalculateDetailList(transOrderNo, blDate);
    }

    @GetMapping("/vslcode")
    public List<VslCodeDto> getVslCodeList(@RequestParam String vslCd, @RequestParam String vslNm) {
        return calculateService.getVslCodeList(vslCd, vslNm);
    }

    @PutMapping("/frtstatus")
    public Integer updateFrtStatus(@RequestBody FrtStatusDto frtStatusDto){
        log.info(String.valueOf(frtStatusDto));
        return calculateService.updateFrtStatus(frtStatusDto);
    }
    @PutMapping("/actConnInfo")
    public Integer updateAccountConnInfo(@RequestBody AccountConnInfoDto accountConnInfoDto){
        log.info(String.valueOf(accountConnInfoDto));
        return calculateService.updateAccountConnInfo(accountConnInfoDto);
    }
    @GetMapping("/newAccountId")
    public String getAutoIncrementAccountId(@RequestParam String expNo) {
        log.info("expNo : ",expNo);
        return calculateService.getAutoIncrementAccountId(expNo);
    }



}
