package com.portal.login.dao;

import com.portal.login.domain.LoanType;

public interface LoanTypeMapper {
    int deleteByPrimaryKey(Long seqNo);

    int insert(LoanType record);

    int insertSelective(LoanType record);

    LoanType selectByPrimaryKey(Long seqNo);

    int updateByPrimaryKeySelective(LoanType record);

    int updateByPrimaryKey(LoanType record);
}