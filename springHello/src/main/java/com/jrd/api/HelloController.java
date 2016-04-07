package com.jrd.api;

import com.jrd.config.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.PrintStream;

/**
 * Created by jrd on 2016-04-07.
 */
@RestController
public class HelloController {

    private final static PrintStream ou = System.out;

    private final static String msg = "Hello Worldaaa! Uazzaaaa!!!";

    private final HelloProperties helloProperties;

    @Autowired
    public HelloController(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    @RequestMapping("/")
    public String home() {
        ou.println(msg);
        ou.print("Zaladowany property = " + helloProperties.getTestProps().getTestStr());
        return msg;
    }
}
