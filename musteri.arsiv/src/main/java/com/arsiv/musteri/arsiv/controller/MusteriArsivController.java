package com.arsiv.musteri.arsiv.controller;

import com.arsiv.musteri.arsiv.dto.MusteriListeRequest;
import com.arsiv.musteri.arsiv.model.MusteriListe;
import com.arsiv.musteri.arsiv.service.ListeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/musteriarsiv")
public class MusteriArsivController {

    private final ListeService listeService;

    public MusteriArsivController(ListeService listeService) {
        this.listeService = listeService;
    }


    @GetMapping
    public ResponseEntity<String> MusteriArsiv(){
        return ResponseEntity.ok("Musteri Arsive Hosgeldiniz");
    }

    @PostMapping
    public ResponseEntity<MusteriListe> putAnMusteriListe(@RequestBody MusteriListeRequest musteriListeRequest) {

        MusteriListe musteriListe = listeService.
                putAnMusteriListe(musteriListeRequest.getArsivModelIdList(),MusteriListeRequest.getUserName());
        return ResponseEntity.ok(musteriListe);
    }

}
