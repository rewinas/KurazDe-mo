package com.kuraz.demo.KurazDe.mo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
//    public  TrackCoach (){
//        System.out.println(" In Constructor:" + getClass().getSimpleName());
//    }
    @Override
    public String getDailyWorkout(){
        return  "This is Track Coach!";
    }
}
