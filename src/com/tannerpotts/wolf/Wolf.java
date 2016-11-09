package com.tannerpotts.wolf;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Trifexo on 11/8/2016.
 */

public class Wolf extends JavaPlugin {

    Events eventHandler = new Events();

    @Override
    public void onDisable() {
        super.onDisable();

    }

    @Override
    public void onEnable() {
        super.onEnable();
        getServer().getPluginManager().registerEvents(eventHandler, this);
    }
}
