package com.SpringBootJPA.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.SpringBootJPA.demo.Model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer> {

	//CrudRepository<Alien, Integer>
	List<Alien> findByTech(String java);

	//List<Alien> findByGreaterThan(int i);

	// findByTech values should be sorted using queries as below
	/*
	 * @Query("from alien where tech=?1 order by aName") List<Alien>
	 * findByTechSorted(String java);
	 */
}
