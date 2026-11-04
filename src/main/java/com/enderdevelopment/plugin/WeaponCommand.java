package com.enderdevelopment.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class WeaponCommand implements CommandExecutor {

    private final CustomWeapons customWeapons;

    public WeaponCommand(CustomWeapons customWeapons) {
        this.customWeapons = customWeapons;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use this command.");
            return true;
        }

        Player player = (Player) sender;
        if (args.length != 1) {
            player.sendMessage("Usage: /giveweapon <weapon>");
            return true;
        }

        String weaponName = args[0].toLowerCase();
        ItemStack weapon = null;

        switch (weaponName) {
            case "bloodscythe":
                weapon = customWeapons.getBloodScythe();
                break;
            case "thundermace":
                weapon = customWeapons.getThunderMace();
                break;
            case "catclaw":
                weapon = customWeapons.getCatClaw();
                break;
            case "glitchdagger":
                weapon = customWeapons.getGlitchDagger();
                break;
            case "lightblade":
                weapon = customWeapons.getLightBlade();
                break;
            case "soniccrossbow":
                weapon = customWeapons.getSonicCrossbow();
                break;
            default:
                player.sendMessage("Unknown weapon: " + weaponName);
                return true;
        }

        if (weapon != null) {
            player.getInventory().addItem(weapon);
            player.sendMessage("You have been given the " + weaponName + "!");
        } else {
            player.sendMessage("Failed to give you the " + weaponName + ".");
        }

        return true;
    }

}