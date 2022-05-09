package langvest.mobsupdateanimals;

import langvest.mobsupdateanimals.core.Config;
import langvest.mobsupdateanimals.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Config.MOD_ID, name = Config.MOD_NAME, version = Config.MOD_VERSION, acceptedMinecraftVersions = Config.MC_VERSION)
public class MobsUpdateAnimals {
    @SidedProxy(clientSide = Config.MOD_PROXY_CLIENT, serverSide = Config.MOD_PROXY_COMMON)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}