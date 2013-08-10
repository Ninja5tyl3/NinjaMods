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

import ninja5tyl3.core.Core;
import ninja5tyl3.core.NinjaConfiguration;

@Mod(modid = SteamTech.modid, name = "SteamTech", version = "0.0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class SteamTech
{	
	public static final String modid = "Ninja_5tyl3 SteamTech";
	
	//Liquids
	public static Fluid FluidSteam;
	
	//Blocks
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
	
	//Items
	public static Item ItemCopperIngot;
	public static Item ItemTinIngot;
	public static Item ItemAluminiumIngot;
	
	EventManager eventmanager = new EventManager();
	
	public static boolean AluminiumOreGeneration;
	public static boolean CobaltOreGeneration;
	public static boolean CopperOreGeneration;
	public static boolean FerrousOreGeneration;
	public static boolean IridiumOreGeneration;
	public static boolean LeadOreGeneration;
	public static boolean PigIronOreGeneration;
	public static boolean PlatinumOreGeneration;
	public static boolean SilverOreGeneration;
	public static boolean TinOreGeneration;
	public static boolean TitaniumOreGeneration;
	public static boolean TungstenOreGeneration;
	public static boolean UraniumOreGeneration;
	public static boolean ZincOreGeneration;
	
	public static int SteamID;
	
	public static int AluminiumOreID;
	public static int CobaltOreID;
	public static int CopperOreID;
	public static int FerrousOreID;
	public static int IridiumOreID;
	public static int LeadOreID;
	public static int PigIronOreID;
	public static int PlatinumOreID;
	public static int SilverOreID;
	public static int TinOreID;
	public static int TitaniumOreID;
	public static int TungstenOreID;
	public static int UraniumOreID;
	public static int ZincOreID;
	
	public static int AluminiumIngotID;
	public static int CobaltIngotID;
	public static int CopperIngotID;
	public static int FerrousIngotID;
	public static int IridiumIngotID;
	public static int LeadIngotID;
	public static int PigIronIngotID;
	public static int PlatinumIngotID;
	public static int SilverIngotID;
	public static int TinIngotID;
	public static int TitaniumIngotID;
	public static int TungstenIngotID;
	public static int UraniumIngotID;
	public static int ZincIngotID;
	
	@EventHandler
	public void load(FMLPreInitializationEvent event)
	{
		NinjaConfiguration config = new NinjaConfiguration(event.getSuggestedConfigurationFile());
		
		config.load();
		
		int SteamID = config.getFluid("Steam", 999).getInt();
		
		int AluminiumOreID = config.getBlock("Aluminium Ore", 1000).getInt();
		int CobaltOreID = config.getBlock("Cobalt Ore", 1001).getInt();
		int CopperOreID = config.getBlock("Copper Ore", 1002).getInt();
		
		int CopperIngotID = config.getItem("Copper Ingot", 9000).getInt();
		
		CopperOreGeneration = config.get(Configuration.CATEGORY_GENERAL, "Copper Ore Generation", false).getBoolean(false);
		
		config.save();
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		//Language Register for Liquids
		LanguageRegistry.addName(FluidSteam, "Steam");
		
		//Language Registry for Blocks
		LanguageRegistry.addName(BlockAluminiumOre, "Aluminium Ore");
		LanguageRegistry.addName(BlockCobaltOre, "Cobalt Ore");
		LanguageRegistry.addName(BlockCopperOre, "Copper Ore");
		LanguageRegistry.addName(BlockFerrousOre, "Ferrous Ore");
		LanguageRegistry.addName(BlockLeadOre, "Lead Ore");
		LanguageRegistry.addName(BlockIridiumOre, "IridiumOre");
		LanguageRegistry.addName(BlockPigIronOre, "Pig Iron Ore");
		LanguageRegistry.addName(BlockPlatinumOre, "Platinum Ore");
		LanguageRegistry.addName(BlockSilverOre, "Silver Ore");
		LanguageRegistry.addName(BlockTinOre, "Tin Ore");
		LanguageRegistry.addName(BlockTitaniumOre, "Titanium Ore");
		LanguageRegistry.addName(BlockTungstenOre, "Tungsten Ore");
		LanguageRegistry.addName(BlockUraniumOre, "Uranium Ore");
		LanguageRegistry.addName(BlockZincOre, "Zinc Ore");
		
		//Language Registry for Items
		LanguageRegistry.addName(ItemAluminiumIngot, "Aluminium Ingot");
		LanguageRegistry.addName(ItemCopperIngot, "Copper Ingot");
		LanguageRegistry.addName(ItemTinIngot, "Tin Ingot");
	}

}
