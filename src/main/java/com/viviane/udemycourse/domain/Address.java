package com.viviane.udemycourse.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Address implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String street;
	
	@Column
	private String number;
	
	@Column
	private String complement;
	
	@Column
	private String district;
	
	@Column
	private String zipCode;
	
	@ManyToOne
	@JoinColumn(name = "custumer_id")
	private Custumer custumer;
	
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;

	public Address(Integer id, String street, String number, String complement, String district, String zipCode,
			Custumer custumer, City city) {
		this.id = id;
		this.street = street;
		this.number = number;
		this.complement = complement;
		this.district = district;
		this.zipCode = zipCode;
		this.custumer = custumer;
		this.city = city;
	}
}
