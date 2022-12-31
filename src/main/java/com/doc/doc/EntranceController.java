package com.doc.doc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntranceController {

    @RequestMapping("/")
    String display() {
        return "hello";
    }
}
