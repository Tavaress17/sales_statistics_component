package com.ifsp.luan.sales_statistics_component.internal;

import java.util.List;
import org.junit.jupiter.api.*;

class SalesStatisticsTest {
    private SalesStatistics salesStatistics;

    @BeforeEach
    void setUp() {
        this.salesStatistics = new SalesStatistics();
    }

    @Test
    void testTotal() {
        double result = this.salesStatistics.total(List.of(100.0, 200.0, 300.0));
        Assertions.assertEquals(600.0, result);
    }

    @Test
    void testAverage() {
        double result = this.salesStatistics.average(List.of(100.0, 200.0, 300.0));
        Assertions.assertEquals(200.0, result);
    }

    @Test
    void testMax() {
        double result = this.salesStatistics.max(List.of(100.0, 200.0, 300.0));
        Assertions.assertEquals(300.0, result);
    }

    @Test
    void testMin() {
        double result = this.salesStatistics.min(List.of(100.0, 200.0, 300.0));
        Assertions.assertEquals(100.0, result);
    }
}