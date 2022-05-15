package com.wells.constants;

public enum StatusEnum {

	ACTIVE("ACTIVE"),
	INACTIVE("INACTIVE");
	
    private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	private StatusEnum(String value) {
		this.setValue(value);
	}
}
