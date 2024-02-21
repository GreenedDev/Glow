package net.multylands.fun;

import java.util.logging.Level;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Glow extends JavaPlugin {
    @Override
    public void onEnable() {
        saveDefaultConfig();
        getCommand("glow").setExecutor(new GlowCommand(this));
        getCommand("reloadglow").setExecutor(new GlowReloadCommand(this));
        if (Bukkit.getPluginManager().isPluginEnabled("PlaceholderAPI")) { //
            new GlowPAPIExpansion(this).register(); //
        } else {
            getLogger().log(Level.WARNING, "Could not find PlaceholderAPI! You wouldn't be able to use plugin's placeholders.");
        }
        Bukkit.getLogger().log(Level.INFO, "Glowing plugin enabled!");
    }
    @Override
    public void onDisable() {
        for (Player all : Bukkit.getOnlinePlayers()) {
            all.setGlowing(false);
        }
    }
}
