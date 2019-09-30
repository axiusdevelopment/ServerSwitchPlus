package com.AxiusDesigns.AxiusPlugins.ServerSwitchPlus;

import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.plugin.Plugin;

public class ServerSwitchPlus extends Plugin {

    public static Plugin instance;
    public static String prefix = "[ServerSwitchPlus] ";

    @Override
    public void onEnable() {
        System.out.print(prefix + "Enabling plugin.");

        instance = this;
        for (final ServerInfo server : getProxy().getServers().values()) getProxy().getPluginManager().registerCommand(this, new Server(server.getName()));

        System.out.print(prefix + "Plugin enabled.");
    }
}
