//package com.IdeaMode.journalApp.controller;
//
//import com.IdeaMode.journalApp.entity.User;
//import com.IdeaMode.journalApp.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.security.oauth2.core.user.OAuth2User;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Optional;
//
//@RestController
////@RequestMapping("/")
////@CrossOrigin("*")
//public class AuthController {
//
//    @Autowired
//    private UserRepository userRepository;
//
////    @PostMapping("/signup")
//    public ResponseEntity<String> signUp(@RequestBody User user) {
//        if (userRepository.findByUsername(user.getUsername()).isPresent()) {
//            return ResponseEntity.badRequest().body("Username already exists");
//        }
//        userRepository.save(user);
//        return ResponseEntity.ok("Signup successful");
//    }
//
////    @PostMapping("/login")
//    public ResponseEntity<String> login(@RequestBody User user) {
//        Optional<User> foundUser = userRepository.findByUsername(user.getUsername());
//        if (foundUser.isPresent() && foundUser.get().getPassword().equals(user.getPassword())) {
//            return ResponseEntity.ok("Login successful");
//        }
//        return ResponseEntity.badRequest().body("Invalid credentials");
//    }
//
//    // New endpoint for OAuth2 user details
//    @GetMapping("/oauth2/user")
//    public ResponseEntity<String> getOAuth2User(@AuthenticationPrincipal OAuth2User principal) {
//        if (principal != null) {
//            String name = principal.getAttribute("name"); // Google: name, GitHub: login
//            String email = principal.getAttribute("email"); // Google/GitHub: email
//            return ResponseEntity.ok("Welcome, " + name + "! Your email is " + email);
//        }
//        return ResponseEntity.badRequest().body("User not authenticated");
//    }
//}