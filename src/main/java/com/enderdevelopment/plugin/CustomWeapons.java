package com.enderdevelopment.plugin;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Arrays;
import java.util.List;

public class CustomWeapons {

    private final JavaPlugin plugin;

    public CustomWeapons(JavaPlugin plugin) {
        this.plugin = plugin;
    }

        public ItemStack getBloodScythe() {
        ItemStack bloodScythe = new ItemStack(Material.NETHERITE_HOE);
        ItemMeta meta = bloodScythe.getItemMeta();
        meta.setDisplayName("Blood Scythe");
        meta.setLore(Arrays.asList("Red", "Blood Aura", "Resistance and Withering Effects"));
        bloodScythe.setItemMeta(meta);
        return bloodScythe;
    }

    public ItemStack getThunderMace() {
        ItemStack thunderMace = new ItemStack(Material.NETHERITE_AXE);
        ItemMeta meta = thunderMace.getItemMeta();
        meta.setDisplayName("Thunder Mace");
        meta.setLore(Arrays.asList("Blue-Yellow", "Thunder Effect", "Thunderstruck Skill"));
        thunderMace.setItemMeta(meta);
        return thunderMace;
    }

    public ItemStack getCatClaw() {
        ItemStack catClaw = new ItemStack(Material.NETHERITE_SWORD);
        ItemMeta meta = catClaw.getItemMeta();
        meta.setDisplayName("Cat Claw");
        meta.setLore(Arrays.asList("Black", "Darkness and Poison Effects", "Claw Slash"));
        catClaw.setItemMeta(meta);
        return catClaw;
    }

    public ItemStack getGlitchDagger() {
        ItemStack glitchDagger = new ItemStack(Material.NETHERITE_SWORD);
        ItemMeta meta = glitchDagger.getItemMeta();
        meta.setDisplayName("Glitch Dagger");
        meta.setLore(Arrays.asList("Purple", "Glitch Effect", "Freeze Skill"));
        glitchDagger.setItemMeta(meta);
        return glitchDagger;
    }

    public ItemStack getLightBlade() {
        ItemStack lightBlade = new ItemStack(Material.NETHERITE_SWORD);
        ItemMeta meta = lightBlade.getItemMeta();
        meta.setDisplayName("Light Blade");
        meta.setLore(Arrays.asList("Orange", "Fire Spread Skill", "30s Cooldown"));
        lightBlade.setItemMeta(meta);
        return lightBlade;
    }

    public ItemStack getSonicCrossbow() {
        ItemStack sonicCrossbow = new ItemStack(Material.CROSSBOW);
        ItemMeta meta = sonicCrossbow.getItemMeta();
        meta.setDisplayName("Sonic Crossbow");
        meta.setLore(Arrays.asList("Black-Orange", "Grappling Hook Skill"));
        sonicCrossbow.setItemMeta(meta);
        return sonicCrossbow;
    }

    public void registerWeapons() {
        registerBloodScythe();
        registerThunderMace();
        registerCatClaw();
        registerGlitchDagger();
        registerLightBlade();
        registerSonicCrossbow();
    }

    private void registerBloodScythe() {
        ItemStack bloodScythe = new ItemStack(Material.NETHERITE_HOE);
        ItemMeta meta = bloodScythe.getItemMeta();
        meta.setDisplayName("Blood Scythe");
        meta.setLore(Arrays.asList("Red", "Blood Aura", "Resistance and Withering Effects"));
        bloodScythe.setItemMeta(meta);

        NamespacedKey key = new NamespacedKey(plugin, "blood_scythe");
        ShapedRecipe recipe = new ShapedRecipe(key, bloodScythe);
        recipe.shape(" D ", " S ", " B ");
        recipe.setIngredient('D', Material.DIAMOND);
        recipe.setIngredient('S', Material.STICK);
        recipe.setIngredient('B', Material.BONE);
        plugin.getServer().addRecipe(recipe);
    }

