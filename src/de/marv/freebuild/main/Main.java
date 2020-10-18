package de.marv.freebuild.main;

import de.marv.freebuild.commands.Fly_CMD;
import de.marv.freebuild.commands.GM_CMD;
import de.marv.freebuild.commands.GlobalMute_CMD;
import de.marv.freebuild.listener.ChatListener;
import de.marv.freebuild.listener.JQListener;
import de.marv.freebuild.utils.Data;
import de.marv.freebuild.utils.MySQL;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static Main instance;
    public static Main getInstance() {

        return instance;
    }

    @Override
    public void onEnable() {
        System.out.println(Data.prefix + "§aDas Plugin wurde erfolgreich aktiviert");
        MySQL.connect();
        init();
        instance = this;
    }

    @Override
    public void onDisable() {
        System.out.println(Data.prefix + "§cDas Plugin wurde erfolgreich deaktiviert");
        MySQL.disconnect();
    }

    public void init() {
        //COMMANDS
        getCommand("globalmute").setExecutor(new GlobalMute_CMD());
        getCommand("fly").setExecutor(new Fly_CMD());
        getCommand("gamemode").setExecutor(new GM_CMD());
        getCommand("gm").setExecutor(new GM_CMD());

        //EVENTS
        Bukkit.getPluginManager().registerEvents(new JQListener(), this);
        Bukkit.getPluginManager().registerEvents(new ChatListener(), this);

    }


}
