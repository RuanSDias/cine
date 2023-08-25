package br.com.fiap.cineStream.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FilmeController {

    @RequestMapping("/api/filmes")
    @ResponseBody
    public String show() {
        return "Filme";
    }

}
