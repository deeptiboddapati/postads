package com.deepti.postads.data;

import com.deepti.postads.model.Ad;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class AdRepository {

    private static final List<Ad> ALL_ADS = Arrays.asList(
            new Ad("bed", LocalDate.of(2015,2,13), "Deepti", false, 2),
            new Ad("bed2", LocalDate.of(2015,10,30), "Socrates", true, 2),
            new Ad("chair", LocalDate.of(2015,9,15), "Aristotle", false, 2),
            new Ad("HangingChair", LocalDate.of(2015,2,13), "Hagel", true, 2),
            new Ad("car", LocalDate.of(2015,2,13), "Plato", false, 4),
            new Ad("car2", LocalDate.of(2015,8,23), "Diogenes", true, 4),
            new Ad("dog", LocalDate.of(2015,8,23), "Diogenes", true, 3),
            new Ad("cat", LocalDate.of(2015,8,23), "Diogenes", true, 3)
            );
    public Ad findByName(String name ){
        for( Ad ad : ALL_ADS){
            if(ad.getName().equals(name)){
                return ad;
            }
        }
        return null;
    }
    public List<Ad> getAllGifs(){
        return ALL_ADS;
    }
    public List<Ad> findByCategoryId(int id){
        List<Ad> ads = new ArrayList<>();
        for(Ad ad : ALL_ADS){
            if (ad.getCategoryId() == id ){
                ads.add(ad);
            }
        }
        return ads;
    }
}
