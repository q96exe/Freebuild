package de.marv.freebuild.listener;

public class JQListener implements org.bukkit.event.Listener{

    @Eventhandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
    }

}
