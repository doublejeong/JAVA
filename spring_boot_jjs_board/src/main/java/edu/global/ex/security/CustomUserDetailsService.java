package edu.global.ex.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import edu.global.ex.mapper.UserMapper;
import edu.global.ex.vo.CustomUserDetailsVO;
import edu.global.ex.vo.UserVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		log.warn("Load User By UserVO number: " + username);
	
		UserVO user = userMapper.getUser(username);
		
		log.warn("Queried By UserVO mapper: " + user);

		return user == null ? null : new CustomUserDetailsVO(user);
	}
	
}