package com.capgebank.accounts.repository;

import com.capgebank.accounts.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountsRepository extends JpaRepository<Account, Long> {

   Optional<Account> findByCustomerId(long customerId);
}
