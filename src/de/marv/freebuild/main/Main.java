package de.marv.freebuild.main;

import de.marv.freebuild.commands.GlobalMute_CMD;
import de.marv.freebuild.listener.JQListener;
import de.marv.freebuild.utils.Data;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public Main instance;
    public Main getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        System.out.println(Data.prefix + "§aDas Plugin wurde erfolgreich aktiviert");
        init();
    }

    @Override
    public void onDisable() {
        System.out.println(Data.prefix + "§cDas Plugin wurde erfolgreich deaktiviert");
    }

    public void init() {
        //COMMANDS
        getCommand("globalmute").setExecutor(new GlobalMute_CMD());

        //EVENTS
        Bukkit.getPluginManager().registerEvents(new JQListener(), this);
        Bukkit.getPluginManager().registerEvents(new GlobalMute_CMD(), this);

    }


}
