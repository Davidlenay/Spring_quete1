package com.Spring.quete1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class DoctorController {

    @GetMapping("/doctor/1")
    @ResponseBody
    public String Doctor1() {
        return "Greetings from <a href='https://nsm09.casimages.com/img/2019/01/16//19011604490615263616078203.jpg'>William Hartnell!</a>";
        
    }
    

    @GetMapping("/doctor/10")
    @ResponseBody
    public String Doctor2() {
        return "Greetings from <a href='https://www.programme-tv.net/imgre/fit/~2~providerPerson~e0dc9d1115252b93.jpeg/300x300/quality/80/david-tennant.jpeg'>David Tennant!</a>";
        
    }

    @GetMapping("/doctor/13")
    @ResponseBody
    public String Doctor3() {
        return "Greetings from <a href='https://upload.wikimedia.org/wikipedia/commons/thumb/7/72/Jodie_Whittaker_by_Gage_Skidmore.jpg/1200px-Jodie_Whittaker_by_Gage_Skidmore.jpg'>Jodie Whittaker!</a>";
        
    }
}
