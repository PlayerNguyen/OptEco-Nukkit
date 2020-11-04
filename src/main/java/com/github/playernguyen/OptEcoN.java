package com.github.playernguyen;

import cn.nukkit.plugin.PluginBase;

public class OptEcoN extends PluginBase {

    public static OptEcoN inst;

    @Override
    public void onEnable() {
        // Initial the plugin
        initial();
        // Instance setup
        setupInstance();
    }

    private void setupInstance() {
        inst = this;
        

    }

    private void initial() {
        this.getLogger().info("OptEco for Nukkit v." + this.getDescription().getVersion());
        this.getLogger().info("---------------------");
    }
}
