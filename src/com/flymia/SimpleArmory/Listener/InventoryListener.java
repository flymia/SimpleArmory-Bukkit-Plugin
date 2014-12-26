package com.flymia.SimpleArmory.Listener;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import com.flymia.SimpleArmory.Commands.ArmoryChooserCommand;
import com.flymia.SimpleArmory.main.SimpleArmory;

public class InventoryListener implements Listener {

	ArmoryChooserCommand acc; 
	
	@EventHandler
	public void onInvClick(InventoryClickEvent e){
		Player p = (Player) e.getWhoClicked();
		
		if(e.getInventory().getName().equalsIgnoreCase("§3§O Choose your armory!")){
			e.setCancelled(true);
			if(e.getCurrentItem().getType() == Material.LEATHER_CHESTPLATE){
				
				p.getInventory().setHelmet(new ItemStack(Material.LEATHER_HELMET));
				p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
				p.getInventory().setLeggings(new ItemStack(Material.LEATHER_LEGGINGS));
				p.getInventory().setBoots(new ItemStack(Material.LEATHER_BOOTS));
				p.closeInventory();
				
				p.sendMessage(SimpleArmory.prefix + "You have been given a leather armory through the menu!");
				
			}else if(e.getCurrentItem().getType() == Material.IRON_CHESTPLATE){
				
				p.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));
				p.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
				p.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
				p.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
				p.closeInventory();
				p.sendMessage(SimpleArmory.prefix + "You have been given a iron armory through the menu!");
			}else if(e.getCurrentItem().getType() == Material.GOLD_CHESTPLATE){
				
				p.getInventory().setHelmet(new ItemStack(Material.GOLD_HELMET));
				p.getInventory().setChestplate(new ItemStack(Material.GOLD_CHESTPLATE));
				p.getInventory().setLeggings(new ItemStack(Material.GOLD_LEGGINGS));
				p.getInventory().setBoots(new ItemStack(Material.GOLD_BOOTS));
				p.closeInventory();
				p.sendMessage(SimpleArmory.prefix + "You have been given a golden armory through the menu!");
				System.out.println("[SimpleArmory] Player " + p.getDisplayName() + " was given a golden armory!");
			}else if(e.getCurrentItem().getType() == Material.DIAMOND_CHESTPLATE){
				
				p.getInventory().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
				p.getInventory().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
				p.getInventory().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
				p.getInventory().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
				p.closeInventory();
				p.sendMessage(SimpleArmory.prefix + "You have been given a diamond armory through the menu!");
				
			}else if(e.getCurrentItem().getType() == Material.CHAINMAIL_CHESTPLATE){
				
				p.getInventory().setHelmet(new ItemStack(Material.CHAINMAIL_HELMET));
				p.getInventory().setChestplate(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
				p.getInventory().setLeggings(new ItemStack(Material.CHAINMAIL_LEGGINGS));
				p.getInventory().setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
				p.closeInventory();
				p.sendMessage(SimpleArmory.prefix + "You have been given a chain armory through the menu!");
				
				
			}else if(e.getCurrentItem().getType() == Material.MAGMA_CREAM){
				
				p.getInventory().setHelmet(new ItemStack(Material.LEATHER_HELMET));
				p.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
				p.getInventory().setLeggings(new ItemStack(Material.GOLD_LEGGINGS));
				p.getInventory().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
				p.closeInventory();
				p.sendMessage(SimpleArmory.prefix + "You have been given the rainbow armory through the menu!");	
			}else if(e.getCurrentItem().getType() == Material.REDSTONE_BLOCK){
				p.closeInventory();
				p.sendMessage(SimpleArmory.prefix + "Menu closed.");
			}else if(e.getCurrentItem().getType() == null){
				return;
			}
			
		}
	}	
}