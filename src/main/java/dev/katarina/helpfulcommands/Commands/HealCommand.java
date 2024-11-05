package dev.katarina.helpfulcommands.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {

        if(sender instanceof Player){
            Player p = (Player) sender;
            p.setHealth(20);
            p.sendMessage("You have been healed");
        }

        return true;
    }
}
