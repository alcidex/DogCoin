package io.github.alcidex;
/*
 * @Author AlcideX
 */

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class DogCoin extends JavaPlugin
{
   public void onEnable()
   {
	  
	   getCommand("econ").setExecutor(new EconCommand());
	  new EconManger(this);
	  SLAPI.loadBalances();
      Bukkit.getPluginManager().registerEvents(new PlayerJoin(), this);
   }
	
   public void onDisable()
   {
	   SLAPI.saveBalances();
   }
}
