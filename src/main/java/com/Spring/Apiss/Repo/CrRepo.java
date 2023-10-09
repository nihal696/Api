package com.Spring.Apiss.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.Apiss.Entity.CricketManagement;

public interface CrRepo extends JpaRepository<CricketManagement, Integer>{

	CricketManagement save(int jerseyNo);

}
