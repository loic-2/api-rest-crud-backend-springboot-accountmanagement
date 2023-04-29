package com.example.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.models.Account;
import com.example.responses.Response;

@Service
public interface AccountService {
    Response addAccount(Account account);
    List<Account> getAllAccount();
    Account getAccount(Long id);
    Response deleteAccount(Long id);
    Response modifyAccount(Account account);
}
