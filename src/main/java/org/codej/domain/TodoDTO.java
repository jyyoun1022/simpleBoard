package org.codej.domain;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class TodoDTO {
	
	private String title;
	@DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss")
	private Date dueDate;
	

}
