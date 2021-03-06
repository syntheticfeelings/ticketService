package com.syntheticfeelings.ticketService.repository;

import com.syntheticfeelings.ticketService.domain.Payment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends CrudRepository<Payment, Long> {

}
