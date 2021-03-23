package com.syntheticfeelings.ticketService.dto;

import com.syntheticfeelings.ticketService.domain.PaymentStatus;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PaymentDTO {
    private Long schedule;
    private PaymentStatus status;
}
