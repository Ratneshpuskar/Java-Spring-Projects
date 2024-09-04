package com.iiht.store.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MilkRepository extends JpaRepository<String, Integer> {

}
