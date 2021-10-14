package com.viviane.udemycourse.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class City implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String name;
	
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name = "state_id")
	private State state;

	public City(Integer id, String name, State state) {
		this.id = id;
		this.name = name;
		this.state = state;
	}	
}
