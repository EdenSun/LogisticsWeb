package com.eden.logistics.common.dao;

import com.eden.logistics.common.domain.GoodsSourceImageView;
import com.eden.logistics.common.domain.GoodsSourceImageViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GoodsSourceImageViewMapper {
    int countByExample(GoodsSourceImageViewExample example);

    int deleteByExample(GoodsSourceImageViewExample example);

    int insert(GoodsSourceImageView record);

    int insertSelective(GoodsSourceImageView record);

    List<GoodsSourceImageView> selectByExampleWithBLOBsWithRowbounds(GoodsSourceImageViewExample example, RowBounds rowBounds);

    List<GoodsSourceImageView> selectByExampleWithBLOBs(GoodsSourceImageViewExample example);

    List<GoodsSourceImageView> selectByExampleWithRowbounds(GoodsSourceImageViewExample example, RowBounds rowBounds);

    List<GoodsSourceImageView> selectByExample(GoodsSourceImageViewExample example);

    int updateByExampleSelective(@Param("record") GoodsSourceImageView record, @Param("example") GoodsSourceImageViewExample example);

    int updateByExampleWithBLOBs(@Param("record") GoodsSourceImageView record, @Param("example") GoodsSourceImageViewExample example);

    int updateByExample(@Param("record") GoodsSourceImageView record, @Param("example") GoodsSourceImageViewExample example);
}