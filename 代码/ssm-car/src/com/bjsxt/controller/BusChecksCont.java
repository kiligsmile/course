package com.bjsxt.controller;

import com.bjsxt.pojo.BusChecks;
import com.bjsxt.service.BusChecksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/BusChecksCont")
public class BusChecksCont  {

    @Autowired
    BusChecksService  busChecksService;

    @RequestMapping("BusChecksSave")
    @ResponseBody
    public Map<String,String>   BusChecksSave(BusChecks busChecks,String carnumber){

        return busChecksService.save(busChecks,carnumber);

    }
}
