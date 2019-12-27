package ltd.langlois.javabugs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("bugs")
public class BugController {

    @GetMapping
    public String displayAllBugs(Model model) {
        List<String> bugs = new ArrayList<>();
        bugs.add("Lactobacillus");
        bugs.add("E.coli");
        model.addAttribute("bugs", bugs);
        return "bugs/index";
    }

    // lives at /bugs/create
    @GetMapping("create")
    public String renderCreateBugForm() {
        return "bugs/create";
    }
}
