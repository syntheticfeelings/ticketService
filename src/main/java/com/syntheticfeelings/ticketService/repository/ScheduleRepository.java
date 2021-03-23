package com.syntheticfeelings.ticketService.repository;

import com.syntheticfeelings.ticketService.domain.Schedule;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ScheduleRepository extends CrudRepository<Schedule, Long> {
    List<Schedule> findAll();
    Schedule findByRouteIdAndDate(Long routeId, String date);
}
