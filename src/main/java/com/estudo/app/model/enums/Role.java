package com.estudo.app.model.enums;

public enum Role {
	
	ADMIN("ADMIN"), USER("USER");
	
	private String roleName;
	
	private Role(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleName() {
		return roleName;
	}
}
