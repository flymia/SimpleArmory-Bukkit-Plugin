package com.flymia.SimpleArmory.Commands;
//
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import com.flymia.SimpleArmory.main.SimpleArmory;

public class FightpacksCommand implements CommandExecutor{

	SimpleArmory plugin;
	
	public FightpacksCommand(Plugin plugin){
		
	}
	
	@Override
	public boolean onCommand(CommandSender p, Command cmd, String label, String[] args) {
		if(p.hasPermission("simplearmory.fightpack")){
			
			if(args.length == 0){
				p.sendMessage(SimpleArmory.prefix + "This command will work in 1.4.5 :) I am working on it!");
				return true;
			
			}else if(args.length == 1 && args[0].equalsIgnoreCase("diamond")){
				Player player = (Player) p;
				
				//ItemStacks
				ItemStack specialBowS = new ItemStack(Material.BOW);
				ItemStack superSword = new ItemStack(Material.DIAMOND_SWORD);
				
				//ItemMeta
				ItemMeta specialBow = specialBowS.getItemMeta();
				ItemMeta superSwordM = superSword.getItemMeta();
				
				specialBow.setDisplayName("§a§L Bowmonster!");
				specialBowS.setItemMeta(specialBow);
				specialBowS.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 5);
				specialBowS.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 1);
				specialBowS.addUnsafeEnchantment(Enchantment.ARROW_INFINITE , 1);
				specialBowS.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK , 2);
				specialBowS.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
				
				superSwordM.setDisplayName("§a§L Supersword!");
				superSword.setItemMeta(superSwordM);
				superSword.addEnchantment(Enchantment.DAMAGE_ALL, 5);
				superSword.addEnchantment(Enchantment.DURABILITY, 3);
				superSword.addEnchantment(Enchantment.KNOCKBACK, 2);
				//Armory
				player.getInventory().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
				player.getInventory().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
				player.getInventory().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
				player.getInventory().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
				//Items
				player.getInventory().addItem(superSword);
				player.getInventory().addItem(specialBowS);
				player.getInventory().addItem(new ItemStack(Material.ARROW));
				
				
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
