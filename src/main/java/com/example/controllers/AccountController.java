package com.example.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapping.MapDto;
import com.example.models.Account;
import com.example.responses.RequestDto;
import com.example.responses.Response;
import com.example.responses.ResponseDto;
import com.example.services.implementation.AccountServiceimpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/account")
public class AccountController {
    private AccountServiceimpl accountServiceimpl;

    public AccountController(AccountServiceimpl accountServiceimpl) {
        this.accountServiceimpl=accountServiceimpl;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ResponseDto> getAccount(@PathVariable Long id){
        return new ResponseEntity<ResponseDto>(MapDto.accountToResponseDto(this.accountServiceimpl.getAccount(id)), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<ResponseDto>> getAllAccount(){
        ArrayList<ResponseDto> acconts= new ArrayList<>();
        for (Account account: this.accountServiceimpl.getAllAccount()) {
            acconts.add(MapDto.accountToResponseDto(account));
        }
        return new ResponseEntity<List<ResponseDto>>(acconts, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Response> saveAccount(@RequestBody RequestDto requestDto){
        return new ResponseEntity<Response>(this.accountServiceimpl.addAccount(MapDto.RequestDtoToAccount(requestDto)), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Response> updateAccount(@RequestBody RequestDto requestDto){
        return new ResponseEntity<Response>(this.accountServiceimpl.modifyAccount(MapDto.RequestDtoToAccount(requestDto)), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Response> deleteAccount(@PathVariable Long id){
        return new ResponseEntity<Response>(this.accountServiceimpl.deleteAccount(id), HttpStatus.OK);
    }


}
