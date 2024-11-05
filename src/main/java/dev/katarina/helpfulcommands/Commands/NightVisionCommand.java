package dev.katarina.helpfulcommands.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class NightVisionCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {

        if(sender instanceof Player){
            Player p = (Player) sender;

            if(p.hasPotionEffect(PotionEffectType.NIGHT_VISION)){
                p.removePotionEffect(PotionEffectType.NIGHT_VISION);
                p.sendMessage("night vision disabled");
            }else{
                p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, Integer.MAX_VALUE, 0, true, false));
                p.sendMessage("night vision enabled");
            }
        }

        return true;
    }
}
