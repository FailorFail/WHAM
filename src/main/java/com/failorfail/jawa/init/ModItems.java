package com.failorfail.jawa.init;

import com.failorfail.jawa.item.ItemJAWA;
import com.failorfail.jawa.item.ItemRuneShard;
import com.failorfail.jawa.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemJAWA runeShard = new ItemRuneShard();

    public static void init()
    {
        GameRegistry.registerItem(runeShard, "runeShard");
    }
}
