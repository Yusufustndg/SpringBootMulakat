package com.arsiv.musteri.arsiv.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Data
@Getter
@Setter
@Builder
public class ArsivModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String ad;
    private String soy;
    private Double boy;
    private Integer yas;


 }
