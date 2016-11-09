package com.tannerpotts.wolf;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Trifexo on 11/8/2016.
 */

public class Wolf extends JavaPlugin{

    @Override
    public void onDisable() {
        super.onDisable();
        getLogger().info("Wolf Starting!");
    }

    @Override
    public void onEnable() {
        super.onEnable();
    }
}
