package com.ltp.javagram;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class JavagramController {

    @GetMapping("/") 
    public String getForm(Model model) {
        model.addAttribute("user", new User());
        return "sign-up";
    }

    @PostMapping("/submitItem")
    public String handleSubmit(User user, RedirectAttributes redirectAttributes) {
        return "redirect:/result";
    }

    @GetMapping("/result")
    public String getResult() {
        return "result";
    }

    
}
