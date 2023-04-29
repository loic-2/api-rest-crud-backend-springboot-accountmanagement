package com.example.mapping;

import com.example.models.Account;
import com.example.responses.RequestDto;
import com.example.responses.ResponseDto;

public class MapDto {
    public static ResponseDto accountToResponseDto(Account account){
        ResponseDto responseDto= new ResponseDto();
        responseDto.setAgence(account.getAgency());
        responseDto.setCni(account.getCin());
        responseDto.setId(account.getId());
        responseDto.setNom(account.getFirstName());
        responseDto.setPrenom(account.getLastName());
        responseDto.setNumero(account.getAccountNumber());
        responseDto.setSolde(account.getAmount());
        return responseDto;
    }

    public static Account RequestDtoToAccount(RequestDto requestDto){
        Account account= new Account();
        account.setAccountNumber(requestDto.getNumero());
        account.setAgency(requestDto.getAgence());
        account.setAmount(requestDto.getSolde());
        account.setFirstName(requestDto.getNom());
        account.setLastName(requestDto.getPrenom());
        account.setCin(requestDto.getCni());
        account.setId(requestDto.getId());
        System.out.println(account.toString());
        return account;
    }
}
