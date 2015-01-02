package com.flymia.SimpleArmory.Commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.flymia.SimpleArmory.main.SimpleArmory;

public class ArmoryChooserCommand implements CommandExecutor {
	
	//Normale Editiotn
	
	public ItemStack leatherArmory = new ItemStack(Material.LEATHER_CHESTPLATE);
	public ItemStack ironArmory = new ItemStack(Material.IRON_CHESTPLATE);
	public ItemStack goldArmory = new ItemStack(Material.GOLD_CHESTPLATE);
	public ItemStack diamondArmory = new ItemStack(Material.DIAMOND_CHESTPLATE);
	public ItemStack chainArmory = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
	public ItemStack rainBowArmory = new ItemStack(Material.MAGMA_CREAM);
	public ItemStack endMenuItem = new ItemStack(Material.REDSTONE_BLOCK);
	public ItemStack removeItem = new ItemStack(Material.ARROW);
	
	
	SimpleArmory plugin;
	
	public ArmoryChooserCommand(SimpleArmory plugin){
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender p, Command cmd, String label, String[] args) {
		if(p.hasPermission("simplearmory.choosearmory")){
			if(args.length == 0){
				Player p1 = (Player) p;
				//Itemstacks to put into the inventory (to set the armory)

				ItemMeta clearMeta = removeItem.getItemMeta();
				clearMeta.setLore(this.plugin.removeDesc);
				clearMeta.setDisplayName("§4§L Armor remover");
				removeItem.setItemMeta(clearMeta);
				
				ItemMeta rainbowMeta = rainBowArmory.getItemMeta();
				rainbowMeta.setLore(this.plugin.desc);
				rainbowMeta.setDisplayName("§a§L Rainbow armory");
				rainBowArmory.setItemMeta(rainbowMeta);
							
				ItemMeta leatherMeta = leatherArmory.getItemMeta();
				leatherMeta.setLore(this.plugin.leatherDesc);
				leatherMeta.setDisplayName("§a§L Leather armory");
				leatherArmory.setItemMeta(leatherMeta);
				
			
				ItemMeta ironMeta = ironArmory.getItemMeta();
				ironMeta.setLore(this.plugin.ironDesc);
				ironMeta.setDisplayName("§a§L Iron armory");
				ironArmory.setItemMeta(ironMeta);
				
				ItemMeta goldMeta = goldArmory.getItemMeta();
				goldMeta.setLore(this.plugin.goldDesc);
				goldMeta.setDisplayName("§a§L Gold armory");
				goldArmory.setItemMeta(goldMeta);
				
				
				ItemMeta diamondMeta = diamondArmory.getItemMeta();
				diamondMeta.setLore(this.plugin.diamondDesc);
				diamondMeta.setDisplayName("§a§L Diamond armory");
				diamondArmory.setItemMeta(diamondMeta);
				
				ItemMeta chainMeta = chainArmory.getItemMeta();
				chainMeta.setLore(this.plugin.chainDesc);
				chainMeta.setDisplayName("§a§L Chain armory");
				chainArmory.setItemMeta(chainMeta);
				
				ItemMeta menuEndItemMeta = endMenuItem.getItemMeta();
				menuEndItemMeta.setLore(this.plugin.endDesc);
				menuEndItemMeta.setDisplayName("§a§O Menu closer");
				endMenuItem.setItemMeta(menuEndItemMeta);
				
				plugin.inv = p.getServer().createInventory(null, 9, "§3§OChoose your armory!");
				plugin.inv.setItem(0, leatherArmory);
				plugin.inv.setItem(1, ironArmory);
				plugin.inv.setItem(2, goldArmory);
				plugin.inv.setItem(3, diamondArmory);
				plugin.inv.setItem(4, chainArmory);
				plugin.inv.setItem(5, rainBowArmory);
				plugin.inv.setItem(6, removeItem);
				
				plugin.inv.setItem(8, endMenuItem);
				
				
				p1.openInventory(plugin.inv);
				
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