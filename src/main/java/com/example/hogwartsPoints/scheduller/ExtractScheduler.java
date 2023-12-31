package com.example.hogwartsPoints.scheduller;

import com.example.hogwartsPoints.service.PointsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Slf4j
@RequiredArgsConstructor
public class ExtractScheduler {
    private final PointsService pointsService;
//    @Scheduled(cron = "*/10 * * * * *")
    @Scheduled(cron = "0 0 8,16 * * *")
    public void creditPoints() {
        log.info("creditPoints() - 'Schedule Started'");
        pointsService.creditPointsOfConfirmedOrders();
    }
}
