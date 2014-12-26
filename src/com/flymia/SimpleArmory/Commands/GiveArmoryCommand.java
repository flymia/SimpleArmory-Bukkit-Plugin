package com.flymia.SimpleArmory.Commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.flymia.SimpleArmory.main.*;

public class GiveArmoryCommand implements CommandExecutor {

	SimpleArmory plugin;
	
	
	public GiveArmoryCommand(SimpleArmory plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender p, Command cmd, String label, String[] args) {
		
		if(p.hasPermission("simplearmory.givearmory")){
			if(args.length == 0){
				Player player = (Player) p;
				p.sendMessage(SimpleArmory.prefix + "You have to specify the armory you want to have!");
				return true;

			}else if( args.length == 1 && args[0].equalsIgnoreCase("leather")){
				
				Player player = (Player) p;
				
				player.getInventory().setHelmet(new ItemStack(Material.LEATHER_HELMET));
				player.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
				player.getInventory().setLeggings(new ItemStack(Material.LEATHER_LEGGINGS));
				player.getInventory().setBoots(new ItemStack(Material.LEATHER_BOOTS));
				
				
				
				p.sendMessage(SimpleArmory.prefix + "You have been given a leather armory!");
				
				return true;
				
			}else if( args.length == 1 && args[0].equalsIgnoreCase("iron")){
				
				Player player = (Player) p;
				
				player.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));
				player.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
				player.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
				player.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
				
				p.sendMessage(SimpleArmory.prefix + "You have been given a iron armory!");
				
				return true;
				
			}else if( args.length == 1 && args[0].equalsIgnoreCase("gold")){
				
				Player player = (Player) p;
				
				player.getInventory().setHelmet(new ItemStack(Material.GOLD_HELMET));
				player.getInventory().setChestplate(new ItemStack(Material.GOLD_CHESTPLATE));
				player.getInventory().setLeggings(new ItemStack(Material.GOLD_LEGGINGS));
				player.getInventory().setBoots(new ItemStack(Material.GOLD_BOOTS));
				
				p.sendMessage(SimpleArmory.prefix + "You have been given a golden armory!");
				
				return true;
			}else if( args.length == 1 && args[0].equalsIgnoreCase("diamond")){
				
				Player player = (Player) p;
				
				player.getInventory().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
				player.getInventory().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
				player.getInventory().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
				player.getInventory().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
				
				p.sendMessage(SimpleArmory.prefix + "You have been given a diamond armory!");
				
				return true;
			}else if( args.length == 1 && args[0].equalsIgnoreCase("chain")){
				
				Player player = (Player) p;
				
				player.getInventory().setHelmet(new ItemStack(Material.CHAINMAIL_HELMET));
				player.getInventory().setChestplate(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
				player.getInventory().setLeggings(new ItemStack(Material.CHAINMAIL_LEGGINGS));
				player.getInventory().setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
				
				p.sendMessage(SimpleArmory.prefix + "You have been given a chain armory!");
				
				return true;
			}else if( args.length == 1 && args[0].equalsIgnoreCase("rainbow")){
				
				Player player = (Player) p;
				
				player.getInventory().setHelmet(new ItemStack(Material.LEATHER_HELMET));
				player.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
				player.getInventory().setLeggings(new ItemStack(Material.GOLD_LEGGINGS));
				player.getInventory().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
				
				p.sendMessage(SimpleArmory.prefix + "You have been given a 'rainbow' armorpackage!");
				
				return true;
				
			}else{
				p.sendMessage(SimpleArmory.prefix  + "Wrong argument or unspecified armory!");
				return true;
			}
		}else{
			
			p.sendMessage(SimpleArmory.prefix + "You are not allowed to do this!");
			return true;	
		}
	}
}