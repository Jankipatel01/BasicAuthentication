/*
 * package com.example.demo.services;
 * 
 * import org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.core.userdetails.UsernameNotFoundException;
 * import org.springframework.stereotype.Service;
 * 
 * import com.example.demo.Model.User; import
 * com.example.demo.Repository.UserRepo;
 * 
 * @Service public class CustomUserDetailsService implements UserDetailsService
 * {
 * 
 * private final UserRepo userRepository;
 * 
 * public CustomUserDetailsService(UserRepo userRepository) {
 * this.userRepository = userRepository; }
 * 
 * @Override public UserDetails loadUserByUsername(String username) throws
 * UsernameNotFoundException { User user =
 * userRepository.findByUsername(username);
 * 
 * if (user == null) { throw new
 * UsernameNotFoundException("User not found with username: " + username); }
 * 
 * return (UserDetails) user; }
 * 
 * }
 */