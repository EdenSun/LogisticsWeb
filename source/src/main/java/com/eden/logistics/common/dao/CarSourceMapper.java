package com.eden.logistics.common.dao;

import com.eden.logistics.common.domain.CarSource;
import com.eden.logistics.common.domain.CarSourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CarSourceMapper {
    int countByExample(CarSourceExample example);

    int deleteByExample(CarSourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CarSource record);

    int insertSelective(CarSource record);

    List<CarSource> selectByExampleWithRowbounds(CarSourceExample example, RowBounds rowBounds);

    List<CarSource> selectByExample(CarSourceExample example);

    CarSource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CarSource record, @Param("example") CarSourceExample example);

    int updateByExample(@Param("record") CarSource record, @Param("example") CarSourceExample example);

    int updateByPrimaryKeySelective(CarSource record);

    int updateByPrimaryKey(CarSource record);
}