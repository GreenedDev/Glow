package net.multylands.fun.commands;

import net.multylands.fun.Glow;
import net.multylands.fun.utils.ChatUtils;
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