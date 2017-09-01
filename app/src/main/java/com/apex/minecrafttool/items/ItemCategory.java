package com.apex.minecrafttool.items;

/**
 * Created by Adam on 9/1/2017.
 * Defines different types of Minecraft items.
 */

public enum ItemCategory {
    BLOCK("Block"), FLORA("Flora"), FLUID("Fluid"), REDSTONE("Redstone"), MOB("Mob"),
    CRAFTABLE("Craftable"), TOOL("Tool"), NETHER("Nether"), END("End"), MISC("Misc");

    private String lowercase;

    ItemCategory(String lowercase) {
        this.lowercase = lowercase;
    }

    @Override
    public String toString() {
        return lowercase;
    }
}
