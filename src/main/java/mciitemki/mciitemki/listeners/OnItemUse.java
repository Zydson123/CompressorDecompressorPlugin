package mciitemki.mciitemki.listeners;

import mciitemki.mciitemki.items.Items;
import mciitemki.mciitemki.strings.Strings;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.Collections;

public class OnItemUse implements Listener {

    @SuppressWarnings("deprecation")
    @EventHandler
    public void onPlayerUse(PlayerInteractEvent event) {
        Player pl = event.getPlayer();
        ItemStack item = pl.getItemInHand();
        ArrayList<String> lore = new ArrayList<>(Collections.singleton(ChatColor.GOLD + Strings.lore));
        if(item.getEnchantmentLevel(Enchantment.DURABILITY) == 1 && item.getType() == Material.CLOCK){
            Inventory inv = Bukkit.createInventory(pl,27, ChatColor.GOLD + (ChatColor.BOLD + Strings.compressor));

            ItemStack itemToInv = Items.setupCompressedCobble();
            ItemMeta meta = itemToInv.getItemMeta();
            meta.setLore(lore);
            itemToInv.setItemMeta(meta);
            inv.setItem(0,itemToInv);

            itemToInv = Items.setupCompressedStone();
            meta = itemToInv.getItemMeta();
            meta.setLore(lore);
            itemToInv.setItemMeta(meta);

            inv.setItem(1,itemToInv);

            itemToInv = Items.setupCompressedDiorite();
            meta = itemToInv.getItemMeta();
            meta.setLore(lore);
            itemToInv.setItemMeta(meta);

            inv.setItem(2,itemToInv);

            itemToInv = Items.setupCompressedGranite();
            meta = itemToInv.getItemMeta();
            meta.setLore(lore);
            itemToInv.setItemMeta(meta);

            inv.setItem(3,itemToInv);

            itemToInv = Items.setupCompressedAndesite();
            meta = itemToInv.getItemMeta();
            meta.setLore(lore);
            itemToInv.setItemMeta(meta);

            inv.setItem(4,itemToInv);

            itemToInv = Items.setupCompressedStoneBricks();
            meta = itemToInv.getItemMeta();
            meta.setLore(lore);
            itemToInv.setItemMeta(meta);

            inv.setItem(5,itemToInv);

            itemToInv = Items.setupCompressedNetherrack();
            meta = itemToInv.getItemMeta();
            meta.setLore(lore);
            itemToInv.setItemMeta(meta);

            inv.setItem(6,itemToInv);

            itemToInv = Items.setupCompressedSand();
            meta = itemToInv.getItemMeta();
            meta.setLore(lore);
            itemToInv.setItemMeta(meta);

            inv.setItem(7,itemToInv);

            itemToInv = Items.setupCompressedGravel();
            meta = itemToInv.getItemMeta();
            meta.setLore(lore);
            itemToInv.setItemMeta(meta);

            inv.setItem(8,itemToInv);

            inv.setItem(18,Items.setupDecompressedCobble());
            inv.setItem(19,Items.setupDecompressedStone());
            inv.setItem(20,Items.setupDecompressedDiorite());
            inv.setItem(21,Items.setupDecompressedGranite());
            inv.setItem(22,Items.setupDecompressedAndesite());
            inv.setItem(23,Items.setupDecompressedStoneBricks());
            inv.setItem(24,Items.setupDecompressedNetherrack());
            inv.setItem(25,Items.setupDecompressedSand());
            inv.setItem(26,Items.setupDecompressedGravel());

            pl.openInventory(inv);


        }
    }
}
