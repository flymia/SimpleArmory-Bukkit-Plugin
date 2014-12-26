package com.flymia.SimpleArmory.Listener;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import com.flymia.SimpleArmory.main.SimpleArmory;

public class SignEvent implements Listener {


	@EventHandler
	public void onSignChangeEvent(SignChangeEvent e){
		if(e.getLine(0).equalsIgnoreCase("[SA]") && e.getLine(1).equalsIgnoreCase("[L]")){
			e.setLine(0, "§a[SimpleArmory]");
			e.setLine(1, "§bGive §9leather");
			e.setLine(1, "§barmory!");
		}
	}
	
	
	@EventHandler
	public void signEvent(PlayerInteractEvent e){
		Player p = (Player) e.getPlayer();
		Block b = e.getClickedBlock();
		
		if(e.getAction() == Action.RIGHT_CLICK_BLOCK){
			
			if(b.getState() instanceof Sign){
				
				Sign s = (Sign) b.getState();
				
				if(s.getLine(0).equalsIgnoreCase("[SA]") && s.getLine(1).equalsIgnoreCase("[L]")){
					
					p.getInventory().setHelmet(new ItemStack(Material.LEATHER_HELMET));
					p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
					p.getInventory().setLeggings(new ItemStack(Material.LEATHER_LEGGINGS));
					p.getInventory().setBoots(new ItemStack(Material.LEATHER_BOOTS));
					
					p.sendMessage(SimpleArmory.prefix + "You have been given a leather armory through a sign!");
				}
				if(s.getLine(0).equalsIgnoreCase("[SA]") && s.getLine(1).equalsIgnoreCase("[I]")){
					
					p.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));
					p.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
					p.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
					p.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
					
					p.sendMessage(SimpleArmory.prefix + "You have been given a iron armory through a sign!");
				}
				
				
				if(s.getLine(0).equalsIgnoreCase("[SA]") && s.getLine(1).equalsIgnoreCase("[D]")){
					
					p.getInventory().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
					p.getInventory().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
					p.getInventory().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
					p.getInventory().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
					
					p.sendMessage(SimpleArmory.prefix + "You have been given a diamond armory through a sign!");
				}
			}	
		}	
	}
}
