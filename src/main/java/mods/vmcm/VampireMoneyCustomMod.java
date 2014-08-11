package mods.vmcm;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import mods.vmcm.lib.Reference;
import mods.vmcm.proxy.IProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class VampireMoneyCustomMod
{
    @Mod.Instance(Reference.MOD_ID)
    public static VampireMoneyCustomMod instance;

    @SidedProxy(clientSide = "mods.vmcm.proxy.ClientProxy", serverSide = "mods.vmcm.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInitialize(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void initialize(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInitialize(FMLPostInitializationEvent event)
    {

    }
}