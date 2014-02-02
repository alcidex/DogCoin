package io.github.alcidex;

public class SLAPI 
{
  
	private static DogCoin plugin = EconManger.getPlugin();
	
	public static void saveBalances()
    {
	  for (String p : EconManger.getBalanceMap().keySet())
	  {
	   plugin.getConfig().set("balance."+p, EconManger.getBalanceMap().get(p));
	  }
      plugin.saveConfig();
    }
	
	public static void loadBalances()
	{
		if(!plugin.getConfig().contains("balances")) return;
		for(String s : plugin.getConfig().getConfigurationSection("balance").getKeys(false))
		{
			EconManger.setBalance(s, plugin.getConfig().getDouble("balance."+s));
		}
	}
}
