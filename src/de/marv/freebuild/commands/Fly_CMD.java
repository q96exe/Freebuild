package de.marv.freebuild.commands;

import de.marv.freebuild.utils.Data;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly_CMD implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;

        if (p.hasPermission("freebuild.fly")) {
            if (args.length == 0) {
                if (p.getAllowFlight()) {
                    p.setAllowFlight(false);
                    p.sendMessage(Data.prefix + "§7Du fliegst nun nicht mehr!");
                    return true;
                } else {
                    p.setAllowFlight(true);
                    p.sendMessage(Data.prefix + "§7Du fliegst nun!");
                }
                return true;
            }

            if (args.length == 1) {
                Player t = Bukkit.getPlayer(args[0]);
                if (t == null) {
                    p.sendMessage(Data.prefix + "§7Der Spieler §a" + args[0] + "§7 ist nicht online");
                    return true;
                }

                if (t.getAllowFlight()) {
                    t.setAllowFlight(false);
                    p.sendMessage(Data.prefix + "§7Der Spieler §a" + t.getName() + "§7 fliegt nun nicht mehr!");
                    t.sendMessage(Data.prefix + "§7Du fliegst nun nicht mehr!");
                    return true;
                } else {
                    t.setAllowFlight(true);
                    p.sendMessage(Data.prefix + "§7Der Spieler §a" + t.getName() + "§7 fliegt nun!");
                    t.sendMessage(Data.prefix + "§7Du fliegst nun!");

                }

                return true;
            }


        } else {
            p.sendMessage(Data.prefix + Data.noperms);

        }
        return false;

    }
}

