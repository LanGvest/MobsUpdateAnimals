package langvest.mobsupdateanimals;

import langvest.mobsupdateanimals.core.Config;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Config.MOD_ID, name = Config.MOD_NAME, version = Config.MOD_VERSION, acceptedMinecraftVersions = Config.MC_VERSION)
public class MobsUpdateAnimals {
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {}

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {}

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {}
}