    private void registerThunderMace() {
        ItemStack thunderMace = new ItemStack(Material.NETHERITE_AXE);
        ItemMeta meta = thunderMace.getItemMeta();
        meta.setDisplayName("Thunder Mace");
        meta.setLore(Arrays.asList("Blue-Yellow", "Thunder Effect", "Thunderstruck Skill"));
        thunderMace.setItemMeta(meta);

        NamespacedKey key = new NamespacedKey(plugin, "thunder_mace");
        ShapedRecipe recipe = new ShapedRecipe(key, thunderMace);
        recipe.shape(" I ", " I ", " S ");
        recipe.setIngredient('I', Material.IRON_INGOT);
        recipe.setIngredient('S', Material.STICK);
        plugin.getServer().addRecipe(recipe);
    }

    private void registerCatClaw() {
        ItemStack catClaw = new ItemStack(Material.NETHERITE_SWORD);
        ItemMeta meta = catClaw.getItemMeta();
        meta.setDisplayName("Cat Claw");
        meta.setLore(Arrays.asList("Black", "Darkness and Poison Effects", "Claw Slash"));
        catClaw.setItemMeta(meta);

        NamespacedKey key = new NamespacedKey(plugin, "cat_claw");
        ShapedRecipe recipe = new ShapedRecipe(key, catClaw);
        recipe.shape(" C ", " S ", " B ");
        recipe.setIngredient('C', Material.COAL);
        recipe.setIngredient('S', Material.STICK);
        recipe.setIngredient('B', Material.BONE);
        plugin.getServer().addRecipe(recipe);
    }

    private void registerGlitchDagger() {
        ItemStack glitchDagger = new ItemStack(Material.NETHERITE_SWORD);
        ItemMeta meta = glitchDagger.getItemMeta();
        meta.setDisplayName("Glitch Dagger");
        meta.setLore(Arrays.asList("Purple", "Glitch Effect", "Freeze Skill"));
        glitchDagger.setItemMeta(meta);

        NamespacedKey key = new NamespacedKey(plugin, "glitch_dagger");
        ShapedRecipe recipe = new ShapedRecipe(key, glitchDagger);
        recipe.shape(" D ", " S ", " B ");
        recipe.setIngredient('D', Material.DIAMOND);
        recipe.setIngredient('S', Material.STICK);
        recipe.setIngredient('B', Material.BONE);
        plugin.getServer().addRecipe(recipe);
    }

    private void registerLightBlade() {
        ItemStack lightBlade = new ItemStack(Material.NETHERITE_SWORD);
        ItemMeta meta = lightBlade.getItemMeta();
        meta.setDisplayName("Light Blade");
        meta.setLore(Arrays.asList("Orange", "Fire Spread Skill", "30s Cooldown"));
        lightBlade.setItemMeta(meta);

        NamespacedKey key = new NamespacedKey(plugin, "light_blade");
        ShapedRecipe recipe = new ShapedRecipe(key, lightBlade);
        recipe.shape(" G ", " S ", " B ");
        recipe.setIngredient('G', Material.GOLD_INGOT);
        recipe.setIngredient('S', Material.STICK);
        recipe.setIngredient('B', Material.BONE);
        plugin.getServer().addRecipe(recipe);
    }

    private void registerSonicCrossbow() {
        ItemStack sonicCrossbow = new ItemStack(Material.CROSSBOW);
        ItemMeta meta = sonicCrossbow.getItemMeta();
        meta.setDisplayName("Sonic Crossbow");
        meta.setLore(Arrays.asList("Black-Orange", "Grappling Hook Skill"));
        sonicCrossbow.setItemMeta(meta);

        NamespacedKey key = new NamespacedKey(plugin, "sonic_crossbow");
        ShapedRecipe recipe = new ShapedRecipe(key, sonicCrossbow);
        recipe.shape(" S ", " I ", " B ");
        recipe.setIngredient('S', Material.STRING);
        recipe.setIngredient('I', Material.IRON_INGOT);
        recipe.setIngredient('B', Material.BOW);
        plugin.getServer().addRecipe(recipe);
    }

}