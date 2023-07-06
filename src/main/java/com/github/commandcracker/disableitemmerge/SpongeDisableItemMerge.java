package com.github.commandcracker.disableitemmerge;

import com.google.inject.Inject;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.Order;
import org.spongepowered.api.event.entity.ItemMergeWithItemEvent;
import org.spongepowered.api.event.lifecycle.ConstructPluginEvent;
import org.spongepowered.plugin.PluginContainer;
import org.spongepowered.plugin.builtin.jvm.Plugin;
import org.spongepowered.api.Sponge;

@Plugin("SpongeDisableItemMerge")
public class SpongeDisableItemMerge {

    @Inject
    private PluginContainer container;

    @Listener
    public void onConstructPlugin(final ConstructPluginEvent event) {
        Sponge.eventManager().registerListeners(container, this);
    }

    @Listener(order = Order.FIRST)
    public void onItemMergeWithItemEvent(ItemMergeWithItemEvent event) {
        event.setCancelled(true);
    }
}
