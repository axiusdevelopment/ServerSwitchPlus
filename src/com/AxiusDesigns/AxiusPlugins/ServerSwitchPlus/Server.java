package com.AxiusDesigns.AxiusPlugins.ServerSwitchPlus;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class Server extends Command {

    private String name;

    public Server(String name) {
        super(name);
        this.name = name;
        if(!ServerSwitchPlus.instance.getProxy().getServers().containsKey(name)) System.err.print(ServerSwitchPlus.prefix + "Server not found!");
    }

    @Override
    public void execute(CommandSender sndr, String[] strings) {
        if(!(sndr instanceof ProxiedPlayer)) return;
        ((ProxiedPlayer) sndr).connect(ServerSwitchPlus.instance.getProxy().getServerInfo(name));
    }
}
