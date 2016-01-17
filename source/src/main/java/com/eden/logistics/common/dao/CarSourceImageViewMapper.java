package com.eden.logistics.common.dao;

import com.eden.logistics.common.domain.CarSourceImageView;
import com.eden.logistics.common.domain.CarSourceImageViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CarSourceImageViewMapper {
    int countByExample(CarSourceImageViewExample example);

    int deleteByExample(CarSourceImageViewExample example);

    int insert(CarSourceImageView record);

    int insertSelective(CarSourceImageView record);

    List<CarSourceImageView> selectByExampleWithBLOBsWithRowbounds(CarSourceImageViewExample example, RowBounds rowBounds);

    List<CarSourceImageView> selectByExampleWithBLOBs(CarSourceImageViewExample example);

    List<CarSourceImageView> selectByExampleWithRowbounds(CarSourceImageViewExample example, RowBounds rowBounds);

    List<CarSourceImageView> selectByExample(CarSourceImageViewExample example);

    int updateByExampleSelective(@Param("record") CarSourceImageView record, @Param("example") CarSourceImageViewExample example);

    int updateByExampleWithBLOBs(@Param("record") CarSourceImageView record, @Param("example") CarSourceImageViewExample example);

    int updateByExample(@Param("record") CarSourceImageView record, @Param("example") CarSourceImageViewExample example);
}