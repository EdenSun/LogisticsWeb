package com.eden.logistics.common.dao;

import com.eden.logistics.common.domain.CarSourceImage;
import com.eden.logistics.common.domain.CarSourceImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CarSourceImageMapper {
    int countByExample(CarSourceImageExample example);

    int deleteByExample(CarSourceImageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CarSourceImage record);

    int insertSelective(CarSourceImage record);

    List<CarSourceImage> selectByExampleWithRowbounds(CarSourceImageExample example, RowBounds rowBounds);

    List<CarSourceImage> selectByExample(CarSourceImageExample example);

    CarSourceImage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CarSourceImage record, @Param("example") CarSourceImageExample example);

    int updateByExample(@Param("record") CarSourceImage record, @Param("example") CarSourceImageExample example);

    int updateByPrimaryKeySelective(CarSourceImage record);

    int updateByPrimaryKey(CarSourceImage record);
}