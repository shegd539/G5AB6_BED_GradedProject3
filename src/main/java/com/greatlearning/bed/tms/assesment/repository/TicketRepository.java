package com.greatlearning.bed.tms.assesment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.bed.tms.assesment.databasemodel.TicketModel;

@Repository
public interface TicketRepository extends JpaRepository<TicketModel, Long>{


}
