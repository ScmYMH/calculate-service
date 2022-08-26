package com.scm.calculate.repository;

import com.scm.calculate.model.SettleInfoDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CalculateMapper {
    List<SettleInfoDto> getSettleInfoList();
}
