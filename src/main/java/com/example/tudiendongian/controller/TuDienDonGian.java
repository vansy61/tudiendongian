package com.example.tudiendongian.controller;

import com.example.tudiendongian.service.DictionaryService;
import com.example.tudiendongian.service.IDictionaryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TuDienDonGian {
    private IDictionaryService dictionaryService = new DictionaryService();


    @RequestMapping("/form")
    public String showForm() {
        return "/form";
    }

    @RequestMapping("/translate")
    public String showResult(@RequestParam  String word, Model model) {
        String result = dictionaryService.getWord(word);
        model.addAttribute("word", word);
        model.addAttribute("result", result);
        return "/result";
    }
}
