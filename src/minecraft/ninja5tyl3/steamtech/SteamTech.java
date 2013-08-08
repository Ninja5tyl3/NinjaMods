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
	
	public static Block BlockAluminiumOre;
	public static Block BlockCobaltOre;
	public static Block BlockCopperOre;
	public static Block BlockFerrousOre;
	public static Block BlockIridiumOre;
	public static Block BlockLeadOre;
	public static Block BlockPigIronOre;
	public static Block BlockPlatinumOre;
	public static Block BlockSilverOre;
	public static Block BlockTinOre;
	public static Block BlockTitaniumOre;
	public static Block BlockTungstenOre;
	public static Block BlockUraniumOre;
	public static Block BlockZincOre;
	
	public static Item ItemCopperIngot;
	
	EventManager eventmanager = new EventManager();
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		
	}

}
