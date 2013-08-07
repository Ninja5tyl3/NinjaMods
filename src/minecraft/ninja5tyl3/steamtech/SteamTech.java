/**
 * @author Jacob
 *
 */
package ninja5tyl3.steamtech;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = SteamTech.modid, name = "SteamTech", version = "0.0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class SteamTech
{	
	public static final String modid = "Ninja_5tyl3 SteamTech";
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		
	}

}
