package com.ilucah.fastblockbreak;

import org.bukkit.plugin.java.JavaPlugin;

public final class FastBlockBreak extends JavaPlugin {

    private static BlockHandler blockHandler = new BlockHandler();

    /**
     * Method used to access the inbuilt block handler for easy access.
     * @return Returns the public block handler available.
     */
    public static BlockHandler getBlockHandler() {
        return blockHandler;
    }
}
