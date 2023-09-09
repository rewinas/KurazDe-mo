package com.kuraz.demo.KurazDe.mo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private  String teamName;

//    @GetMapping("/")
    public String sayHello(){
        return " Hello, Biruk Mamo ";
    }

    //new endpoint
//    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return " Coach: " + coachName + " , Team Name " + teamName;
    }

}
