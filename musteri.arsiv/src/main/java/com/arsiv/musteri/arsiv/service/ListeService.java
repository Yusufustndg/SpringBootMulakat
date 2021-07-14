package com.arsiv.musteri.arsiv.service;

import com.arsiv.musteri.arsiv.model.ArsivModel;
import com.arsiv.musteri.arsiv.model.MusteriListe;
import com.arsiv.musteri.arsiv.repository.ListeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ListeService {


    private final Logger logger = LoggerFactory.getLogger(ListeService.class);
    private final ArsivService arsivService;
    private final ListeRepository listeRepository;



    public ListeService(ArsivService arsivModelService, ArsivService arsivService, ListeRepository listeRepository) {
        this.arsivService = arsivService;
        this.listeRepository = listeRepository;
    }

    public MusteriListe putAndOrder(List<Integer> arsivmodelIdList, String usarname) {
        List<Optional<ArsivModel>> arsivModelList = arsivmodelIdList.stream()
                .map(arsivService::findArsivModelById).collect(Collectors.toList());


        Double totalPrince = arsivModelList.stream()
                .map(optionalArsivModel -> optionalArsivModel.map(ArsivModel::getPrice).orElse(0.0))
                .reduce(0.0, Double::sum);

        MusteriListe musteriListe = MusteriListe.builder()
                .arsivList(arsivmodelIdList)
                .totalPrice(totalPrince)
                .userName(usarname)
                .build();
        return listeRepository.save(musteriListe);


    }

}
