package net.multylands.fun;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GlowCommand implements CommandExecutor {
    Glow plugin;
    public GlowCommand(Glow plugin) {
        this.plugin = plugin;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatUtils.color(plugin.getConfig().getString("only-players")));
            return false;
        }
        Player player = ((Player) sender).getPlayer();
        if (!sender.hasPermission("glow.command")) {
            player.sendMessage(ChatUtils.color(plugin.getConfig().getString("permission-message")));
            return false;
        }
        if (player.isGlowing()) {
            player.setGlowing(false);
            player.sendMessage(ChatUtils.color(plugin.getConfig().getString("glow-disable")));
            return false;
        }
        player.setGlowing(true);
        player.sendMessage(ChatUtils.color(plugin.getConfig().getString("glow-enable")));
        return false;
    }
}