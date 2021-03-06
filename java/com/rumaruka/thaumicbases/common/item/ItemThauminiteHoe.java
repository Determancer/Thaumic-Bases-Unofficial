package com.rumaruka.thaumicbases.common.item;

import com.google.common.collect.ImmutableSet;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

import java.util.Set;

public class ItemThauminiteHoe extends ItemHoe {
    public ItemThauminiteHoe(ToolMaterial enumtoolmaterial) {
        super(enumtoolmaterial);
    }

    @Override
    public Set<String> getToolClasses(ItemStack stack) {
        return ImmutableSet.of("hoe");
    }
}
