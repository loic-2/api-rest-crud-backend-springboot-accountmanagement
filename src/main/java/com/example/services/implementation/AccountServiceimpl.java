package com.example.services.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.models.Account;
import com.example.repository.AccountRepository;
import com.example.responses.Response;
import com.example.services.AccountService;

@Service
public class AccountServiceimpl implements AccountService{

    private AccountRepository accountRepository;
    private Response response;


    public AccountServiceimpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
        response= new Response();
    }


    @Override
    public Response addAccount(Account account) {
        try {
            this.accountRepository.save(account);
            this.response.setCode(200);
            this.response.setMessage("Enregistrement reussi");
        } catch (Exception e) {
            this.response.setCode(500);
            this.response.setMessage("Erreur est survenue lors de l'enregistrement");
        }
        return this.response;
    }

    @Override
    public List<Account> getAllAccount() {
        return this.accountRepository.findAll();
    }

    @Override
    public Account getAccount(Long id) {
        if (this.accountRepository.findById(id).isPresent()) {
            return this.accountRepository.findById(id).orElseThrow();
        }
        return null;
    }

    @Override
    public Response deleteAccount(Long id) {
        try {
            this.accountRepository.deleteById(id);
            this.response.setCode(200);
            this.response.setMessage("Suppression reussi");
        } catch (Exception e) {
            this.response.setCode(500);
            this.response.setMessage("Echec de la suppression");
        }
        return this.response;
    }

    @Override
    public Response modifyAccount(Account account) {
        try {
            Account result= this.accountRepository.findById(account.getId()).orElseThrow();
            result.setAccountNumber(account.getAccountNumber());
            result.setAgency(account.getAgency());
            result.setAmount(account.getAmount());
            result.setCin(account.getCin());
            result.setFirstName(account.getFirstName());
            result.setLastName(account.getLastName());
            this.accountRepository.save(result);
            this.response.setCode(200);
            this.response.setMessage("Modification reussi");
        } catch (Exception e) {
            this.response.setCode(500);
            this.response.setMessage("Echec de la modification");
        }
        return  this.response;
    }
    
}
