package mx.x10.aschim.code.bukkit.anticreep;

import org.bukkit.entity.Creeper;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class CreepListener implements Listener {

	public static AntiCreep plugin;	
	
	public CreepListener(AntiCreep instance){
		plugin = instance;
		plugin.s.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler(priority = EventPriority.HIGH)
	public void onCreeperExplosion(EntityExplodeEvent e){
		if (e.getEntity() instanceof Creeper){
			e.setCancelled(false);
			e.blockList().clear();
		}
	}
}
