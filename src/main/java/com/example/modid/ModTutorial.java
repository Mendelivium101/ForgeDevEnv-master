package com.example.modid;

import com.example.modid.proxy.CommonProxy;
import com.example.modtut.Tags;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;

import static com.example.modid.special_recipes.furnaceRecipes.furnaceRecipes;

@Mod(modid = Tags.MOD_ID, name = Tags.MOD_NAME, version = Tags.VERSION)
public class ModTutorial {
    public static final String MODID = "modtut";
    public static final String MODNAME = "Mod tutorials";
    public static final String MODVERSION = "0.0.1";


    public static final Logger LOGGER = LogManager.getLogger(Tags.MOD_NAME);

    @SidedProxy(clientSide = "com.example.modid.proxy.ClientProxy", serverSide = "com.example.modid.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static ModTutorial instance;
    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
        furnaceRecipes();

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }

}

// PascalCase = for classes
// camelCase = methods, non-final fields, variables
// snake_case = directories, resources
// SCREAMING_SNAKE_CASE = constants: (final fields)

