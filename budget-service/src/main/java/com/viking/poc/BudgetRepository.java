package com.viking.poc;

import lombok.SneakyThrows;
import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.stereotype.Repository;

@Repository
public class BudgetRepository {

  @SneakyThrows
  @NewSpan("get-budget-from-elasticsearch")
  public Double getBudgetAmount() {
    Thread.sleep(300L);
    return 253.40;
  }

}
