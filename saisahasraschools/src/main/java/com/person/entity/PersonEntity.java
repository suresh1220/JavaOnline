package com.person.entity;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class PersonEntity {

	@Id
	private int id;
	private String name;
	private String addr;
}
