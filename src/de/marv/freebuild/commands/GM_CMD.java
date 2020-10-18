package de.marv.freebuild.commands;

import de.marv.freebuild.utils.Data;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GM_CMD implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;

        if(cmd.getName().equalsIgnoreCase("gm")) {
            if(p.hasPermission("freebuild.gamemode")) {
                if(args.length == 1) {
                    if(args[0].equalsIgnoreCase("1")) {
                        p.sendMessage(Data.prefix + "§7Du bist nun im §aGamemode CREATIVE");
                        p.setGameMode(GameMode.CREATIVE);
                    } else if(args[0].equalsIgnoreCase("0")) {
                        p.sendMessage(Data.prefix + "§7Du bist nun im §aGamemode SURVIVAL");
                        p.setGameMode(GameMode.SURVIVAL);
                    } else if(args[0].equalsIgnoreCase("2")) {
                        p.sendMessage(Data.prefix + "§7Du bist nun im §aGamemode ADVENTURE");
                        p.setGameMode(GameMode.ADVENTURE);
                    } else if(args[0].equalsIgnoreCase("3")) {
                        p.sendMessage(Data.prefix + "§7Du bist nun im §aGamemode SPECTATOR");
                        p.setGameMode(GameMode.SPECTATOR);
                    }
                } else {
                    p.sendMessage(Data.prefix + "§7Benutze §8» §7/§agm §8<§a1,2,3§8> §8<§aSpieler§8>");
                }
            } else {
                p.sendMessage(Data.prefix + Data.noperms);
            }
        }

        if(cmd.getName().equalsIgnoreCase("gamemode")) {
            if(p.hasPermission("freebuild.gamemode")) {
                if(args.length == 1) {
                    if(args[0].equalsIgnoreCase("1")) {
                        p.sendMessage(Data.prefix + "§7Du bist nun im §aGamemode CREATIVE");
                        p.setGameMode(GameMode.CREATIVE);
                    } else if(args[0].equalsIgnoreCase("0")) {
                        p.sendMessage(Data.prefix + "§7Du bist nun im §aGamemode SURVIVAL");
                        p.setGameMode(GameMode.SURVIVAL);
                    } else if(args[0].equalsIgnoreCase("2")) {
                        p.sendMessage(Data.prefix + "§7Du bist nun im §aGamemode ADVENTURE");
                        p.setGameMode(GameMode.ADVENTURE);
                    } else if(args[0].equalsIgnoreCase("3")) {
                        p.sendMessage(Data.prefix + "§7Du bist nun im §aGamemode SPECTATOR");
                        p.setGameMode(GameMode.SPECTATOR);
                    }
                } else if(args.length == 3) {
                    p.sendMessage(Data.prefix + "§7Benutze §8» §7/§agamemode §8<§a1,2,3§8> §8<§aSpieler§8>");
                }
            } else {
                p.sendMessage(Data.prefix + Data.noperms);
            }
        }
        return false;
    }
}
