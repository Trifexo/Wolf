package com.tannerpotts.wolf.kits;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentWrapper;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

/**
 * Created by Trifexo on 11/12/2016.
 */

public class PVP extends Kit {
    @Override
    public void giveItems(Player p) {
        // Enchantments used
        Enchantment S = new EnchantmentWrapper(16);
        // Sword Modifiers
        IRON_SWORD.addEnchantment(S, 1);
        // Add items
        PlayerInventory pi = p.getInventory();
        pi.clear();
        pi.setHelmet(IRON_HELMET);
        pi.setChestplate(IRON_CHESTPLATE);
        pi.setLeggings(IRON_LEGGINGS);
        pi.setBoots(IRON_BOOTS);
        pi.addItem(IRON_SWORD);
        giveSoup(p);
        p.sendMessage(ChatColor.DARK_GREEN + "Obtained the PvP kit.");
    }

    @Override
    public void giveEffects(Player p) {
        // TODO Auto-generated method stud
    }
}
