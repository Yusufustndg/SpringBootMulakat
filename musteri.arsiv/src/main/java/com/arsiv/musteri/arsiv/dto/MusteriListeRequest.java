package com.arsiv.musteri.arsiv.dto;

import lombok.Data;

import java.util.List;

@Data
public class MusteriListeRequest {
    private List<Integer> arsivmodelIdList;
    private String userName;

}
