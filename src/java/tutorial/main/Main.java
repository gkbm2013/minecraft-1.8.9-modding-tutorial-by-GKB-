package tutorial.main;

import tutorial.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.modid, name = Main.name, version = Main.version)
public class Main {
	public static final String modid = "tutorial";
	public static final String name = "Tutorial";
	public static final String version = "beta 1.0.0";

	@SidedProxy(clientSide = "tutorial.proxy.ClientProxy", serverSide = "tutorial.proxy.ServerProxy")
	public static CommonProxy proxy;
	
	@Instance
    public static Main instance = new Main();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}
}
