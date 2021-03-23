package com.syntheticfeelings.ticketService.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="schedule")
@Getter
@Setter
@ToString
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "schedule_id")
    private Long scheduleId;

    @ManyToOne
    private Route routeId;

    @Column(name = "date")
    private String date;

    @Column(name = "time")
    private String time;

}
