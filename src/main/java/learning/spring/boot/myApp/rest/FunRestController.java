package learning.spring.boot.myApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // Injecting Properties
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // Exposing new endpoint for team info
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach : " + coachName + " Team Name : " +  teamName;
    }

    // expose "/" endpoint that will simpy return hello world
    @GetMapping("/")
    public String sayHello(){
        return "Hello World , Ankit  !!";
    }
    // expose "/workout" endpoint
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5KM !!";
    }


}
