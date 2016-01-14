package com.eden.logistics.common.dao;

import com.eden.logistics.common.domain.CarSourceView;
import com.eden.logistics.common.domain.CarSourceViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CarSourceViewMapper {
    int countByExample(CarSourceViewExample example);

    int deleteByExample(CarSourceViewExample example);

    int insert(CarSourceView record);

    int insertSelective(CarSourceView record);

    List<CarSourceView> selectByExampleWithRowbounds(CarSourceViewExample example, RowBounds rowBounds);

    List<CarSourceView> selectByExample(CarSourceViewExample example);

    int updateByExampleSelective(@Param("record") CarSourceView record, @Param("example") CarSourceViewExample example);

    int updateByExample(@Param("record") CarSourceView record, @Param("example") CarSourceViewExample example);
}