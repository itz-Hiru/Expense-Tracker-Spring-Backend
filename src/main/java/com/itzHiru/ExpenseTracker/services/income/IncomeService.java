package com.itzHiru.ExpenseTracker.services.income;

import com.itzHiru.ExpenseTracker.dto.IncomeDTO;
import com.itzHiru.ExpenseTracker.entity.Income;
import org.springframework.stereotype.Service;

@Service
public interface IncomeService {
    Income postIncome(IncomeDTO incomeDTO);
}
