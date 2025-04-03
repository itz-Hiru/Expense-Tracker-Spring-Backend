package com.itzHiru.ExpenseTracker.dto;

import com.itzHiru.ExpenseTracker.entity.Expense;
import com.itzHiru.ExpenseTracker.entity.Income;
import lombok.Data;

import java.util.List;

@Data
public class GraphDTO {
    private List<Expense> expenseList;
    private List<Income> incomeList;
}
