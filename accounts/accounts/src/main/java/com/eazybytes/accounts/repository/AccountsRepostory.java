package com.eazybytes.accounts.repository;

import com.eazybytes.accounts.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepostory extends JpaRepository <Accounts, Long> {
}
