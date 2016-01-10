package com.eden.logistics.common.dao;

import com.eden.logistics.common.domain.UserView;
import com.eden.logistics.common.domain.UserViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface UserViewMapper {
    int countByExample(UserViewExample example);

    int deleteByExample(UserViewExample example);

    int insert(UserView record);

    int insertSelective(UserView record);

    List<UserView> selectByExampleWithBLOBsWithRowbounds(UserViewExample example, RowBounds rowBounds);

    List<UserView> selectByExampleWithBLOBs(UserViewExample example);

    List<UserView> selectByExampleWithRowbounds(UserViewExample example, RowBounds rowBounds);

    List<UserView> selectByExample(UserViewExample example);

    int updateByExampleSelective(@Param("record") UserView record, @Param("example") UserViewExample example);

    int updateByExampleWithBLOBs(@Param("record") UserView record, @Param("example") UserViewExample example);

    int updateByExample(@Param("record") UserView record, @Param("example") UserViewExample example);
}