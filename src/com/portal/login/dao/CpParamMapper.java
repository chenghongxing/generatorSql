package com.portal.login.dao;

import com.portal.login.domain.CpParam;

public interface CpParamMapper {
    int deleteByPrimaryKey(Long seqNo);

    int insert(CpParam record);

    int insertSelective(CpParam record);

    CpParam selectByPrimaryKey(Long seqNo);

    int updateByPrimaryKeySelective(CpParam record);

    int updateByPrimaryKey(CpParam record);
}