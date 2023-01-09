package com.greatlearning.bed.tms.assesment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.greatlearning.bed.tms.assesment.databasemodel.TicketModel;
@Repository
public interface UpdateTicketRepository extends JpaRepository<TicketModel, Long>{
	
	
	@Transactional
	@Modifying
	@Query(value="update TICKET_RECORDS u set u.ticket_title = :ticket_title, u.ticket_description = :ticket_description, u.ticket_created_date = :ticket_created_date where u.id = :id", nativeQuery = true)
	void updateEmployeeRecord(@Param("ticket_title")String ticket_title, @Param("ticket_description")String ticket_description,@Param("ticket_created_date")String ticket_created_date,@Param("id")long id);


}
