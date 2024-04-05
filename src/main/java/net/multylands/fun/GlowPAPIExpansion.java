package net.multylands.fun;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import net.multylands.fun.utils.ChatUtils;
import org.bukkit.OfflinePlayer;
import org.jetbrains.annotations.NotNull;

public class GlowPAPIExpansion extends PlaceholderExpansion {

    private final Glow plugin;

    public GlowPAPIExpansion(Glow plugin) {
        this.plugin = plugin;
    }

    @Override
    @NotNull
    public String getAuthor() {
        return "GreenedDev";
    }

    @Override
    @NotNull
    public String getIdentifier() {
        return "glow";
    }

    @Override
    @NotNull
    public String getVersion() {
        return plugin.getDescription().getVersion();
    }

    @Override
    public boolean persist() {
        return true;
    }

    @Override
    public String onRequest(OfflinePlayer player, @NotNull String params) {
        if (params.equalsIgnoreCase("isenabled")) {
            if (!player.isOnline()) {
                return ChatUtils.color(plugin.getConfig().getString("glowing-isenabled-offline"));
            }
            if (player.getPlayer().isGlowing()) {
                return ChatUtils.color(plugin.getConfig().getString("glowing-isenabled-yes"));
            }
            return ChatUtils.color(plugin.getConfig().getString("glowing-isenabled-no"));
        }
        return ChatUtils.color(plugin.getConfig().getString("glowing-wrong-placeholder"));
    }
}