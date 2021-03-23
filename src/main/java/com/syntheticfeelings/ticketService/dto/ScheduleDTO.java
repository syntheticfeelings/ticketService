package com.syntheticfeelings.ticketService.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ScheduleDTO {
    private Long routeId;
    private String date;
}
