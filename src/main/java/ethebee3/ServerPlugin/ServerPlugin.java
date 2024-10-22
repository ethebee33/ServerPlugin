package ethebee3.ServerPlugin;

import ethebee3.ServerPlugin.commands.DupeCMD;
import org.bukkit.plugin.java.JavaPlugin;
import ethebee3.ServerPlugin.events.*;

public final class ServerPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        registerListeners();
        registerCommands();
    }

    @Override
    public void onDisable() {

    }

    //more organized this way
    public void registerListeners() {
        this.getServer().getPluginManager().registerEvents(new onAsyncPlayerChatEvent(this), this);
    }

    public void registerCommands() {
        this.getCommand("dupe").setExecutor(new DupeCMD());
    }

}
