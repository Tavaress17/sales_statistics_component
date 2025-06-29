package com.ifsp.luan.sales_statistics_component.provided;

import java.util.List;
import org.junit.jupiter.api.*;

import com.ifsp.luan.sales_statistics_component.internal.SalesStatistics;
import com.ifsp.luan.sales_statistics_component.provided.sales.SalesStatisticsInterfacePort;

class SalesStatisticsInterfacePortTest {

    private SalesStatisticsInterfacePort port;
    private SalesStatistics statistics;

    @BeforeEach
    void setUp() {
        this.port = new SalesStatisticsInterfacePort("port.sales");
        this.statistics = new SalesStatistics();
        this.port.setInternalReference(this.statistics);
    }

    @Test
    void testTotal() {
        double result = this.port.total(List.of(100.0, 200.0, 300.0));
        Assertions.assertEquals(600.0, result);
    }

    @Test
    void testAverage() {
        double result = this.port.average(List.of(100.0, 200.0, 300.0));
        Assertions.assertEquals(200.0, result);
    }
    
    @Test
    void testMax() {
        double result = this.port.max(List.of(100.0, 200.0, 300.0));
        Assertions.assertEquals(300.0, result);
    }

    @Test
    void testMin() {
        double result = this.port.min(List.of(100.0, 200.0, 300.0));
        Assertions.assertEquals(100.0, result);
    }
}