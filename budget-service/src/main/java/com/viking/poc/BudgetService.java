package com.viking.poc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BudgetService {

  @Autowired
  private BudgetRepository budgetRepository;

  public Double getBudget () {
    return budgetRepository.getBudgetAmount();
  }

}
