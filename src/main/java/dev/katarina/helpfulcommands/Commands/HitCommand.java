package dev.katarina.helpfulcommands.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HitCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        if(sender instanceof Player){

            if (args.length < 2) {
                sender.sendMessage("Usage: /" + command + " <player> <hearts>");
                return true;
            }
            Player p = (Player) sender;
            Player target = sender.getServer().getPlayer(args[0]);
            Double hearts = Double.parseDouble(args[1]);
            double currentHealth = target.getHealth();

            if(hearts > 10){
                p.sendMessage("Max of 10 hearts can be taken");
            }else{
                target.setHealth(currentHealth - (hearts*2));
            }
        }

        return true;
    }
}
