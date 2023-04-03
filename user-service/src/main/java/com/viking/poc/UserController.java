package com.viking.poc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.annotation.ContinueSpan;
import org.springframework.cloud.sleuth.annotation.SpanTag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

  @Autowired
  private UserService userService;

  @ContinueSpan
  @GetMapping("/{id}")
  public User getUser(@PathVariable String id, @SpanTag("query.filter") @RequestParam boolean filter) {
    log.info(String.valueOf(filter));
    return userService.getUserData(id);
  }

  @ContinueSpan
  @PostMapping
  public void createUser(@SpanTag("payload") @RequestBody User user) {
    userService.createUser(user);
  }
}
