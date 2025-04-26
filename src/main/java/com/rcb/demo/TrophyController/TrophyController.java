package com.rcb.demo.TrophyController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Controller
public class TrophyController {

    @GetMapping("/")
    public String showCounter(Model model) {
        LocalDate iplStart = LocalDate.of(2008, 4, 18);
        LocalDate now = LocalDate.now();

        model.addAttribute("years", ChronoUnit.YEARS.between(iplStart, now));
        model.addAttribute("days", ChronoUnit.DAYS.between(iplStart, now) % 365);
        return "index";
    }
}