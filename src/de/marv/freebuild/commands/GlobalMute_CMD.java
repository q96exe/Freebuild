package de.marv.freebuild.commands;

;import de.marv.freebuild.utils.Data;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GlobalMute_CMD implements CommandExecutor {

    public static boolean globalmute;

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        if(p.hasPermission("freebuid.globalmute")) {
            if(globalmute == false) {
                globalmute = true;
                p.sendMessage(Data.prefix + "§7Du hast den §aGlobalmute §aAktiviert");
                for(Player all : Bukkit.getOnlinePlayers()) {
                    all.sendMessage(Data.prefix + "§7Der §bSpieler §a" + sender.getName() + " §7hat den Globalmute §aAktiviert");
                }
            } else if(globalmute == true){
                globalmute = false;
                p.sendMessage(Data.prefix + "§7Du hast den §aGlobalmute §cDeaktiviert");
                for(Player all : Bukkit.getOnlinePlayers()) {
                    all.sendMessage(Data.prefix + "§7Der §bSpieler §a" + sender.getName() + " §7hat den Globalmute §cDeaktiviert");
                }
            }
        } else {
            p.sendMessage(Data.noperms);
        }


        return false;
    }
}
