package com.ilucah.fastblockbreak;

import org.bukkit.plugin.java.JavaPlugin;

public final class FastBlockBreak extends JavaPlugin {

    private static BlockHandler blockHandler;

    @Override
    public void onEnable() {
        blockHandler = new BlockHandler();
    }

    public static BlockHandler getBlockHandler() {
        return blockHandler;
    }
}
