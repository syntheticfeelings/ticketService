package com.syntheticfeelings.ticketService.service;

import com.syntheticfeelings.ticketService.domain.Payment;
import com.syntheticfeelings.ticketService.domain.PaymentStatus;
import com.syntheticfeelings.ticketService.domain.Schedule;
import com.syntheticfeelings.ticketService.dto.ScheduleDTO;
import com.syntheticfeelings.ticketService.repository.PaymentRepository;
import com.syntheticfeelings.ticketService.repository.ScheduleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PaymentService {

    // стоит ли разделить на два разных сервиса? PaymentService, ScheduleService??

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private ScheduleRepository scheduleRepository;

    public void createRequest(ScheduleDTO route) {
        Schedule schedule = scheduleRepository.findByRouteIdAndDate(route.getRouteId(), route.getDate());
        if (schedule != null) {
            createPayment(schedule);
            log.info("CREATE PAYMENT");
        }
    }

    public Payment createPayment(Schedule validSchedule) {
        Payment dto = new Payment();
        dto.setScheduleId(validSchedule);
        dto.setStatus(PaymentStatus.PROCESSED);
        log.info("CREATED");
        return paymentRepository.save(dto);
    }

    public Payment checkPayment(Long id) {
        Payment payment = paymentRepository.findById(id).get();
        if (payment != null) {
            log.info("PAYMENT IS NOT FOUND");
            return null;
        }
        return payment;
    }
}
