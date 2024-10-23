package ethebee3.ServerPlugin.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import ethebee3.ServerPlugin.ServerPlugin;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import java.io.File;

public class onAsyncPlayerChatEvent implements Listener {
    public onAsyncPlayerChatEvent(ServerPlugin serverPlugin) {} //random constructor, dont question it




    @EventHandler
    public void onAsyncPlayerChatEvent(AsyncPlayerChatEvent event) {
        boolean swearPresent = checkSwear(event.getMessage());
        if (swearPresent) {
            event.setCancelled(true);
            //worry about message later ig
        }
    }

    public boolean checkSwear(String message) {
        if (ServerPlugin.words != null) {

        }
        return false;
    }
}
