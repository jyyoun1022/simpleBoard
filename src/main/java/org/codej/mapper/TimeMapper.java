package org.codej.mapper;

import org.apache.ibatis.annotations.Select;

import lombok.ToString;


public interface TimeMapper {

	@Select("Select now() from dual")
	public String getTime();
	
	public String getTime2();
}
