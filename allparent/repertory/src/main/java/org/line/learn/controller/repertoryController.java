package org.line.learn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/repertory")
public class repertoryController {

    @RequestMapping("/total")
    public Integer getTotalNumber(String key){
        return 72345679;
    }
}
