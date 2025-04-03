package com.itzHiru.ExpenseTracker.services.stats;

import com.itzHiru.ExpenseTracker.dto.GraphDTO;
import com.itzHiru.ExpenseTracker.dto.StatsDTO;

public interface StatsService {
    GraphDTO getChartData();

    StatsDTO getStats();
}
