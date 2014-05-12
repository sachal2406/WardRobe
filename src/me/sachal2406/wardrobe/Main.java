package me.sachal2406.wardrobe;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;
 
public class Main extends JavaPlugin implements Listener {
 
        private Menu menu;
        ArrayList<Player> invmenu = new ArrayList<Player>();
        
        public void onEnable() {
                menu = new Menu(this);
                Bukkit.getServer().getPluginManager().registerEvents(this, this);
        }
       
        
        @EventHandler
        public void onPlayerInteract(PlayerInteractEvent e) {
        	Player p = e.getPlayer();
                if (!(e.getAction() == Action.RIGHT_CLICK_AIR)) return;
                	if (!(e.getItem().getType() == Material.IRON_INGOT)) return;
	                		menu.show(p);
	                	} 
}
