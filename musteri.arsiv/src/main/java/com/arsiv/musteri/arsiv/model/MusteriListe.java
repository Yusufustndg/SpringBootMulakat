package com.arsiv.musteri.arsiv.model;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Table
@Data
@Getter
@Setter
@Builder
public class MusteriListe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String userName;
    private List<Integer> arsivList;
    private Double totalPrice;


}
