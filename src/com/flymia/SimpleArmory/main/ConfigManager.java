package com.flymia.SimpleArmory.main;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class ConfigManager {

	SimpleArmory plugin;
	
	private FileConfiguration cfg = null;
	private File settings = null;
	
	public ConfigManager(SimpleArmory p){
		this.plugin = p;
		
		if(settings == null){
			settings = new File("plugins/SimpleArmory" + File.separator + "settings.yml");
		}
		cfg = YamlConfiguration.loadConfiguration(settings);
		cfg.options().copyDefaults(false);
	}
	
	public void addDefaults(){
		cfg.set("simplearmory.settings.pay-for-armor", true);
		save();
	}
	
	public void save(){
		try {
			cfg.save(settings);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public FileConfiguration getConfig(){
		return cfg;
	}
	
	
}
