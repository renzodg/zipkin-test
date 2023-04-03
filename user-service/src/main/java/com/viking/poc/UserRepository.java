package com.viking.poc;

import lombok.SneakyThrows;
import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.cloud.sleuth.annotation.SpanTag;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

  @SneakyThrows
  @NewSpan("get-full-name-from-db")
  public String getFullName(@SpanTag("userId") String id) {
    Thread.sleep(800L);
    return "John Smith";
  }

  @SneakyThrows
  @NewSpan("store-user-to-db")
  public void createUser() {
    Thread.sleep(800L);
  }
}
