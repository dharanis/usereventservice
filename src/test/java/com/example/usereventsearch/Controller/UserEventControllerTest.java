package com.example.usereventsearch.Controller;


import com.example.usereventsearch.Entity.UserEvent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserEventControllerTest {


    @Mock
    UserEventController userEventController;

    @Test
    public void createUserEventTest(){
        UserEvent userEvent = UserEvent.builder().userId("873949832-djshf8-897987").context("testing purpose").timeStamp(8797L).type("test").build();
        when(userEventController.createUserEvent(userEvent)).thenReturn(userEvent);
        UserEvent actual = userEventController.createUserEvent(userEvent);
        verify(userEventController,times(1)).createUserEvent(userEvent);


    }

    @Test
    public void getEventByUserIdTest(){
        Iterable<UserEvent> userEvent = null;
        when(userEventController.getEventsByUserId(anyString())).thenReturn(userEvent);
        userEvent = userEventController.getEventsByUserId("787-f643-fdh67-k877878");
        verify(userEventController,times(1)).getEventsByUserId(anyString());

    }

    @Test
    public void getUserEventWithTime(){
        Iterable<UserEvent> userEvent = null;
        when(userEventController.getUserEventWithTime(anyLong(),anyLong())).thenReturn(userEvent);
        userEvent = userEventController.getUserEventWithTime(8978L,9000L);
        verify(userEventController,times(1)).getUserEventWithTime(anyLong(),anyLong());

    }


}
