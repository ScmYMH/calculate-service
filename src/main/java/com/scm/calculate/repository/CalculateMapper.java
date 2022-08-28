package com.scm.calculate.repository;

import com.scm.calculate.model.CalculateInfoDto;
import com.scm.calculate.model.CalculateRequestParamDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CalculateMapper {
    List<CalculateInfoDto> getSettleInfoList(CalculateRequestParamDto calculateRequestParamDto);
}
