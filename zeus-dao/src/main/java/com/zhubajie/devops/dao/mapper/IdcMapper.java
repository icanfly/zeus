package com.zhubajie.devops.dao.mapper;

import com.zhubajie.devops.dao.entity.Idc;
import com.zhubajie.devops.dao.entity.IdcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IdcMapper {
    int countByExample(IdcExample example);

    int deleteByExample(IdcExample example);

    int deleteByPrimaryKey(Long idcId);

    int insert(Idc record);

    int insertSelective(Idc record);

    List<Idc> selectByExample(IdcExample example);

    Idc selectByPrimaryKey(Long idcId);

    int updateByExampleSelective(@Param("record") Idc record, @Param("example") IdcExample example);

    int updateByExample(@Param("record") Idc record, @Param("example") IdcExample example);

    int updateByPrimaryKeySelective(Idc record);

    int updateByPrimaryKey(Idc record);
}