package com.viviane.udemycourse.domain.enums;

public enum CustumerType {

	PHYSICALPERSON(1, "Physical Person"),
	LEGALPERSON(2, "Legal Person");

	private int cod;
	private String description;

	private CustumerType(int cod, String description) {
		this.cod = cod;
		this.description = description;
	}

	public int getCod() {
		return cod;
	}

	public String getDescription() {
		return description;
	}

	public static CustumerType toEnum(Integer cod) { // static-> possible to run without instantiating objects

		if (cod == null) {
			return null;
		}

		for (CustumerType x : CustumerType.values()) // cycles through all values of the CustomerType enumerated
		{
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Invalid code: " + cod);
	}
}
