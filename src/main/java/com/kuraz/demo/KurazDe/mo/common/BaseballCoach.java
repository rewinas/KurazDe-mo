package com.kuraz.demo.KurazDe.mo.common;


import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

//    public  BaseballCoach (){
//        System.out.println(" In Constructor:" + getClass().getSimpleName());
//    }
    @Override
    public String getDailyWorkout() {
        return "This is Baseball Coach !";
    }
}
