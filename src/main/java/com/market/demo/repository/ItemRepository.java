package com.market.demo.repository;

import com.market.demo.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item,Integer> {
    public Item findItemById(Integer id);
//    public List<Item> findItems();
}
