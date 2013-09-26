/**
 * @author Jacob
 *
 */
package ninja5tyl3.steamtech;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import ninja5tyl3.NinjaAPI.Core;
import ninja5tyl3.NinjaAPI.NinjaConfiguration;

@Mod(modid = SteamTech.modid, name = "SteamTech", version = "0.0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class SteamTech
{	
	public static final String modid = "Ninja_5tyl3 SteamTech";
	
	//Liquids
	public static Fluid FluidSteam;
	
	//Steam
	public static int SteamID;
	
	
	
	@EventHandler
	public void load(FMLPreInitializationEvent event)
	{
		NinjaConfiguration config = new NinjaConfiguration(event.getSuggestedConfigurationFile());
		
		config.load();
		
		int SteamID = config.getFluid("Steam", 999).getInt();

		config.save();
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		//Language Register for Liquids
		LanguageRegistry.addName(FluidSteam, "Steam");

		
		//Fluid Registry
		
	}

}
