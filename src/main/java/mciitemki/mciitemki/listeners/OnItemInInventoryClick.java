package mciitemki.mciitemki.listeners;

import mciitemki.mciitemki.items.Items;
import mciitemki.mciitemki.strings.Strings;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class OnItemInInventoryClick implements Listener {
    @SuppressWarnings("deprecation")
    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        Player pl = (Player) e.getWhoClicked();
        ItemStack item = e.getCurrentItem();
        ItemStack itemInHand = pl.getItemInHand();
        if(item == null)
            return;
        Inventory compressorInventory = e.getClickedInventory();
        if(compressorInventory==null)
            return;
        //executes if is compressor
        if(e.getView().getTitle().equalsIgnoreCase(ChatColor.GOLD + (ChatColor.BOLD + Strings.compressor))){
            //if compressed cobble
            if(item.getType() == Material.COBBLESTONE && item.getEnchantmentLevel(Enchantment.DURABILITY) == 1){
                ItemStack toRemove = new ItemStack(Material.COBBLESTONE, 64);
                boolean isStack = pl.getInventory().contains(toRemove);
                if(isStack){
                    pl.getInventory().addItem(Items.compressedCobble);
                    pl.getInventory().removeItem(toRemove);
                    e.setCancelled(true);
                    compressorInventory.close();
                }
                else{
                    pl.sendMessage(ChatColor.BOLD + (ChatColor.RED + (Strings.noMaterial)));
                    compressorInventory.close();
                }
            }
            //if compressed stone
            if(item.getType() == Material.STONE && item.getEnchantmentLevel(Enchantment.DURABILITY) == 1){
                ItemStack toRemove = new ItemStack(Material.STONE, 64);
                boolean isStack = pl.getInventory().contains(toRemove);
                if(isStack){
                    pl.getInventory().addItem(Items.compressedStone);
                    pl.getInventory().removeItem(toRemove);
                    e.setCancelled(true);
                    compressorInventory.close();
                }
                else{
                    pl.sendMessage(ChatColor.BOLD + (ChatColor.RED + (Strings.noMaterial)));
                    compressorInventory.close();
                }
            }
            //if compressed diorite
            if(item.getType() == Material.DIORITE && item.getEnchantmentLevel(Enchantment.DURABILITY) == 1){
                ItemStack toRemove = new ItemStack(Material.DIORITE, 64);
                boolean isStack = pl.getInventory().contains(toRemove);
                if(isStack){
                    pl.getInventory().addItem(Items.compressedDiorite);
                    pl.getInventory().removeItem(toRemove);
                    e.setCancelled(true);
                    compressorInventory.close();
                }
                else{
                    pl.sendMessage(ChatColor.BOLD + (ChatColor.RED + (Strings.noMaterial)));
                    compressorInventory.close();
                }
            }
            //if compressed granite
            if(item.getType() == Material.GRANITE && item.getEnchantmentLevel(Enchantment.DURABILITY) == 1){
                ItemStack toRemove = new ItemStack(Material.GRANITE, 64);
                boolean isStack = pl.getInventory().contains(toRemove);
                if(isStack){
                    pl.getInventory().addItem(Items.compressedGranite);
                    pl.getInventory().removeItem(toRemove);
                    e.setCancelled(true);
                    compressorInventory.close();
                }
                else{
                    pl.sendMessage(ChatColor.BOLD + (ChatColor.RED + (Strings.noMaterial)));
                    compressorInventory.close();
                }
            }
            //if compressed andesite
            if(item.getType() == Material.ANDESITE && item.getEnchantmentLevel(Enchantment.DURABILITY) == 1){
                ItemStack toRemove = new ItemStack(Material.ANDESITE, 64);
                boolean isStack = pl.getInventory().contains(toRemove);
                if(isStack){
                    pl.getInventory().addItem(Items.compressedAndesite);
                    pl.getInventory().removeItem(toRemove);
                    e.setCancelled(true);
                    compressorInventory.close();
                }
                else{
                    pl.sendMessage(ChatColor.BOLD + (ChatColor.RED + (Strings.noMaterial)));
                    compressorInventory.close();
                }
            }
            //if compressed stone bricks
            if(item.getType() == Material.STONE_BRICKS && item.getEnchantmentLevel(Enchantment.DURABILITY) == 1){
                ItemStack toRemove = new ItemStack(Material.STONE_BRICKS, 64);
                boolean isStack = pl.getInventory().contains(toRemove);
                if(isStack){
                    pl.getInventory().addItem(Items.compressedStoneBricks);
                    pl.getInventory().removeItem(toRemove);
                    e.setCancelled(true);
                    compressorInventory.close();
                }
                else{
                    pl.sendMessage(ChatColor.BOLD + (ChatColor.RED + (Strings.noMaterial)));
                    compressorInventory.close();
                }
            }
            //if compressed netherrack
            if(item.getType() == Material.NETHERRACK && item.getEnchantmentLevel(Enchantment.DURABILITY) == 1){
                ItemStack toRemove = new ItemStack(Material.NETHERRACK, 64);
                boolean isStack = pl.getInventory().contains(toRemove);
                if(isStack){
                    pl.getInventory().addItem(Items.compressedNetherrack);
                    pl.getInventory().removeItem(toRemove);
                    e.setCancelled(true);
                    compressorInventory.close();
                }
                else{
                    pl.sendMessage(ChatColor.BOLD + (ChatColor.RED + (Strings.noMaterial)));
                    compressorInventory.close();
                }
            }
            //if compressed sand
            if(item.getType() == Material.SAND && item.getEnchantmentLevel(Enchantment.DURABILITY) == 1){
                ItemStack toRemove = new ItemStack(Material.SAND, 64);
                boolean isStack = pl.getInventory().contains(toRemove);
                if(isStack){
                    pl.getInventory().addItem(Items.compressedSand);
                    pl.getInventory().removeItem(toRemove);
                    e.setCancelled(true);
                    compressorInventory.close();
                }
                else{
                    pl.sendMessage(ChatColor.BOLD + (ChatColor.RED + (Strings.noMaterial)));
                    compressorInventory.close();
                }
            }
            //if compressed gravel
            if(item.getType() == Material.GRAVEL && item.getEnchantmentLevel(Enchantment.DURABILITY) == 1){
                ItemStack toRemove = new ItemStack(Material.GRAVEL, 64);
                boolean isStack = pl.getInventory().contains(toRemove);
                if(isStack){
                    pl.getInventory().addItem(Items.compressedGravel);
                    pl.getInventory().removeItem(toRemove);
                    e.setCancelled(true);
                    compressorInventory.close();
                }
                else{
                    pl.sendMessage(ChatColor.BOLD + (ChatColor.RED + (Strings.noMaterial)));
                    compressorInventory.close();
                }
            }

            //if decompressed cobblestone
            if(item.getType() == Material.COBBLESTONE && item.getEnchantments().size()==0 && item.getAmount()==64){
                ItemStack toRemove = Items.compressedCobble;
                ItemStack itemToGive = new ItemStack(Material.COBBLESTONE, 64);
                boolean isInInventory = false;
                for(ItemStack itemToCheck : pl.getInventory()){
                    if(itemToCheck == null)
                        continue;
                    if(itemToCheck.isSimilar(toRemove)){
                        isInInventory = true;
                        break;
                    }
                }
                if(isInInventory){
                    pl.getInventory().addItem(itemToGive);
                    pl.getInventory().removeItem(toRemove);
                    e.setCancelled(true);
                    compressorInventory.close();
                }
                else{
                    pl.sendMessage(ChatColor.BOLD + (ChatColor.RED + (Strings.noMaterial)));
                    compressorInventory.close();
                }
            }

            //if decompressed stone
            if(item.getType() == Material.STONE && item.getEnchantments().size()==0 && item.getAmount()==64){
                ItemStack toRemove = Items.compressedStone;
                ItemStack itemToGive = new ItemStack(Material.STONE, 64);
                boolean isInInventory = false;
                for(ItemStack itemToCheck : pl.getInventory()){
                    if(itemToCheck == null)
                        continue;
                    if(itemToCheck.isSimilar(toRemove)){
                        isInInventory = true;
                        break;
                    }
                }
                if(isInInventory){
                    pl.getInventory().addItem(itemToGive);
                    pl.getInventory().removeItem(toRemove);
                    e.setCancelled(true);
                    compressorInventory.close();
                }
                else{
                    pl.sendMessage(ChatColor.BOLD + (ChatColor.RED + (Strings.noMaterial)));
                    compressorInventory.close();
                }
            }

            //if decompressed diorite
            if(item.getType() == Material.DIORITE && item.getEnchantments().size()==0 && item.getAmount()==64){
                ItemStack toRemove = Items.compressedDiorite;
                ItemStack itemToGive = new ItemStack(Material.DIORITE, 64);
                boolean isInInventory = false;
                for(ItemStack itemToCheck : pl.getInventory()){
                    if(itemToCheck == null)
                        continue;
                    if(itemToCheck.isSimilar(toRemove)){
                        isInInventory = true;
                        break;
                    }
                }
                if(isInInventory){
                    pl.getInventory().addItem(itemToGive);
                    pl.getInventory().removeItem(toRemove);
                    e.setCancelled(true);
                    compressorInventory.close();
                }
                else{
                    pl.sendMessage(ChatColor.BOLD + (ChatColor.RED + (Strings.noMaterial)));
                    compressorInventory.close();
                }
            }

            //if decompressed granite
            if(item.getType() == Material.GRANITE && item.getEnchantments().size()==0 && item.getAmount()==64){
                ItemStack toRemove = Items.compressedGranite;
                ItemStack itemToGive = new ItemStack(Material.GRANITE, 64);
                boolean isInInventory = false;
                for(ItemStack itemToCheck : pl.getInventory()){
                    if(itemToCheck == null)
                        continue;
                    if(itemToCheck.isSimilar(toRemove)){
                        isInInventory = true;
                        break;
                    }
                }
                if(isInInventory){
                    pl.getInventory().addItem(itemToGive);
                    pl.getInventory().removeItem(toRemove);
                    e.setCancelled(true);
                    compressorInventory.close();
                }
                else{
                    pl.sendMessage(ChatColor.BOLD + (ChatColor.RED + (Strings.noMaterial)));
                    compressorInventory.close();
                }
            }

            //if decompressed andesite
            if(item.getType() == Material.ANDESITE && item.getEnchantments().size()==0 && item.getAmount()==64){
                ItemStack toRemove = Items.compressedAndesite;
                ItemStack itemToGive = new ItemStack(Material.ANDESITE, 64);
                boolean isInInventory = false;
                for(ItemStack itemToCheck : pl.getInventory()){
                    if(itemToCheck == null)
                        continue;
                    if(itemToCheck.isSimilar(toRemove)){
                        isInInventory = true;
                        break;
                    }
                }
                if(isInInventory){
                    pl.getInventory().addItem(itemToGive);
                    pl.getInventory().removeItem(toRemove);
                    e.setCancelled(true);
                    compressorInventory.close();
                }
                else{
                    pl.sendMessage(ChatColor.BOLD + (ChatColor.RED + (Strings.noMaterial)));
                    compressorInventory.close();
                }
            }

            //if decompressed stone bricks
            if(item.getType() == Material.STONE_BRICKS && item.getEnchantments().size()==0 && item.getAmount()==64){
                ItemStack toRemove = Items.compressedStoneBricks;
                ItemStack itemToGive = new ItemStack(Material.STONE_BRICKS, 64);
                boolean isInInventory = false;
                for(ItemStack itemToCheck : pl.getInventory()){
                    if(itemToCheck == null)
                        continue;
                    if(itemToCheck.isSimilar(toRemove)){
                        isInInventory = true;
                        break;
                    }
                }
                if(isInInventory){
                    pl.getInventory().addItem(itemToGive);
                    pl.getInventory().removeItem(toRemove);
                    e.setCancelled(true);
                    compressorInventory.close();
                }
                else{
                    pl.sendMessage(ChatColor.BOLD + (ChatColor.RED + (Strings.noMaterial)));
                    compressorInventory.close();
                }
            }

            //if decompressed netherrack
            if(item.getType() == Material.NETHERRACK && item.getEnchantments().size()==0 && item.getAmount()==64){
                ItemStack toRemove = Items.compressedNetherrack;
                ItemStack itemToGive = new ItemStack(Material.NETHERRACK, 64);
                boolean isInInventory = false;
                for(ItemStack itemToCheck : pl.getInventory()){
                    if(itemToCheck == null)
                        continue;
                    if(itemToCheck.isSimilar(toRemove)){
                        isInInventory = true;
                        break;
                    }
                }
                if(isInInventory){
                    pl.getInventory().addItem(itemToGive);
                    pl.getInventory().removeItem(toRemove);
                    e.setCancelled(true);
                    compressorInventory.close();
                }
                else{
                    pl.sendMessage(ChatColor.BOLD + (ChatColor.RED + (Strings.noMaterial)));
                    compressorInventory.close();
                }
            }

            //if decompressed sand
            if(item.getType() == Material.SAND && item.getEnchantments().size()==0 && item.getAmount()==64){
                ItemStack toRemove = Items.compressedSand;
                ItemStack itemToGive = new ItemStack(Material.SAND, 64);
                boolean isInInventory = false;
                for(ItemStack itemToCheck : pl.getInventory()){
                    if(itemToCheck == null)
                        continue;
                    if(itemToCheck.isSimilar(toRemove)){
                        isInInventory = true;
                        break;
                    }
                }
                if(isInInventory){
                    pl.getInventory().addItem(itemToGive);
                    pl.getInventory().removeItem(toRemove);
                    e.setCancelled(true);
                    compressorInventory.close();
                }
                else{
                    pl.sendMessage(ChatColor.BOLD + (ChatColor.RED + (Strings.noMaterial)));
                    compressorInventory.close();
                }
            }

            //if decompressed gravel
            if(item.getType() == Material.GRAVEL && item.getEnchantments().size()==0 && item.getAmount()==64){
                ItemStack toRemove = Items.compressedGravel;
                ItemStack itemToGive = new ItemStack(Material.GRAVEL, 64);
                boolean isInInventory = false;
                for(ItemStack itemToCheck : pl.getInventory()){
                    if(itemToCheck == null)
                        continue;
                    if(itemToCheck.isSimilar(toRemove)){
                        isInInventory = true;
                        break;
                    }
                }
                if(isInInventory){
                    pl.getInventory().addItem(itemToGive);
                    pl.getInventory().removeItem(toRemove);
                    e.setCancelled(true);
                    compressorInventory.close();
                }
                else{
                    pl.sendMessage(ChatColor.BOLD + (ChatColor.RED + (Strings.noMaterial)));
                    compressorInventory.close();
                }
            }
            e.setCancelled(true);
        }
    }
}


