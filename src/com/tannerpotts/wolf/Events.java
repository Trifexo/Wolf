package com.tannerpotts.wolf;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.weather.WeatherChangeEvent;

/**
 * Created by Trifexo on 11/8/2016.
 */
public class Events implements Listener {

    @EventHandler
    public void onHungerEvent(FoodLevelChangeEvent foodLevelChangeEvent) {
        if(foodLevelChangeEvent.getFoodLevel() < 20) {
            foodLevelChangeEvent.setCancelled(true);
            Player player = (Player) foodLevelChangeEvent.getEntity();
            player.setFoodLevel(20);
        }
    }

    @EventHandler
    public void onWeatherEvent(WeatherChangeEvent weatherChangeEvent) {
        if(weatherChangeEvent.toWeatherState() == true) {
            weatherChangeEvent.setCancelled(true);
            weatherChangeEvent.getWorld().setStorm(false);
            weatherChangeEvent.getWorld().setThundering(false);
        }
    }

}
