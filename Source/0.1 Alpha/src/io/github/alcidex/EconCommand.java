package io.github.alcidex;
/*
 * @Author AlcideX
 */

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class EconCommand implements CommandExecutor
{
     @Override
     public boolean onCommand(CommandSender cs, Command command, String s, String[] args)
     {
        if(args.length != 3)
        {
        	cs.sendMessage(ChatColor.RED+"Sorry you have entered the command the WRONG way");
        	cs.sendMessage(ChatColor.GREEN+"Do it like this /econ <add/set/remove> <playername> <amount>");
        	return true;
       
        }
        
    		if (args[0].equalsIgnoreCase("add"))
    		{
    			if(!EconManger.hasAccount(args[1]))
    			{
    			    cs.sendMessage(ChatColor.RED+"Player Does Not Have An Account");
    				return true; 
    			}
    			double amount = 0;
    			try
    			{
    			 amount = Double.parseDouble(args[2]);	
    			 cs.sendMessage(ChatColor.GREEN+"Money was added!");
    			}catch (Exception e)
    			{
    			  cs.sendMessage(ChatColor.RED+"Amount Is Missing Or Amount Is Not Numbers");	
    			  return true;
    			}
    			
    			EconManger.setBalance(args[1], EconManger.getBalance(args [1]) + amount);
    		}else if (args[0].equalsIgnoreCase("remove"))
    		{
    			if(!EconManger.hasAccount(args[1]))
    			{
    			    cs.sendMessage(ChatColor.RED+"Player Does Not Have An Account");
    				return true; 
    			}
    			double amount = 0;
    			try
    			{
    			 amount = Double.parseDouble(args[2]);
    			 cs.sendMessage(ChatColor.GREEN+"Money was removed!");
    			}catch (Exception e)
    			{
    			  cs.sendMessage(ChatColor.RED+"Amount Is Missing Or Amount Is Not Numbers");	
    			  return true;
    			}
    			
    			EconManger.setBalance(args[1], EconManger.getBalance(args [1]) - amount);
            }else if (args[0].equalsIgnoreCase("set"))
            {	
            	if(!EconManger.hasAccount(args[1]))
    			{
    			    cs.sendMessage(ChatColor.RED+"Player Does Not Have An Account");
    				return true; 
    			}
    			double amount = 0;
    			try
    			{
    			 amount = Double.parseDouble(args[2]);
    			 cs.sendMessage(ChatColor.GREEN+"The money was set!");
    			}catch (Exception e)
    			{
    			  cs.sendMessage(ChatColor.RED+"Amount Is Missing Or Amount Is Not Numbers");	
    			  return true;
    			}
    			
    			EconManger.setBalance(args[1], amount);
    			}else 
    		    {
    			cs.sendMessage(ChatColor.RED+"Incorrect");
    			cs.sendMessage(ChatColor.GREEN+"Please Put add, remove, or set");
    		}
    	
        return true;
     }
}
