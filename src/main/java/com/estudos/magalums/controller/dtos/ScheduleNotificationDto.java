package com.estudos.magalums.controller.dtos;

import com.estudos.magalums.entity.Channel;
import com.estudos.magalums.entity.Notification;
import com.estudos.magalums.entity.Status;

import java.time.LocalDateTime;

public record ScheduleNotificationDto(LocalDateTime dateTime,
                                      String destination,
                                      String message,
                                      Channel.Values channel) {

    public Notification toNotification(){
        return new Notification(
            dateTime,
            destination,
            message,
            channel.toChannel(),
            Status.Values.PENDING.toStatus()
        );
    }

}
