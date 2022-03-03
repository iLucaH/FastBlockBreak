package com.ilucah.fastblockbreak.provider;

import org.bukkit.Location;
import org.bukkit.Material;

public interface NMSProvider {

    void setBlockFast(Location location, Material material, boolean applyPhysics);

}
