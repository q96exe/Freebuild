package de.marv.freebuild.commands;

import de.marv.freebuild.utils.Data;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class msg_CMD implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        Player t = Bukkit.getPlayer(args[0]);
        if(p.hasPermission("freebuild.msg")) {
            if(args.length == 2) {
                p.sendMessage(Data.prefix + "§7" + p.getName() + " §8» §7" + args[1] + " ");
                t.sendMessage(Data.prefix + "§7" + args[1] + " §8» " + sender.getName());
            }
        }
        return false;
    }
}
