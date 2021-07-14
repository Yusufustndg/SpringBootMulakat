package com.arsiv.musteri.arsiv;

import com.arsiv.musteri.arsiv.model.ArsivModel;
import com.arsiv.musteri.arsiv.repository.ArsivRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private final ArsivRepository arsivRepository;

    public Application(ArsivRepository arsivRepository) {
        this.arsivRepository = arsivRepository;
    }

    public static void main(String[] args) { SpringApplication.run(Application.class, args);}


    @Override
    public void run(String... args) throws Exception {
        ArsivModel Musteri1 = ArsivModel.builder()
                .ad("Muhammed Yusuf ")
                .soy("Üstündağ")
                .yas(23)
                .boy(1.78).build();

        ArsivModel Musteri2 = ArsivModel.builder()
                .ad("Elon")
                .soy("Musk")
                .yas(50)
                .boy(1.88).build();

        ArsivModel Musteri3 = ArsivModel.builder()
                .ad("Mark")
                .soy("Zuckerberg")
                .yas(37)
                .boy(1.71).build();
        arsivRepository.saveAll(Array.asList(Musteri1,Musteri2,Musteri3));



    }
}
