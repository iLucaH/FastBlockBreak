package com.ilucah.fastblockbreak;

import com.ilucah.fastblockbreak.provider.DefaultProvider;
import com.ilucah.fastblockbreak.provider.NMSProvider;
import org.bukkit.Location;
import org.bukkit.Material;

import static org.bukkit.Bukkit.getServer;

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

    public NMSProvider getHandle() {
        return provider;
    }

    public void setBlockFast(Location location, Material material, boolean applyPhysics) {
        provider.setBlockFast(location, material, applyPhysics);
    }
}
