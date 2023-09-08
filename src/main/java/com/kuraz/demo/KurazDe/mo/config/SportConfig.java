package com.kuraz.demo.KurazDe.mo.config;

import com.kuraz.demo.KurazDe.mo.common.Coach;
import com.kuraz.demo.KurazDe.mo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

@Bean

    public Coach swimCoach(){
    return new SwimCoach();
}
}
