package io.github.alcidex;
/*
 * @Author AlcideX
 */

import java.util.HashMap;

public class EconManger 
{
   
	private static DogCoin plugin;
	
	public EconManger(DogCoin instance)
	{
		plugin = instance;
	}
	
	
	public static HashMap<String, Double> bal = new HashMap <>(); // {PlayerName, Balance}
   
   public static void setBalance(String player, double amount)
   {
	bal.put(player, amount);   
   }
   
   public static Double getBalance(String player)
   {
	   return bal.get(player);
   }
   
   public static boolean hasAccount(String player)
   {
	   return bal.containsKey(player);
   }
   
   public static HashMap<String, Double> getBalanceMap()
   {
	   return bal;
   }   
 
   public static DogCoin getPlugin()
   {
	 return plugin;   
   }
 }