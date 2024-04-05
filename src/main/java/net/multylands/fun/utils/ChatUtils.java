package net.multylands.fun.utils;

import org.bukkit.ChatColor;

public class ChatUtils {
    public static String color(String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }
}
