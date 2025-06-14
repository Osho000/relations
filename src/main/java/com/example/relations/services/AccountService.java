package com.example.relations.services;

import com.example.relations.DTO.AccountDTO;
import com.example.relations.DTO.HobbyDTO;
import com.example.relations.entity.Account;

import java.util.List;

public interface AccountService {
    AccountDTO create(AccountDTO hobby);
    AccountDTO findById(Long id);
    List<AccountDTO> getAll();
    AccountDTO update(Long id, AccountDTO hobby);
    void delete(Long id);
}
