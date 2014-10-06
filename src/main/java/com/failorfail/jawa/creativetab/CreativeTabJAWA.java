package com.failorfail.jawa.creativetab;

import com.failorfail.jawa.init.ModItems;
import com.failorfail.jawa.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabJAWA
{
    public static final CreativeTabs JAWA_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.runeShard;
        }
    };
}
