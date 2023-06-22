package com.wildcodeschool.Doctors2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

@Controller
public class DoctorController {

    @RequestMapping("/doctor/{number}")
    public @ResponseBody String getDoctor(@PathVariable("number") int number) {
        if (number >= 1 && number <= 8) {
            throw new ResponseStatusException(HttpStatus.SEE_OTHER, "303 See Other");
        } else if (number == 9) {
            return "{'number':9,'name':'Christopher Eccleston'}";
        } else if (number == 10) {
            return "{'number':10,'name':'David Tennant'}";
        } else if (number == 11) {
            return "{'number':11,'name':'Matt Smith'}";
        } else if (number == 12) {
            return "{'number':12,'name':'Peter Capaldi'}";
        } else if (number == 13) {
            return "{'number':13,'name':'Jodie Whittaker'}";
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "404 Not Found");
        }
    }
}
