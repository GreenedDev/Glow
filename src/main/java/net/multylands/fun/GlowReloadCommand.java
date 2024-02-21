package net.multylands.fun;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class GlowReloadCommand implements CommandExecutor {
    Glow plugin;
    public GlowReloadCommand(Glow plugin) {
        this.plugin = plugin;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!sender.hasPermission("glow.reload")) {
            sender.sendMessage(ChatUtils.color(plugin.getConfig().getString("permission-message")));
            return false;
        }
        plugin.reloadConfig();
        sender.sendMessage(ChatUtils.color(plugin.getConfig().getString("reload-config")));
        return false;
    }
}