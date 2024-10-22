package ethebee3.ServerPlugin.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class DupeCMD implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {
        if (commandSender instanceof Player player) {
            ItemStack heldItem = player.getInventory().getItemInMainHand();
            if (heldItem.getType() != Material.AIR) {
                int numItems = heldItem.getAmount();
                ItemStack newItem = new ItemStack(heldItem.getType(), numItems);
                player.getInventory().addItem(newItem);
            } else {
                //send message to say you need to hold air
            }
        }
        return true;
    }

}
