package org.hivebyte.airlinereservationsystem.controller.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutUsController {

    @GetMapping("/about-us")
    public String showAboutPage(Model model) {
//        // Add any dynamic attributes to the model here
//        model.addAttribute("someDynamicContent", "Some dynamic data if needed");
        return "about-us"; // Refers to about-us.html Thymeleaf template
    }
}
