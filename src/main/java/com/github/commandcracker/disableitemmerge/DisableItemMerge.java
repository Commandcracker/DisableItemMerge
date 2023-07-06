package com.github.commandcracker.disableitemmerge;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ItemMergeEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class DisableItemMerge extends JavaPlugin implements Listener {

    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onItemMergeEvent(ItemMergeEvent event) {
        event.setCancelled(true);
    }

}
