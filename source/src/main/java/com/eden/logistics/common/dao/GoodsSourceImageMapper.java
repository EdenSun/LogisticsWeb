package com.eden.logistics.common.dao;

import com.eden.logistics.common.domain.GoodsSourceImage;
import com.eden.logistics.common.domain.GoodsSourceImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GoodsSourceImageMapper {
    int countByExample(GoodsSourceImageExample example);

    int deleteByExample(GoodsSourceImageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsSourceImage record);

    int insertSelective(GoodsSourceImage record);

    List<GoodsSourceImage> selectByExampleWithRowbounds(GoodsSourceImageExample example, RowBounds rowBounds);

    List<GoodsSourceImage> selectByExample(GoodsSourceImageExample example);

    GoodsSourceImage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsSourceImage record, @Param("example") GoodsSourceImageExample example);

    int updateByExample(@Param("record") GoodsSourceImage record, @Param("example") GoodsSourceImageExample example);

    int updateByPrimaryKeySelective(GoodsSourceImage record);

    int updateByPrimaryKey(GoodsSourceImage record);
}