package com.pikachu.core;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author dongyang.yu
 * @email dongyang.yu@anxincloud.com
 */
public interface BaseUUIDMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
