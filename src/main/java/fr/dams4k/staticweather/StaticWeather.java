package fr.dams4k.staticweather;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class StaticWeather extends JavaPlugin {
    @Override
    public void onEnable() {
        ConsoleCommandSender sender = Bukkit.getConsoleSender();
        sender.sendMessage("[StaticWeather] Plugin enabled");

        getServer().getPluginManager().registerEvents(new WeatherListener(), this);
    }
}
