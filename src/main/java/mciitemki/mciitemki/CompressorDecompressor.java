package mciitemki.mciitemki;

import mciitemki.mciitemki.commands.giveCompressor;
import mciitemki.mciitemki.listeners.OnItemInInventoryClick;
import mciitemki.mciitemki.listeners.OnItemUse;
import org.bukkit.plugin.java.JavaPlugin;

public final class CompressorDecompressor extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("giveCompressor").setExecutor(new giveCompressor());
        getServer().getPluginManager().registerEvents(new OnItemUse(), this);
        getServer().getPluginManager().registerEvents(new OnItemInInventoryClick(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
