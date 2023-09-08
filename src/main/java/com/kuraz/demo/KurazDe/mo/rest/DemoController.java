package com.kuraz.demo.KurazDe.mo.rest;

import com.kuraz.demo.KurazDe.mo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
//define private field for dependency

    //This is Field Injection
//    @Autowired
    private Coach myCoach;

    //define a constructor for dependency injection
    @Autowired
    public DemoController(@Qualifier("swimCoach") Coach theCoach){
        System.out.println("In Constructor :" + getClass().getSimpleName());
        myCoach = theCoach;
    }


    //define setter for dependency injection
//    @Autowired
//    public void setCoach(Coach theCoach){
//  myCoach = theCoach;
//    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkOut(){
        return myCoach.getDailyWorkout();
    }
}
