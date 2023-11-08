package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
public class SkillsController {

    // handler that corresponds to localhost:8080
    @GetMapping("/")
    public String displayHomePage(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker </h1>" +
                "<h2> We have a few skills we would like to learn. here is the list!</h2>"+
                "<ol>" +
                    "<li>Java</li>" +
                    "<li>JavaScript</li>" +
                    "<li>Python</li>" +
                    "<li>HTML</li>" +
                "</ol>" +
                "<p> Click <a href= '/form'> here</a> to select your favourite.</p>" +
                "</body>" +
                "</html>";

    }
    // handler that corresponds to localhost:8080/form to display form
    @GetMapping("/form")
    public String displaySkillForm(){
        return "<html>" +
                "<body>" +
                "<form action='/form' method='POST'>"+
                    "<h3>Name:<h3>" +
                        "<input type='text' name='userName'></input>" +
                    "<h3>My favorite language:</h3>" +
                        "<select name='option1'>" +
                            "<option>Java</option>" +
                            "<option>JavaScript</option>" +
                            "<option>Python</option>" +
                            "<option>HTML</option>" +
                        "</select>" +
                    "<h3>My second favorite language:</h3>" +
                        "<select name='option2'>" +
                            "<option>Java</option>" +
                            "<option>JavaScript</option>" +
                            "<option>Python</option>" +
                            "<option>HTML</option>" +
                        "</select>" +
                    "<h3>My third favorite language:</h3>" +
                        "<select name='option3'>" +
                            "<option>Java</option>" +
                            "<option>JavaScript</option>" +
                            "<option>Python</option>" +
                            "<option>HTML</option>" +
                        "</select>" + "<br>" +
                    "<button type='submit'>Submit</button>" +
                "</form>"+
                "</body>" +
                "</html>";
    }

    // handler that corresponds to localhost:8080/form to process and  display result
    @PostMapping("/form")
    public String processSkillsForm(@RequestParam String userName, String option1, String option2, String option3){
        return "<html>" +
                "<body>" +
                "<h1>" + userName + "</h1>" +
                //"<h3> Favorite language </h3>" +
//                    "<ol>" + // instead of the ff code use table( bonus)
//                        "<li>" + option1 + "</li>" +
//                        "<li>" + option2 + "</li>" +
//                        "<li>" + option3 + "</li>" +
//                    "</ol>" +
                "<table>" +
                    "<tr>" +
                    "<td>1. </td>" +
                        "<td>" + option1 + "</td>" +
                    "</tr>" +

                    "<tr>" +
                    "<td>2. </td>" +
                        "<td>" + option2 + "</td>" +
                    "</tr>" +

                    "<tr>" +
                    "<td>3. </td>" +
                        "<td>" + option3 + "</td>" +
                    "</tr>" +
                    "</table>" +
                "</body>" +
                "</html>";


    }
}
