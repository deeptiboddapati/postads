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
            new Ad(1,"bed", LocalDate.of(2015,2,13), 1, 2, 2.00, "An awesome bed. You will sleep like a baby."),
            new Ad(2, "bed2", LocalDate.of(2015,10,30), 2,  2, 100.00, "You will never get back pain with this bed."),
            new Ad(3,"chair", LocalDate.of(2015,9,15), 3,2, 4.00, "Impress your houseguests with this chair"),
            new Ad(4,"HangingChair", LocalDate.of(2015,2,13), 3,  2, 5.00, "Swing your troubles away in this comfy chair."),
            new Ad(5, "car", LocalDate.of(2015,2,13), 5, 4, 6.00, "0 to 60 never!"),
            new Ad(6,"car2", LocalDate.of(2015,8,23), 4, 4, 10.00, "Better than Hotwheels."),
            new Ad(7,"dog", LocalDate.of(2015,8,23), 6, 3, 3.00, "Will fetch forever"),
            new Ad(8,"cat", LocalDate.of(2015,8,23), 1, 3, 7.00, "Great at ignoring you.")
            );
    public Ad findByName(String name ){
        for( Ad ad : ALL_ADS){
            if(ad.getName().equals(name)){
                return ad;
            }
        }
        return null;
    }
    public List<Ad> getAllAds(){
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
