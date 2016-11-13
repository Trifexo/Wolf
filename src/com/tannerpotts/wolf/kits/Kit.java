package com.tannerpotts.wolf.kits;

        import org.bukkit.ChatColor;
        import org.bukkit.Material;
        import org.bukkit.entity.Player;
        import org.bukkit.inventory.ItemStack;
        import org.bukkit.inventory.meta.ItemMeta;

/**
 *
 * @author trifexo
 */
public abstract class Kit {
    protected ItemStack DIAMOND_SWORD = new ItemStack(Material.DIAMOND_SWORD, 1);
    protected ItemStack DIAMOND_HELMET = new ItemStack(Material.DIAMOND_HELMET, 1);
    protected ItemStack DIAMOND_CHESTPLATE = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
    protected ItemStack DIAMOND_LEGGINGS = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
    protected ItemStack DIAMOND_BOOTS = new ItemStack(Material.DIAMOND_BOOTS, 1);
    protected ItemStack IRON_SWORD = new ItemStack(Material.IRON_SWORD, 1);
    protected ItemStack IRON_HELMET = new ItemStack(Material.IRON_HELMET, 1);
    protected ItemStack IRON_CHESTPLATE = new ItemStack(Material.IRON_CHESTPLATE, 1);
    protected ItemStack IRON_LEGGINGS = new ItemStack(Material.IRON_LEGGINGS, 1);
    protected ItemStack IRON_BOOTS = new ItemStack(Material.IRON_BOOTS, 1);
    private final ItemStack MUSHROOM_SOUP = new ItemStack(Material.MUSHROOM_SOUP, 1);

    public abstract void giveItems(Player p);

    public abstract void giveEffects(Player p);

    void giveSoup(Player p) {
        ItemStack soup = MUSHROOM_SOUP;
        ItemMeta s = soup.getItemMeta();
        s.setDisplayName(ChatColor.RED + "Soup");
        soup.setItemMeta(s);
        for (int n = 0; n != 36; n += 1) {
            p.getInventory().addItem(soup);
        }
    }

    void giveSoup(Player p, int i) {
        ItemStack soup = MUSHROOM_SOUP;
        ItemMeta s = soup.getItemMeta();
        s.setDisplayName(ChatColor.RED + "Soup");
        soup.setItemMeta(s);
        for (int n = 0; n < i; n += 1) {
            p.getInventory().addItem(soup);
        }
    }
}