package mciitemki.mciitemki.items;

import mciitemki.mciitemki.strings.Strings;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Collections;

public class Items {

    public static final ItemStack compressedCobble = setupCompressedCobble();
    public static final ItemStack compressedStone = setupCompressedStone();
    public static final ItemStack compressedDiorite = setupCompressedDiorite();
    public static final ItemStack compressedGranite = setupCompressedGranite();
    public static final ItemStack compressedAndesite = setupCompressedAndesite();
    public static final ItemStack compressedStoneBricks = setupCompressedStoneBricks();
    public static final ItemStack compressedNetherrack = setupCompressedNetherrack();
    public static final ItemStack compressedSand = setupCompressedSand();
    public static final ItemStack compressedGravel = setupCompressedGravel();

    public static ItemStack setupCompressedCobble(){
        ItemStack item = new ItemStack(Material.COBBLESTONE,1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + (ChatColor.BOLD + Strings.compressedCobble));
        item.setItemMeta(meta);
        item.addUnsafeEnchantment(Enchantment.DURABILITY,1);
        return item;
    }

    public static ItemStack setupCompressedStone(){
        ItemStack item = new ItemStack(Material.STONE,1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + (ChatColor.BOLD + Strings.compressedStone));
        item.setItemMeta(meta);
        item.addUnsafeEnchantment(Enchantment.DURABILITY,1);
        return item;
    }

    public static ItemStack setupCompressedDiorite(){
        ItemStack item = new ItemStack(Material.DIORITE,1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + (ChatColor.BOLD + Strings.compressedDiorite));
        item.setItemMeta(meta);
        item.addUnsafeEnchantment(Enchantment.DURABILITY,1);
        return item;
    }

    public static ItemStack setupCompressedGranite(){
        ItemStack item = new ItemStack(Material.GRANITE,1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + (ChatColor.BOLD + Strings.compressedGranite));
        item.setItemMeta(meta);
        item.addUnsafeEnchantment(Enchantment.DURABILITY,1);
        return item;
    }

    public static ItemStack setupCompressedAndesite(){
        ItemStack item = new ItemStack(Material.ANDESITE,1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + (ChatColor.BOLD + Strings.compressedAndesite));
        item.setItemMeta(meta);
        item.addUnsafeEnchantment(Enchantment.DURABILITY,1);
        return item;
    }

    public static ItemStack setupCompressedStoneBricks(){
        ItemStack item = new ItemStack(Material.STONE_BRICKS,1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + (ChatColor.BOLD + Strings.compressedStoneBricks));
        item.setItemMeta(meta);
        item.addUnsafeEnchantment(Enchantment.DURABILITY,1);
        return item;
    }

    public static ItemStack setupCompressedNetherrack(){
        ItemStack item = new ItemStack(Material.NETHERRACK,1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + (ChatColor.BOLD + Strings.compressedNetherrack));
        item.setItemMeta(meta);
        item.addUnsafeEnchantment(Enchantment.DURABILITY,1);
        return item;
    }

    public static ItemStack setupCompressedSand(){
        ItemStack item = new ItemStack(Material.SAND,1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + (ChatColor.BOLD + Strings.compressedSand));
        item.setItemMeta(meta);
        item.addUnsafeEnchantment(Enchantment.DURABILITY,1);
        return item;
    }

    public static ItemStack setupCompressedGravel(){
        ItemStack item = new ItemStack(Material.GRAVEL,1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + (ChatColor.BOLD + Strings.compressedGravel));
        item.setItemMeta(meta);
        item.addUnsafeEnchantment(Enchantment.DURABILITY,1);
        return item;
    }

    public static ItemStack setupDecompressedCobble(){
        ItemStack item = new ItemStack(Material.COBBLESTONE,64);
        ItemMeta meta = item.getItemMeta();
        ArrayList<String> lore = new ArrayList<>(Collections.singleton(ChatColor.GOLD + Strings.lore2));
        meta.setLore(lore);
        meta.setDisplayName(ChatColor.GOLD + (ChatColor.BOLD + Strings.decompressedCobble));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack setupDecompressedStone(){
        ItemStack item = new ItemStack(Material.STONE,64);
        ItemMeta meta = item.getItemMeta();
        ArrayList<String> lore = new ArrayList<>(Collections.singleton(ChatColor.GOLD + Strings.lore2));
        meta.setLore(lore);
        meta.setDisplayName(ChatColor.GOLD + (ChatColor.BOLD + Strings.decompressedStone));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack setupDecompressedDiorite(){
        ItemStack item = new ItemStack(Material.DIORITE,64);
        ItemMeta meta = item.getItemMeta();
        ArrayList<String> lore = new ArrayList<>(Collections.singleton(ChatColor.GOLD + Strings.lore2));
        meta.setLore(lore);
        meta.setDisplayName(ChatColor.GOLD + (ChatColor.BOLD + Strings.decompressedDiorite));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack setupDecompressedGranite(){
        ItemStack item = new ItemStack(Material.GRANITE,64);
        ItemMeta meta = item.getItemMeta();
        ArrayList<String> lore = new ArrayList<>(Collections.singleton(ChatColor.GOLD + Strings.lore2));
        meta.setLore(lore);
        meta.setDisplayName(ChatColor.GOLD + (ChatColor.BOLD + Strings.decompressedGranite));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack setupDecompressedAndesite(){
        ItemStack item = new ItemStack(Material.ANDESITE,64);
        ItemMeta meta = item.getItemMeta();
        ArrayList<String> lore = new ArrayList<>(Collections.singleton(ChatColor.GOLD + Strings.lore2));
        meta.setLore(lore);
        meta.setDisplayName(ChatColor.GOLD + (ChatColor.BOLD + Strings.decompressedAndesite));
        item.setItemMeta(meta);
        return item;
    }
    public static ItemStack setupDecompressedStoneBricks(){
        ItemStack item = new ItemStack(Material.COBBLESTONE,64);
        ItemMeta meta = item.getItemMeta();
        ArrayList<String> lore = new ArrayList<>(Collections.singleton(ChatColor.GOLD + Strings.lore2));
        meta.setLore(lore);
        meta.setDisplayName(ChatColor.GOLD + (ChatColor.BOLD + Strings.decompressedStoneBricks));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack setupDecompressedNetherrack(){
        ItemStack item = new ItemStack(Material.NETHERRACK,64);
        ItemMeta meta = item.getItemMeta();
        ArrayList<String> lore = new ArrayList<>(Collections.singleton(ChatColor.GOLD + Strings.lore2));
        meta.setLore(lore);
        meta.setDisplayName(ChatColor.GOLD + (ChatColor.BOLD + Strings.decompressedNetherrack));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack setupDecompressedSand(){
        ItemStack item = new ItemStack(Material.SAND,64);
        ItemMeta meta = item.getItemMeta();
        ArrayList<String> lore = new ArrayList<>(Collections.singleton(ChatColor.GOLD + Strings.lore2));
        meta.setLore(lore);
        meta.setDisplayName(ChatColor.GOLD + (ChatColor.BOLD + Strings.decompressedSand));
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack setupDecompressedGravel(){
        ItemStack item = new ItemStack(Material.GRAVEL,64);
        ItemMeta meta = item.getItemMeta();
        ArrayList<String> lore = new ArrayList<>(Collections.singleton(ChatColor.GOLD + Strings.lore2));
        meta.setLore(lore);
        meta.setDisplayName(ChatColor.GOLD + (ChatColor.BOLD + Strings.decompressedGravel));
        item.setItemMeta(meta);
        return item;
    }
}
