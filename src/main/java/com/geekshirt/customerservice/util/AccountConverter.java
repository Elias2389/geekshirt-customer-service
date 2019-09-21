package com.geekshirt.customerservice.util;

import com.geekshirt.customerservice.dto.AccountDto;
import com.geekshirt.customerservice.entities.Account;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountConverter {

    @Autowired
    private ModelMapper modelMapper;

    public AccountDto convertAccountToDto(Account account) {
        return modelMapper.map(account, AccountDto.class);
    }
}
