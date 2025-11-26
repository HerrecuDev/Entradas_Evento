package org.iesdm.entradas_eventos.controller;

import lombok.extern.slf4j.Slf4j;
import org.iesdm.entradas_eventos.service.EventoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Slf4j
@Controller
@SessionAttributes
@RequestMapping("/eventos")
public class EventoController {

    private EventoService eventoService;

    public EventoController(EventoService eventoService) {
        this.eventoService = eventoService;
    }

    @GetMapping("/evento/compras/paso1")

    public String paso1Get(Model model , @ModelAttribute EventoService eventoService){

        return "paso1";
    }




}
