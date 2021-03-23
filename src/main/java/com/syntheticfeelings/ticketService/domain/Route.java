package com.syntheticfeelings.ticketService.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "routes")
@Getter
@Setter
@ToString
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "route_id")
    private Long routeId;

    @ManyToOne
    private City cityFrom;

    @ManyToOne
    private City cityTo;
}
