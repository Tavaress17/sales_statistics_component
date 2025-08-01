package com.ifsp.luan.sales_statistics_component.required.sales;

import java.util.List;

public interface RequiredSalesStatistics {
    double total(List<Double> sales);
    double average(List<Double> sales);
    double max(List<Double> sales);
    double min(List<Double> sales);
}