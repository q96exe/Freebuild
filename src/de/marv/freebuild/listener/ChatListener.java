package de.marv.freebuild.listener;

import de.marv.freebuild.commands.GlobalMute_CMD;
import de.marv.freebuild.utils.Data;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        Player p = e.getPlayer();
        if(p.hasPermission("freebuild.bypass.globalmute")) {
            if(GlobalMute_CMD.globalmute == true) {
                e.setCancelled(true);
                p.sendMessage(Data.prefix + "§7Der §aGlobalmute §7ist Aktiviert");
            }
        }
    }
}
