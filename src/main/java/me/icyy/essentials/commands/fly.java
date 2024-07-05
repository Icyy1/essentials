package me.icyy.essentials.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class fly implements CommandExecutor{
    
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)){
            sender.sendMessage("You must be a player to use this command");
            return false;
        }
        Player player = (Player) sender;
        if (player.isFlying()) {
            player.setAllowFlight(false);
            player.sendMessage("Flight mode disabled");
            return false;
        }
        player.setAllowFlight(true);
        player.sendMessage("Flight mode enabled");
        return false;
    }
}
