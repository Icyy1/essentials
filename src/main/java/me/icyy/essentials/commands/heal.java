package me.icyy.essentials.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class heal implements CommandExecutor{
    
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("You must be a player to use this command");
            return true;
        }
        Player player = (Player) sender;
        player.setHealth(20);
        player.setFoodLevel(20);
        player.sendMessage("Your health and hunger have been replenished.");
        return true;
    }
}