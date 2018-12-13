package com.example.usereventsearch.Repository;

import com.example.usereventsearch.Entity.UserEvent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Iterator;

@Repository
public interface UserEventRepo extends CrudRepository<UserEvent,Integer> {


    Iterable<UserEvent> findByTimeStampBetween(Long startTime,Long endTime);

    Iterable<UserEvent> findByUserId(String userId);
}
