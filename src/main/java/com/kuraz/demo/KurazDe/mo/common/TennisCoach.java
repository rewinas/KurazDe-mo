package com.kuraz.demo.KurazDe.mo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    public  TennisCoach (){
        System.out.println(" In Constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "This is Tennis Coach !!";
    }
}
