package com.arsiv.musteri.arsiv.service;

import com.arsiv.musteri.arsiv.model.ArsivModel;
import com.arsiv.musteri.arsiv.repository.ArsivRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArsivService {
    private final ArsivRepository arsivrepository;


    public ArsivService(ArsivRepository arsivrepository) {
        this.arsivrepository = arsivrepository;
    }
    public  Optional <ArsivModel> findArsivModelById(Integer arsivmodelId){
        return arsivrepository.findById(arsivmodelId);
    }
}
