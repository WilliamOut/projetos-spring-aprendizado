package com.devsuperior.aula.services;

import org.springframework.stereotype.Service;

@Service
public class TaxService {
    
    public Double tax(Double amount) {
        return amount * 0.2;
    }
}
