package com.example.SalesMgmt.Repository;

import com.example.SalesMgmt.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends JpaRepository <User, Integer>{
}
