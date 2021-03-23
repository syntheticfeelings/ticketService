package com.syntheticfeelings.ticketService.controller;

import com.syntheticfeelings.ticketService.domain.Payment;
import com.syntheticfeelings.ticketService.dto.ScheduleDTO;
import com.syntheticfeelings.ticketService.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/application/response/")
public class ApplicationsForPaymentController {

    @Autowired
    private PaymentService paymentService;

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public void acceptanceOfApplication(@RequestBody @Valid ScheduleDTO schedule) {
        paymentService.createRequest(schedule);
    }

    @GetMapping
    public Payment checkPayment(@RequestParam Long id) {
        return paymentService.checkPayment(id);
    }
}
