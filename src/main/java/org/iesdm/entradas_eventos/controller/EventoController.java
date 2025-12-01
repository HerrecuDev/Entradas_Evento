package org.iesdm.entradas_eventos.controller;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.iesdm.entradas_eventos.dto.PostPaso2DTO;
import org.iesdm.entradas_eventos.model.Evento;
import org.iesdm.entradas_eventos.service.EventoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@SessionAttributes
@RequestMapping("/eventos")
public class EventoController {

    private EventoService eventoService;

    public EventoController(EventoService eventoService) {
        this.eventoService = eventoService;
    }

    @GetMapping("/comprar/paso1")

    public String paso1Get(Evento evento ,
                           Model model){
        //var eventos = eventoService.getAll();
        model.addAttribute("evento" , evento);
        model.addAttribute("eventos" ,);

        return "evento/comprar/paso1";
    }

    @PostMapping("/comprar/paso2")

    public String postPaso2(/*Evento evento*/@ModelAttribute PostPaso2DTO postPaso2DTO , HttpSession httpSession){


        log.info("postPaso2 {}", postPaso2DTO);
        //var eventoBd = eventoService.finalize(postPaso2DTO,getEventoId())

        return "paso2";
    }




}
