package com.eden.logistics.common.dao;

import com.eden.logistics.common.domain.GoodsSourceView;
import com.eden.logistics.common.domain.GoodsSourceViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GoodsSourceViewMapper {
    int countByExample(GoodsSourceViewExample example);

    int deleteByExample(GoodsSourceViewExample example);

    int insert(GoodsSourceView record);

    int insertSelective(GoodsSourceView record);

    List<GoodsSourceView> selectByExampleWithRowbounds(GoodsSourceViewExample example, RowBounds rowBounds);

    List<GoodsSourceView> selectByExample(GoodsSourceViewExample example);

    int updateByExampleSelective(@Param("record") GoodsSourceView record, @Param("example") GoodsSourceViewExample example);

    int updateByExample(@Param("record") GoodsSourceView record, @Param("example") GoodsSourceViewExample example);
}