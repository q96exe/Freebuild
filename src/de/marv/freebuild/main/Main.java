package de.marv.freebuild.main;

import de.marv.freebuild.utils.Data;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public Main instance;
    public Main getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        System.out.println(Data.prefix + "§aDas Plugin wurde erfolgreich aktiviert");
    }

    @Override
    public void onDisable() {
        System.out.println(Data.prefix + "§cDas Plugin wurde erfolgreich deaktiviert");
    }

    public void init() {
        //COMMANDS

        //EVENTS

    }
}
