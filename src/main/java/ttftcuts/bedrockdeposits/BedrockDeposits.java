package ttftcuts.bedrockdeposits;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ttftcuts.bedrockdeposits.proxy.CommonProxy;

@Mod(modid = BedrockDeposits.MODID, version = BedrockDeposits.VERSION)
public class BedrockDeposits
{
    public static final String MODID = "bedrockdeposits";
    public static final String VERSION = "1.0.0";

    public static final Logger logger = LogManager.getLogger(MODID);

    @Mod.Instance(MODID)
    public static BedrockDeposits instance;

    @SidedProxy(clientSide = "ttftcuts.bedrockdeposits.proxy.ClientProxy", serverSide = "ttftcuts.bedrockdeposits.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
