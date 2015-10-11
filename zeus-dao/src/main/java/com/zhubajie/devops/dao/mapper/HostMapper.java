package com.zhubajie.devops.dao.mapper;

import com.zhubajie.devops.dao.entity.Host;
import com.zhubajie.devops.dao.entity.HostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HostMapper {
    int countByExample(HostExample example);

    int deleteByExample(HostExample example);

    int deleteByPrimaryKey(Long hostId);

    int insert(Host record);

    int insertSelective(Host record);

    List<Host> selectByExample(HostExample example);

    Host selectByPrimaryKey(Long hostId);

    int updateByExampleSelective(@Param("record") Host record, @Param("example") HostExample example);

    int updateByExample(@Param("record") Host record, @Param("example") HostExample example);

    int updateByPrimaryKeySelective(Host record);

    int updateByPrimaryKey(Host record);
}