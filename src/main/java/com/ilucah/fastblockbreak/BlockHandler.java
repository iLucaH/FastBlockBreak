package com.ilucah.fastblockbreak;

import com.ilucah.fastblockbreak.provider.DefaultProvider;
import com.ilucah.fastblockbreak.provider.NMSProvider;
import org.bukkit.Location;
import org.bukkit.Material;

import static org.bukkit.Bukkit.getServer;

/**
 * A class to wrap the server version to the appropriate NMS provider.
 *
 * @author Lucas Hautrive
 * @version 1.0.5
 * @since 1.0.0
 * @apiNote Create an instance of this class.
 */
public class BlockHandler {

    private NMSProvider provider;

    public BlockHandler() {
        String a = getServer().getClass().getPackage().getName();
        String version = a.substring(a.lastIndexOf('.') + 1);
        try {
            provider = (NMSProvider) Class.forName("com.ilucah.fastblockbreak.provider.Provider_" + version).newInstance();
        } catch (Exception e) {
            System.out.println("[FastBlockBreak] [WARN] Failed to service an NMS Provider class. Falling back to a default provider");
            provider = new DefaultProvider();
        }
    }

    /**
     * @return Returns the serviced NMS Provider.
     */
    public NMSProvider getHandle() {
        return provider;
    }

    /**
     * Method to set a block faster than bukkit allows.
     *
     * @param location The location of the block you want set.
     * @param material The material of the new block you want to set.
     * @param applyPhysics If you want to the block to update after set.
     */
    public void setBlockFast(Location location, Material material, boolean applyPhysics) {
        provider.setBlockFast(location, material, applyPhysics);
    }
}
