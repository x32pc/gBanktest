package com.x32pc.github.gbanktest;

import com.x32pc.github.GBank;
import com.x32pc.github.api.API;
import com.x32pc.github.api.APIImplementation;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class GBanktest extends JavaPlugin {
    public API api;

    public void onEnable() {
        api = this.getServer().getServicesManager().load(API.class);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(String.valueOf(api.getAmountCurrency(Bukkit.getOfflinePlayer(args[0]).getUniqueId().toString(), args[1])));
        return true;
    }
}
