package com.example.Account.Controller;

import com.example.Account.Entity.Account;
import com.example.Account.Service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AccountController {
    private final AccountService service;

    public AccountController(AccountService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }
    @PostMapping("/addNewAccount")
    public ResponseEntity<Account> addNewAccount(@RequestBody Account from){
        return ResponseEntity.ok(service.addNewAccount(from));

    }
    @GetMapping("/findById/{id}")
    public ResponseEntity<Account> getUser(@PathVariable String id){
        return new ResponseEntity(service.findById(id), HttpStatus.OK);
    }
    @GetMapping("/findAll")
    public ResponseEntity<List<Account>> getAll(){
        return new ResponseEntity(service.findAll(), HttpStatus.OK);
    }
    @PostMapping("/deleteById/{id}")
    public void deleteById(@PathVariable String id){
        service.deleteById(id);
    }



}
