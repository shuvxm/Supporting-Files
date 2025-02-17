//package com.IdeaMode.journalApp.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//
////        http
////                .authorizeHttpRequests(auth -> auth.anyRequest().authenticated())
////                .oauth2Login(Customizer.withDefaults());
////        return http.build();
//
//            http
//                    .authorizeHttpRequests(auth -> auth
//                            .requestMatchers("/", "/login").permitAll()
//                            .anyRequest().authenticated()
//                    )
//                    .oauth2Login(oauth2 -> oauth2
//                            .loginPage("/login")
//                            .defaultSuccessUrl("http://localhost:5173/dashboard") // Redirect to frontend
//                    );
//            return http.build();
//        }
//    }



// /* http
//                .authorizeHttpRequests(auth -> auth
//                        .requestMatchers("/", "/login**", "/error**").permitAll() // Public endpoints
//                        .anyRequest().authenticated() // All other endpoints require authentication
//                )
//                .oauth2Login(oauth2 -> oauth2
//                        .loginPage("/login") // Custom login page (optional)
//                        .defaultSuccessUrl("/home", true) // Redirect after successful login
//                )
//                .logout(logout -> logout
//                        .logoutSuccessUrl("/").permitAll() // Redirect after logout
//                );
//    */