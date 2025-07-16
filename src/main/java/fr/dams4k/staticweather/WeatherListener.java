package fr.dams4k.staticweather;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.server.ServerCommandEvent;
import org.bukkit.event.weather.WeatherChangeEvent;

public class WeatherListener implements Listener {
    private boolean allowChange = false;

    @EventHandler
    public void onPlayerCommand(PlayerCommandPreprocessEvent event) {
        allowChange = event.getMessage().startsWith("/weather");
    }
    @EventHandler
    public void onServerCommand(ServerCommandEvent event) {
        allowChange = event.getCommand().startsWith("weather");
    }


    @EventHandler
    public void onWeatherChange(WeatherChangeEvent event) {
        event.setCancelled(!allowChange);
        allowChange = false;
    }
}
