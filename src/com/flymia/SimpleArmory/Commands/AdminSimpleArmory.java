package com.flymia.SimpleArmory.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.flymia.SimpleArmory.main.SimpleArmory;

//
public class AdminSimpleArmory implements CommandExecutor {

	SimpleArmory plugin;
	
	
	public AdminSimpleArmory(SimpleArmory plugin) {
		this.plugin = plugin;
	}
	
	
	@Override
	public boolean onCommand(CommandSender p, Command cmd, String label, String[] args) {
		
			if(args.length == 0){
				
				if(p.hasPermission("simplearmory.admin")){	
					p.sendMessage(SimpleArmory.prefix + "SimpleArmory is a bukkit plugin that was developed to players, who don't want to cheat the armor for each item! It makes it easy to get an armor.");
					p.sendMessage(SimpleArmory.prefix + "You are using version v" + plugin.getDescription().getVersion());
					
					
					return true;
				}else{
					p.sendMessage(SimpleArmory.prefix + "You are not allowed to do this!");
					return true;
				}
			}else if(args.length == 1 && args[0].equalsIgnoreCase("reloadconfig")){
				
				if(p.hasPermission("simplearmory.admin")){	
					plugin.reloadConfig();
					p.sendMessage(SimpleArmory.prefix + "The config has been reloaded!");
					return true;
				}else{
					p.sendMessage(SimpleArmory.prefix + "You are not allowed to do this!");
					return true;
				}
					
			
				
			}else{
				p.sendMessage(SimpleArmory.prefix + "Invalid argument!");
				return true;
			}
		
	}
}