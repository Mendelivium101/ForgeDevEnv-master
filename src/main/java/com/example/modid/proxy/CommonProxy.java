package com.example.modid.proxy;

import com.example.modid.mod_blocks.ModBlocks;
import com.example.modid.mod_items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {}
    public void init(FMLInitializationEvent e) {}
    public void postInit(FMLPostInitializationEvent e) {}

@SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
    ModBlocks.MOD_ITEM_BLOCKS.forEach(event.getRegistry()::register);
    ModItems.ALL_ITEMS.forEach(event.getRegistry()::register); //All items
    ModItems.MOD_ITEMS.forEach(event.getRegistry()::register);
}

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        ModBlocks.MOD_BLOCKS.forEach(event.getRegistry()::register);
        ModItems.ALL_BLOCKS.forEach(event.getRegistry()::register); //modItems because it contains mod blocks
    }

}
