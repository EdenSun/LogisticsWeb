package com.eden.logistics.common.dao;

import com.eden.logistics.common.domain.GoodsSource;
import com.eden.logistics.common.domain.GoodsSourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GoodsSourceMapper {
    int countByExample(GoodsSourceExample example);

    int deleteByExample(GoodsSourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsSource record);

    int insertSelective(GoodsSource record);

    List<GoodsSource> selectByExampleWithRowbounds(GoodsSourceExample example, RowBounds rowBounds);

    List<GoodsSource> selectByExample(GoodsSourceExample example);

    GoodsSource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsSource record, @Param("example") GoodsSourceExample example);

    int updateByExample(@Param("record") GoodsSource record, @Param("example") GoodsSourceExample example);

    int updateByPrimaryKeySelective(GoodsSource record);

    int updateByPrimaryKey(GoodsSource record);
}