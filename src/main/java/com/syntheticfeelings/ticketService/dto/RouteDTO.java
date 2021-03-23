package com.syntheticfeelings.ticketService.dto;

import com.syntheticfeelings.ticketService.domain.City;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RouteDTO {
    private String number;
    private City cityFrom;
    private City cityTo;
}
