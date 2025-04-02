package com.itzHiru.ExpenseTracker.services.expense;

import com.itzHiru.ExpenseTracker.dto.ExpenseDTO;
import com.itzHiru.ExpenseTracker.entity.Expense;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExpenseService {
    Expense postExpense(ExpenseDTO expenseDTO);
    List<Expense> getAllExpenses();
}
