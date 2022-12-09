package com.crypto.walletmanager.business;

import com.crypto.walletmanager.business.portfolio.Portfolio;

import java.util.List;
import java.util.Optional;

public interface BusinessRepository<T, ID> {
    void save(T model);
    void deleteAll();
    void deleteById(ID id);
    List<T> findAll();
    Optional<Portfolio> findById(ID id);
}
