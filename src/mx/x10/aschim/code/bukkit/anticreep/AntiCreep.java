package mx.x10.aschim.code.bukkit.anticreep;

import java.util.logging.Logger;

import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;

public class AntiCreep extends JavaPlugin {
	
	public Server s = getServer();
	Logger l = s.getLogger();
	
	@Override
	public void onEnable(){
		new CreepListener(this);
		l.info("AntiCreep has been enabled!");
	}
	
	@Override
	public void onDisable(){
		l.info("AntiCreep has been disabled!");
	}
}
