package com.flymia.SimpleArmory.main;
	
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import net.milkbowl.vault.economy.Economy;

import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import com.flymia.SimpleArmory.Commands.AdminSimpleArmory;
import com.flymia.SimpleArmory.Commands.ArmoryChooserCommand;
import com.flymia.SimpleArmory.Commands.ClearArmoryCommand;
import com.flymia.SimpleArmory.Commands.FightpacksCommand;
import com.flymia.SimpleArmory.Commands.GiveArmoryCommand;
import com.flymia.SimpleArmory.Commands.SendArmoryCommand;
import com.flymia.SimpleArmory.Listener.InventoryListener;
import com.flymia.SimpleArmory.Listener.SignEvent;

public class SimpleArmory extends JavaPlugin {
	
	/**
	 * SimpleArmory Bukkit Plugin code written by flymia.
	 * All copyright goes to flymia.
	 * @author flymia
	 */
	
	public static String prefix = "§3[SimpleArmory]§a ";
	public Inventory inv;
	public List<String> desc = new ArrayList<String>();
	public List<String> leatherDesc = new ArrayList<String>();
	public List<String> ironDesc = new ArrayList<String>();
	public List<String> goldDesc = new ArrayList<String>();
	public List<String> diamondDesc = new ArrayList<String>();
	public List<String> chainDesc = new ArrayList<String>();
	public List<String> endDesc = new ArrayList<String>();
	public static Economy economy = null;
	private ConfigManager cm = null;
	
	
	public void onEnable(){		
		System.out.println("[SimpleArmory] SimpleArmory is starting! You are using version v" + this.getDescription().getVersion());
		register();
		registerEvents();
		System.out.println("[SimpleArmory] Loading config...");
		loadConfig();
		System.out.println("[SimpleArmory] Config loaded!");
		System.out.println("[SimpleArmory] Trying to catch metrics...");
		try {
			Metrics metrics = new Metrics(this); metrics.start();
			} catch (IOException e) {
			System.out.println("Error Submitting stats!");
		}
		System.out.println("[SimpleArmory] Catched!");
	}
	
	public void onDisable(){
		System.out.println("SimpleArmory is stopping! You are using version v" + this.getDescription().getVersion());
	}
	
	public void loadConfig(){
		cm = new ConfigManager(this);
		if(cm.getConfig() == null){
			cm.addDefaults();
		}
	}
	
	public void register() {
		this.getCommand("simplearmory").setExecutor(new AdminSimpleArmory(this));
		this.getCommand("givearmory").setExecutor(new GiveArmoryCommand(this));
		this.getCommand("fightpack").setExecutor(new FightpacksCommand(this));
		this.getCommand("choosearmory").setExecutor(new ArmoryChooserCommand(this));
		this.getCommand("cleararmory").setExecutor(new ClearArmoryCommand(this));
		this.getCommand("sendarmory").setExecutor(new SendArmoryCommand(this));
		
		desc.add("Gives you the 'rainbow' armory!");
		leatherDesc.add("Gives you leather armory!");
		ironDesc.add("Gives you iron armory!");
		goldDesc.add("Gives you gold armory!");
		diamondDesc.add("Gives you diamond armory!");
		chainDesc.add("Gives you chain armory!");
		endDesc.add("Closes the menu.");
	}
	
	public void registerEvents(){
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvents(new InventoryListener(), this);
		pm.registerEvents(new SignEvent(), this);
	}
	
	private boolean setupEconomy()
    {
        RegisteredServiceProvider<Economy> economyProvider = getServer().getServicesManager().getRegistration(net.milkbowl.vault.economy.Economy.class);
        if (economyProvider != null) {
            economy = economyProvider.getProvider();
        }

        return (economy != null);
    }
	
}
