package com.market.demo.repository;

import com.market.demo.entity.Bill;
import com.market.demo.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BillRepository extends JpaRepository<Bill,Integer> {
    public Bill findBillById(Integer id);
    public List<Bill> findBillsByUsername(String username);
}
