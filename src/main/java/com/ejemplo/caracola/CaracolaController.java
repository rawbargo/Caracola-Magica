package com.ejemplo.caracola;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Random;

@Controller
public class CaracolaController {

    private static final String[] RESPUESTAS = {
            "Sí", "No", "Tal vez", "Pregunta de nuevo", "No cuentes con ello",
            "Es seguro", "Parece ser", "Lo dudo", "Definitivamente", "No estoy seguro"
    };

    @GetMapping("/")
    public String mostrarCaracola() {
        return "caracola";
    }

    @PostMapping("/preguntar")
    public String preguntarCaracola(Model model) {
        Random random = new Random();
        String respuesta = RESPUESTAS[random.nextInt(RESPUESTAS.length)];
        model.addAttribute("respuesta", respuesta);
        return "caracola";
    }
}
