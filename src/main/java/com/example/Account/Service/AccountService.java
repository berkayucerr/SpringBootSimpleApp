package com.example.Account.Service;

import com.example.Account.Entity.Account;
import com.example.Account.Repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    private final AccountRepository repository;

    public AccountService(AccountRepository repository) {
        this.repository = repository;
    }

    public Account addNewAccount(Account from){
        return (repository.save(from));
    }
    public void deleteById(String id){
        repository.deleteById(id);

    }
    public List<Account> findAll(){
        return repository.findAll();
    }
    public Optional<Account> findById(String id){
        return repository.findById(id);
    }



}
