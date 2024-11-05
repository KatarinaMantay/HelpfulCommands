package dev.katarina.helpfulcommands;

import dev.katarina.helpfulcommands.Commands.FeedCommand;
import dev.katarina.helpfulcommands.Commands.HealCommand;
import dev.katarina.helpfulcommands.Commands.HitCommand;
import dev.katarina.helpfulcommands.Commands.NightVisionCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class HelpfulCommands extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("feed").setExecutor(new FeedCommand());
        getCommand("heal").setExecutor(new HealCommand());
        getCommand("nightvision").setExecutor(new NightVisionCommand());
        getCommand("hit").setExecutor(new HitCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
