package pl.akademiakodu.AK_Spring_ExerciseFilesSort.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DescController {

    @GetMapping("/desc") public String descGet(){
        return "desc";
    }

}