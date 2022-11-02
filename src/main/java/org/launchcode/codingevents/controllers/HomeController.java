//Teresa Tull worked on this on 10-22-2022 ch 13 work
// 10-30-2022 work on ch 15

package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Chris Bay
 */
@Controller
public class HomeController {

    @GetMapping
    public String index() {
        return "index";
    }

}