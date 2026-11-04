package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
                CustomWeapons customWeapons = new CustomWeapons(this);
        customWeapons.registerWeapons();
        getCommand("giveweapon").setExecutor(new WeaponCommand(customWeapons));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}