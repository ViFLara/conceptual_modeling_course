package com.viviane.udemycourse.resources.exceptions;

import java.io.Serializable;

import lombok.Data;

@Data
public class StandardError implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer status;
	private String msg;
	private Long timeStamp;
	
	public StandardError(Integer status, String msg, Long timeStamp) {
		this.status = status;
		this.msg = msg;
		this.timeStamp = timeStamp;
	}
}
