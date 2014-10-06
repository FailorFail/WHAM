package com.failorfail.jawa.init;

import com.failorfail.jawa.block.BlockJAWA;
import com.failorfail.jawa.block.BlockRuneOre;
import com.failorfail.jawa.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockJAWA runeOre = new BlockRuneOre();

    public static void init()
    {
        GameRegistry.registerBlock(runeOre, "runeOre");
    }
}
