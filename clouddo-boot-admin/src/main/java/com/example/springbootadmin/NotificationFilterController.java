package com.example.springbootadmin;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Easettle
 */
@RestController
public class NotificationFilterController {


    @RequestMapping("notifications/filters")
    public void notificationFile(){
        System.out.println("NotificationFilterController.notificationFile ===== =======");
    }
}
