package com.example.Login.userSchedular;


import com.example.Login.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class LogShedular {

    @Autowired
    private LogRepository rep;

    @Scheduled(cron = "5 * * * * ?")
    public void method()
    {
        System.out.println("Number of users logged in = "+rep.count());
    }

}
