package com.devsuperior.aula.services;

import org.springframework.stereotype.Service;

import com.devsuperior.aula.entities.Employee;

@Service
public class SalaryService {

    private PensionService pensionService;
    private TaxService taxService;

    public SalaryService(PensionService pensionService, TaxService taxService) {
        this.pensionService = pensionService;
        this.taxService = taxService;
    }

    public Double netSalary(Employee employee) {
        return employee.getGrossSalary() - taxService.tax(employee.getGrossSalary())
        - pensionService.discount(employee.getGrossSalary());
    }

    
}
