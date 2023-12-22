package com.example.maintanencerequestserver.domain.models;

import com.example.maintanencerequestserver.domain.maintenceRequest.models.MaintenceRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class MaintenceRequestTest {

    @Test
    public void maintenceReqeustConstructorTest(){
        MaintenceRequest maintenceRequest = new MaintenceRequest("Lusine","Kenneth","luluisgreat","332","Leaky Sink",new Date());

        String expected = "";
        String actual = maintenceRequest.toString();

        Assertions.assertEquals(expected,actual);
    }
}
