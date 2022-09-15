package com.springboot.customdbsecurity.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springboot.customdbsecurity.Repository.UsersRepository;
import com.springboot.customdbsecurity.model.CustomUserDetails;
import com.springboot.customdbsecurity.model.Users;

@Service
public class CustomUserDetailsService implements UserDetailsService{
	@Autowired
    private UsersRepository usersRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
    	Optional<Users> optionalUsers = usersRepository.findByName(username);

        optionalUsers
                .orElseThrow(() -> new UsernameNotFoundException("Username not found"));
    
        //Map is going to Cloning 
        //CustomUserDetails -> Our object and UserDetails -> Spring security Object
        // CustomerUserDetails springData =new CustomerDetails();
       // springData.setUserName("UserObject of Username");
        //springData.setPassword("UserObject of password");
        //springData.isActive("true")
        //
        
        
       return optionalUsers
               .map(CustomUserDetails::new).get();
        
      
    }
}
