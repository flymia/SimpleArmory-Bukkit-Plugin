package com.flymia.SimpleArmory.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import com.flymia.SimpleArmory.main.SimpleArmory;

public class SendArmoryCommand implements CommandExecutor{
	
	//TEST
	
	SimpleArmory plugin;
	
	public SendArmoryCommand(SimpleArmory plugin){
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender p, Command cmd, String label, String[] args) {
		Player player = (Player) p;
		if(p.hasPermission("simplearmory.sendarmory")){
			if(args.length == 0){
				p.sendMessage(SimpleArmory.prefix + "You have to specify a armory-type and a player! Like this: /sendarmory diamond playername");
				return true;
				
				
			}else if(args.length == 1){
				
				p.sendMessage(SimpleArmory.prefix + "Missing Player!");
				
				return true;
			}else if(args.length == 2 && args[0].equalsIgnoreCase("leather")){
				Player target = Bukkit.getPlayer(args[1]);
				//Leather
				if(target != null){
					PlayerInventory i = target.getInventory();
					i.setHelmet(new ItemStack(Material.LEATHER_HELMET));
					i.setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
					i.setLeggings(new ItemStack(Material.LEATHER_LEGGINGS));
                    i.setBoots(new ItemStack(Material.LEATHER_BOOTS));
                    target.sendMessage(SimpleArmory.prefix + p.getName() + " gave you some leather armor!");
                    p.sendMessage(SimpleArmory.prefix + "Gave " + target.getName() + " some leather armor.");
                    return true;
				}else{
					p.sendMessage(SimpleArmory.prefix + "Ooops! This player is not online!");
					return true;
				}
			}else if(args.length == 2 && args[0].equalsIgnoreCase("iron")){
				Player target = Bukkit.getPlayer(args[1]);
				//Iron
				if(target != null){
					PlayerInventory i = target.getInventory();
					i.setHelmet(new ItemStack(Material.IRON_HELMET));
					i.setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
					i.setLeggings(new ItemStack(Material.IRON_LEGGINGS));
                    i.setBoots(new ItemStack(Material.IRON_BOOTS));
                    target.sendMessage(SimpleArmory.prefix + p.getName() + " gave you some iron armor!");
                    p.sendMessage(SimpleArmory.prefix + "Gave " + target.getName() + " some iron armor.");
                    return true;
				}else{
					p.sendMessage(SimpleArmory.prefix + "Ooops! This player is not online!");
					return true;
				}
			}else if(args.length == 2 && args[0].equalsIgnoreCase("gold")){
				Player target = Bukkit.getPlayer(args[1]);
				//Gold
				if(target != null){
					PlayerInventory i = target.getInventory();
					i.setHelmet(new ItemStack(Material.GOLD_HELMET));
					i.setChestplate(new ItemStack(Material.GOLD_CHESTPLATE));
					i.setLeggings(new ItemStack(Material.GOLD_LEGGINGS));
                    i.setBoots(new ItemStack(Material.GOLD_BOOTS));
                    target.sendMessage(SimpleArmory.prefix + p.getName() + " gave you some golden armor!");
                    p.sendMessage(SimpleArmory.prefix + "Gave " + target.getName() + " some golden armor.");
                    return true;
				}else{
					p.sendMessage(SimpleArmory.prefix + "Ooops! This player is not online!");
					return true;
				}
			}else if(args.length == 2 && args[0].equalsIgnoreCase("diamond")){
				Player target = Bukkit.getPlayer(args[1]);
				//Diamond
				if(target != null){
					PlayerInventory i = target.getInventory();
					i.setHelmet(new ItemStack(Material.DIAMOND_HELMET));
					i.setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
					i.setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
                    i.setBoots(new ItemStack(Material.DIAMOND_BOOTS));
                    target.sendMessage(SimpleArmory.prefix + p.getName() + " gave you some diamond armor!");
                    p.sendMessage(SimpleArmory.prefix + "Gave " + target.getName() + " some diamond armor.");
                    return true;
				}else{
					p.sendMessage(SimpleArmory.prefix + "Ooops! This player is not online!");
					return true;
				}
			}else if(args.length == 2 && args[0].equalsIgnoreCase("chain")){
				Player target = Bukkit.getPlayer(args[1]);
				//Chain
				if(target != null){
					PlayerInventory i = target.getInventory();
					i.setHelmet(new ItemStack(Material.CHAINMAIL_HELMET));
					i.setChestplate(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
					i.setLeggings(new ItemStack(Material.CHAINMAIL_LEGGINGS));
					i.setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
					target.sendMessage(SimpleArmory.prefix + p.getName() + " gave you some chain armor!");
					p.sendMessage(SimpleArmory.prefix + "Gave " + target.getName() + " some chain armor.");
					return true;
				}else{
					p.sendMessage(SimpleArmory.prefix + "Ooops! This player is not online!");
					return true;
				}
			}else if(args.length == 2 && args[0].equalsIgnoreCase("rainbow")){
				Player target = Bukkit.getPlayer(args[1]);
				//Rainbow
				if(target != null){
					PlayerInventory i = target.getInventory();
					i.setHelmet(new ItemStack(Material.LEATHER_HELMET));
					i.setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
					i.setLeggings(new ItemStack(Material.GOLD_LEGGINGS));
                    i.setBoots(new ItemStack(Material.DIAMOND_BOOTS));
                    target.sendMessage(SimpleArmory.prefix + p.getName() + " gave you some rainbow armor!");
                    p.sendMessage(SimpleArmory.prefix + "Gave " + target.getName() + " some rainbow armor.");
                    return true;
				}else{
					p.sendMessage(SimpleArmory.prefix + "Ooops! This player is not online!");
					return true;
				}
			}else{
				p.sendMessage(SimpleArmory.prefix + "Invalid argument! Too many or too few!");
				return true;
			}
		}else{
			p.sendMessage(SimpleArmory.prefix + "You are not allowed to do this!");
			return true;
		}
	}

}
