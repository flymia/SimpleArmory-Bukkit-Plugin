package com.flymia.SimpleArmory.Commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.flymia.SimpleArmory.main.SimpleArmory;

public class ClearArmoryCommand implements CommandExecutor {

	SimpleArmory plugin;

	
	public ClearArmoryCommand(SimpleArmory plugin){
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender p, Command cmd, String label, String[] args) {
		if(p.hasPermission("simplearmory.cleararmory")){
			if(args.length == 0){
				Player player = (Player) p;
				
				player.getInventory().setHelmet(new ItemStack(Material.AIR));
				player.getInventory().setChestplate(new ItemStack(Material.AIR));
				player.getInventory().setLeggings(new ItemStack(Material.AIR));
				player.getInventory().setBoots(new ItemStack(Material.AIR));
				p.sendMessage(SimpleArmory.prefix + "Armor cleared!");
				return true;
			}else{
				p.sendMessage(SimpleArmory.prefix + "Invalid argument!");				
				return true;
			}
		}else{
			p.sendMessage(SimpleArmory.prefix + "You are not allowed to do this!");
			return true;
		}
	}

}
	

