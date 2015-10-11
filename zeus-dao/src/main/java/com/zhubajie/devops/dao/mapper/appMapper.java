package com.zhubajie.devops.dao.mapper;

import com.zhubajie.devops.dao.entity.app;
import com.zhubajie.devops.dao.entity.appExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface appMapper {
    int countByExample(appExample example);

    int deleteByExample(appExample example);

    int deleteByPrimaryKey(Long appId);

    int insert(app record);

    int insertSelective(app record);

    List<app> selectByExample(appExample example);

    app selectByPrimaryKey(Long appId);

    int updateByExampleSelective(@Param("record") app record, @Param("example") appExample example);

    int updateByExample(@Param("record") app record, @Param("example") appExample example);

    int updateByPrimaryKeySelective(app record);

    int updateByPrimaryKey(app record);
}