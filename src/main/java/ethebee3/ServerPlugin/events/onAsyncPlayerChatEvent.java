package ethebee3.ServerPlugin.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import ethebee3.ServerPlugin.ServerPlugin;
import org.bukkit.event.player.AsyncPlayerChatEvent;

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
        //very simple
        if (message.contains("nigger")) return true;

        return false;
    }
}
