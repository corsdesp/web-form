package com.example.form.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
public class PageController {

    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public ModelAndView showDashboard() {
        return new ModelAndView("dashboard.html", "filmCard", new FilmCard());
    }

    @RequestMapping(value = "/addFilmCard", method = RequestMethod.POST)
    public String addFilmCard(@ModelAttribute("filmCard") FilmCard filmCard,
                              BindingResult result, ModelMap modelMap) {
        if (result.hasErrors()) {
            return "error";
        }
        return "success";
    }

    @GetMapping("/dash")
    public String asd() {
        return "dashboard.html";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(HttpServletRequest request, HttpServletResponse response) {
        Map myMap = request.getParameterMap();
        System.out.println(myMap);

        myMap.forEach((k, v) -> System.out.println("key: " + k + " value:" + v));
        return "success";
    }
}
