package com.ccg.mapper;

import com.ccg.entity.Storage;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StorageMapper {
	Storage selectByProductId(Long productId);

	int decrease(Storage record);
}