package mciitemki.mciitemki.commands;

import mciitemki.mciitemki.strings.Strings;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

public class giveCompressor implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if(!(commandSender instanceof Player))
            return true;
        Player pl = (Player) commandSender;
        if(!pl.isOp())
            return true;
        ItemStack compressor = new ItemStack(Material.CLOCK,1);
        ItemMeta meta = compressor.getItemMeta();
        meta.setDisplayName(ChatColor.BOLD + (ChatColor.GOLD + Strings.compressor));
        compressor.setItemMeta(meta);
        compressor.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
        pl.getInventory().addItem(compressor);
        return true;
    }
}
