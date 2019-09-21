package com.geekshirt.customerservice.controllers;

import com.geekshirt.customerservice.dto.AccountDto;
import com.geekshirt.customerservice.entities.Account;
import com.geekshirt.customerservice.services.CustomerService;
import com.geekshirt.customerservice.util.AccountConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private AccountConverter accountConverter;

    @GetMapping(value = "account/{id}")
    public ResponseEntity<AccountDto> findAccountById(@PathVariable("id") Long id) {
        Account account = customerService.findAccountById(id);
        return new ResponseEntity<>(accountConverter.convertAccountToDto(account), HttpStatus.ACCEPTED);
    }
}
