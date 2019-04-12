package com.ryz2593.common;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author ryz2593
 * @date 2019/4/11
 * @desc
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
