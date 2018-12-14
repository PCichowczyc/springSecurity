package com.loginapp.security;

import org.springframework.security.core.userdetails.UserDetails;
import com.loginapp.domain.User;

public class CustomSecurityUser extends User implements UserDetails {

	private static final long serialVersionUID = 3822130903046424196L;

	public CustomSecurityUser() {}
	public CustomSecurityUser(User user) {
		this.setAuthorities(user.getAuthorities());
		this.setId(user.getId());
		this.setPassword(user.getPassword());
		this.setUsername(user.getUsername());
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

}
