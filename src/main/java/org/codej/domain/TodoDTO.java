package org.codej.domain;

import java.sql.Date;

import lombok.Data;

@Data
public class TodoDTO {
	
	private String title;
	private Date dueDate;
	

}
