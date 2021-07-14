package com.arsiv.musteri.arsiv.repository;

import com.arsiv.musteri.arsiv.model.MusteriListe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListeRepository extends JpaRepository<MusteriListe, Integer> {
}
