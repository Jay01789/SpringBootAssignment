package com.example.RestaurantApp.Service;

import com.example.RestaurantApp.Model.Restaurant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class RestaurantService {

    public static List<Restaurant> restaurants  = new ArrayList<>();
    private static int number = 0 ;

    static {
restaurants.add(new Restaurant("alpha","bangalore",++number,"noodles",70));
        restaurants.add(new Restaurant("beta","delhi",++number,"parota",52));
        restaurants.add(new Restaurant("gama","mumbai",++number,"chapati & sambar",25));
    }


    public static void addRestaurant(Restaurant restaurant){
            restaurants.add(restaurant);
    }

    public static List<Restaurant> showAll(){
        return restaurants ;
    }

    public static void deleteResto(String name){
        Predicate<? super Restaurant> predicate = Restaurant -> Restaurant.getName().equals(name);
        restaurants.removeIf(predicate);
    }

    public static  Restaurant getByName(String name){
        Predicate<? super Restaurant> predicate = Restaurant -> Restaurant.getName().equals(name)  ;

        Restaurant restaurant = restaurants.stream().filter(predicate).findFirst().get();

        return  restaurant;
    }

}
