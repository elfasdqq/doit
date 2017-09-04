package com.asd.modules.service;

import com.asd.modules.pojo.dic.model.TDicGroup;
import com.asd.modules.pojo.dic.model.TDicItem;

import java.util.List;
import java.util.Map;

/**
 * zlp
 * Created by lenovo on 2017/2/9.
 */
public interface TDicGroupService {


    /**
     * 根据条件查询item数据
     * @param param 查询条件
     * @param order 排序条件
     * @return 结果集
     */
    public List<TDicGroup> getTDicGroupListByQueryRule(Map param, Map order);




}
