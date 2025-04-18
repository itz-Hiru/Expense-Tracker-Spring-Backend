package com.itzHiru.ExpenseTracker.services.income;

import com.itzHiru.ExpenseTracker.dto.IncomeDTO;
import com.itzHiru.ExpenseTracker.entity.Income;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IncomeService {
    Income postIncome(IncomeDTO incomeDTO);

    Income updateIncome(Long id, IncomeDTO incomeDTO);

    List<IncomeDTO> getAllIncomes();

    IncomeDTO getIncomeById(Long id);

    void deleteIncome(Long id);
}
