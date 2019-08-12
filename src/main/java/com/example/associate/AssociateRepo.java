package com.example.associate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssociateRepo extends JpaRepository<Associate, Long> {

	
	/*
	 * @Query("select a from Associate a join a.project p p.associate aa where ")
	 * public Set<Associate> getAssociatees(Long id);
	 */
	 
	 
	
}
