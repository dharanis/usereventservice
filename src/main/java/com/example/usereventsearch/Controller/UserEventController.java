package com.example.usereventsearch.Controller;


import com.example.usereventsearch.Entity.UserEvent;
import com.example.usereventsearch.Repository.UserEventRepo;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.util.Iterator;

@RestController
@RequestMapping("/report")
public class UserEventController {

    UserEventRepo userEventRepo;

    public UserEventController(UserEventRepo userEventRepo){
        this.userEventRepo=userEventRepo;
    }

    @PostMapping("/user/event")
    public UserEvent createUserEvent(@RequestBody UserEvent event){
        return userEventRepo.save(event);
    }

    @GetMapping("/register/users/{startTime}/{endTime}")
    public Iterable<UserEvent> getUserEventWithTime(@PathVariable Long startTime,@PathVariable Long endTime){
        return userEventRepo.findByTimeStampBetween(startTime,endTime);
    }

    @GetMapping("/register/user/{userId}")
    public Iterable<UserEvent> getEventsByUserId(@PathVariable String userId){
        return userEventRepo.findByUserId(userId);
    }
}
