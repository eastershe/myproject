package com.kevin;

import java.util.ArrayList;
import java.util.List;

public class ReportTester {
    public static void main(String[] args) {
        Report finance = new FinanceReport();
        Report healthy = new HealthyReport();
        List<Report> reports = new ArrayList<>();
        reports.add(finance);
        reports.add(healthy);

        for (Report report : reports){
            report.load();
            report.print();
        }
    }
}
