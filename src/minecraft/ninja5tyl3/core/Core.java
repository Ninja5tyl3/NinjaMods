package ninja5tyl3.core;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.network.NetworkMod;
import ninja5tyl3.core.NinjaConfiguration;

@Mod(modid = Core.modid, name = "Ninja Core", version = "0.0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Core
{
	public static final String modid = "Ninja Core";
}
