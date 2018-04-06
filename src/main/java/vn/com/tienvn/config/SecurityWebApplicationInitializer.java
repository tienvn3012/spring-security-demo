package vn.com.tienvn.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer{

	public SecurityWebApplicationInitializer() {
		super(SpringSecurityConfig.class);
		// TODO Auto-generated constructor stub
	}

	
}
