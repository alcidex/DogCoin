package io.github.alcidex;


import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener
{
    @EventHandler
	public void onJoin(PlayerJoinEvent event)
    {
    	
    	if(EconManger.hasAccount(event.getPlayer().getName())) return;
    	EconManger.setBalance(event.getPlayer().getName(), 200D);
    }
}
