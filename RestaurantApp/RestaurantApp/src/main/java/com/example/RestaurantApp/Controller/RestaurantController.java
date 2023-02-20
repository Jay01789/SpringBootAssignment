package com.example.RestaurantApp.Controller;

import com.example.RestaurantApp.Model.Restaurant;
import com.example.RestaurantApp.Service.RestaurantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Restaurant-App")
public class RestaurantController {

    @PostMapping("/add-Restaurant")
   public void addRest(@RequestBody Restaurant restaurant){
        RestaurantService.addRestaurant(restaurant);
    }

    @GetMapping("/show-all")
    public List<Restaurant> show(){
        return RestaurantService.showAll();
    }

    @DeleteMapping("/delete-resto/name/{name}")
    public void delete(@PathVariable String name){
        RestaurantService.deleteResto(name);
    }

    @GetMapping("/get-by-name/name/{name}")
    public Restaurant get(@PathVariable String name){
       return RestaurantService.getByName(name);
    }



}
