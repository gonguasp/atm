package com.atm.controller;

import com.atm.exception.NotValidUserException;
import com.atm.service.TokenService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TokenController {

  @Autowired
  private TokenService tokenService;

  @GetMapping("/get-access-token")
  public ResponseEntity<String> getAccessToken() throws NotValidUserException {
    return tokenService.generateToken();
  }
}
