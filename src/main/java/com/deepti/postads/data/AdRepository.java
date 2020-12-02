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
            new Ad("android-explosion", LocalDate.of(2015,2,13), "Chris Ramacciotti", false, 2),
            new Ad("ben-and-mike", LocalDate.of(2015,10,30), "Ben Jakuben", true, 2),
            new Ad("book-dominos", LocalDate.of(2015,9,15), "Craig Dennis", false, 2),
            new Ad("compiler-bot", LocalDate.of(2015,2,13), "Ada Lovelace", true, 2),
            new Ad("cowboy-coder", LocalDate.of(2015,2,13), "Grace Hopper", false, 3),
            new Ad("infinite-andrew", LocalDate.of(2015,8,23), "Marissa Mayer", true, 3)
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
