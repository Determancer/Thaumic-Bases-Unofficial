package com.rumaruka.thaumicbases.common.item;

import com.google.common.collect.ImmutableSet;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import java.util.Set;

public class ItemThauminiteSword extends ItemSword {
    public ItemThauminiteSword(ToolMaterial toolMaterial) {
        super(toolMaterial);
    }
    @Override
    public Set<String> getToolClasses(ItemStack stack) {

        return ImmutableSet.of("sword");
    }
}
