package com.example.usereventsearch.Entity;


import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class UserEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String type;
    String userId;
    String context;
    Long timeStamp;

    public UserEvent(){}

    @Builder
    public UserEvent(String type, String userId, String context, Long timeStamp) {
        this.type = type;
        this.userId = userId;
        this.context = context;
        this.timeStamp = timeStamp;
    }
}
