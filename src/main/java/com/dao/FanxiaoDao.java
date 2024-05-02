package com.dao;

import com.entity.FanxiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.FanxiaoView;

/**
 * 返校申请 Dao 接口
 *
 * @author 
 */
public interface FanxiaoDao extends BaseMapper<FanxiaoEntity> {

   List<FanxiaoView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
