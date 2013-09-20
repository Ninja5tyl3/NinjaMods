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
	public static Block BlockGraphiteOre;
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
	public static Item ItemAluminiumIngot;
	public static Item ItemCobaltIngot;
	public static Item ItemCopperIngot;
	public static Item ItemFerrousIngot;
	public static Item ItemGraphite;
	public static Item ItemIridium;
	public static Item ItemLeadIngot;
	public static Item ItemPigIronIngot;
	public static Item ItemPlatinumIngot;
	public static Item ItemSilverIngot;
	public static Item ItemTinIngot;
	public static Item ItemTitaniumIngot;
	public static Item ItemTungstenIngot;
	public static Item ItemUranium;
	public static Item ItemZincIngot;
	
	//"Block" Stacks
	ItemStack aluminiumOre = new ItemStack(SteamTech.BlockAluminiumOre);
	ItemStack cobaltOre = new ItemStack(SteamTech.BlockCobaltOre);
	ItemStack copperOre = new ItemStack(SteamTech.BlockCopperOre);
	ItemStack ferrousOre = new ItemStack(SteamTech.BlockFerrousOre);
	ItemStack iridiumOre = new ItemStack(SteamTech.BlockIridiumOre);
	ItemStack leadOre = new ItemStack(SteamTech.BlockLeadOre);
	ItemStack pigIronOre = new ItemStack(SteamTech.BlockPigIronOre);
	ItemStack platinumOre = new ItemStack(SteamTech.BlockPlatinumOre);
	ItemStack silverOre = new ItemStack(SteamTech.BlockSilverOre);
	ItemStack tinOre = new ItemStack(SteamTech.BlockTinOre);
	ItemStack titaniumOre= new ItemStack(SteamTech.BlockTitaniumOre);
	ItemStack tungstenOre = new ItemStack(SteamTech.BlockTungstenOre);
	ItemStack uraniumOre = new ItemStack(SteamTech.BlockUraniumOre);
	ItemStack zincOre = new ItemStack(SteamTech.BlockZincOre);
	
	//ItemStacks
	static ItemStack aluminiumIngot = new ItemStack(ItemAluminiumIngot);
	static ItemStack cobaltIngot = new ItemStack(ItemCobaltIngot);
	static ItemStack copperIngot = new ItemStack(ItemCopperIngot);
	static ItemStack ferrousIngot = new ItemStack(ItemFerrousIngot);
	static ItemStack graphiteStack = new ItemStack(ItemGraphite);
	static ItemStack iridiumStack = new ItemStack(ItemIridium);
	static ItemStack leadIngot = new ItemStack(ItemLeadIngot);
	static ItemStack pigIronIngot = new ItemStack(ItemPigIronIngot);
	static ItemStack platinumIngot = new ItemStack(ItemPlatinumIngot);
	static ItemStack silverIngot = new ItemStack(ItemSilverIngot);
	static ItemStack tinIngot = new ItemStack(ItemTinIngot);
	static ItemStack titaniumIngot = new ItemStack(ItemTitaniumIngot);
	static ItemStack tungstenIngot = new ItemStack(ItemTungstenIngot);
	static ItemStack uraniumStack = new ItemStack(ItemUranium);
	static ItemStack zincIngot = new ItemStack(ItemZincIngot);
	
	EventManager eventmanager = new EventManager();
	
	//World Gen Config Booleans
	public static boolean AluminiumOreGeneration;
	public static boolean CobaltOreGeneration;
	public static boolean CopperOreGeneration;
	public static boolean FerrousOreGeneration;
	public static boolean GraphiteOreGeneration;
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
	
	//Steam
	public static int SteamID;
	
	//Ore ID Configs
	public static int AluminiumOreID;
	public static int CobaltOreID;
	public static int CopperOreID;
	public static int FerrousOreID;
	public static int GraphiteOreID;
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
	
	//Item ID Configs
	public static int AluminiumIngotID;
	public static int CobaltIngotID;
	public static int CopperIngotID;
	public static int FerrousIngotID;
	public static int GraphiteID;
	public static int IridiumID;
	public static int LeadIngotID;
	public static int PigIronIngotID;
	public static int PlatinumIngotID;
	public static int SilverIngotID;
	public static int TinIngotID;
	public static int TitaniumIngotID;
	public static int TungstenIngotID;
	public static int UraniumID;
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
		int FerrousOreID = config.getBlock("Ferrous Ore", 1003).getInt();
		int GraphiteOreID = config.getBlock("Graphite Ore", 1004).getInt();
		int IridiumOreID = config.getBlock("Iridium Ore", 1005).getInt();
		int LeadOreID = config.getBlock("Lead Ore", 1006).getInt();
		int PigIronOreID = config.getBlock("Pig Iron Ore", 1007).getInt();
		int PlatinumOreID = config.getBlock("Platinum Ore", 1008).getInt();
		int SilverOreID = config.getBlock("Silver Ore", 1009).getInt();
		int TinOreID = config.getBlock("Tin Ore", 1010).getInt();
		int TitaniumOreID = config.getBlock("Titanium Ore", 1011).getInt();
		int TungstenOreID = config.getBlock("Tungsten Ore", 1012).getInt();
		int UraniumOreID = config.getBlock("Uranium Ore", 1013).getInt();
		int ZincOreID = config.getBlock("Zinc Ore", 1014).getInt();
		
		int AluminiumIngotID = config.getItem("Aluminium Ingot", 9000).getInt();
		int CobaltIngotID = config.getItem("Cobalt Ingot", 9001).getInt();
		int CopperIngotID = config.getItem("Copper Ingot", 9002).getInt();
		int FerrousIngotID = config.getItem("Ferrous Ingot", 9003).getInt();
		int GraphiteID = config.getItem("Graphite", 9004).getInt();
		int IridiumID = config.getItem("Iridium", 9005).getInt();
		int LeadIngotID = config.getItem("Lead Ingot", 9006).getInt();
		int PigIronIngotID = config.getItem("Pig Iron Ingot", 9007).getInt();
		int PlatinumIngotID = config.getItem("Platinum Ingot", 9008).getInt();
		int SilverIngotID = config.getItem("Silver Ingot", 9009).getInt();
		int TinIngotID = config.getItem("Tin Ingot", 9010).getInt();
		int TitaniumIngotID = config.getItem("Titanium Ingot", 9011).getInt();
		int TungstenIngotID = config.getItem("Tungsten Ingot", 9012).getInt();
		int UraniumID = config.getItem("Uranium", 9013).getInt();
		int ZincIngotID = config.getItem("Zinc Ingot", 9014).getInt();
		
		AluminiumOreGeneration = config.get(NinjaConfiguration.CATEGORY_WORLDGENERATION, "Aluminium Ore Generation", false).getBoolean(false);
		CobaltOreGeneration = config.get(NinjaConfiguration.CATEGORY_WORLDGENERATION, "Cobalt Ore Generation", false).getBoolean(false);
		CopperOreGeneration = config.get(NinjaConfiguration.CATEGORY_WORLDGENERATION, "Copper Ore Generation", false).getBoolean(false);
		//TODO: Finish World Gen Configs
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
		LanguageRegistry.addName(BlockGraphiteOre, "Graphite Ore");
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
		LanguageRegistry.addName(ItemCobaltIngot, "Cobalt Ingot");
		LanguageRegistry.addName(ItemCopperIngot, "Copper Ingot");
		LanguageRegistry.addName(ItemFerrousIngot, "Ferrous Ingot");
		LanguageRegistry.addName(ItemGraphite, "Graphite");
		LanguageRegistry.addName(ItemIridium, "Iridium");
		LanguageRegistry.addName(ItemLeadIngot, "Lead Ingot");
		LanguageRegistry.addName(ItemPigIronIngot, "Pig Iron Ingot");
		LanguageRegistry.addName(ItemPlatinumIngot, "PlatinumIngot");
		LanguageRegistry.addName(ItemSilverIngot, "Silver Ingot");
		LanguageRegistry.addName(ItemTinIngot, "Tin Ingot");
		LanguageRegistry.addName(ItemTitaniumIngot, "TitaniumIngot");
		LanguageRegistry.addName(ItemTungstenIngot, "Tungsten Ingot");
		LanguageRegistry.addName(ItemUranium, "Uranium");
		LanguageRegistry.addName(ItemZincIngot, "Zinc Ingot");
		
		//Ore Dictionary Registration for Blocks
		OreDictionary.registerOre("oreAluminum", BlockAluminiumOre);
		OreDictionary.registerOre("oreCobalt", BlockCobaltOre);
		OreDictionary.registerOre("oreCopper", BlockCopperOre);
		OreDictionary.registerOre("oreFerrous", BlockFerrousOre);
		OreDictionary.registerOre("oreGraphite", BlockGraphiteOre);
		OreDictionary.registerOre("oreIridium", BlockIridiumOre);
		OreDictionary.registerOre("oreLead", BlockLeadOre);
		OreDictionary.registerOre("orePigIron", BlockPigIronOre);
		OreDictionary.registerOre("orePlatinum", BlockPlatinumOre);
		OreDictionary.registerOre("oreSilver", BlockSilverOre);
		OreDictionary.registerOre("oreTin", BlockTinOre);
		OreDictionary.registerOre("oreTitanium", BlockTitaniumOre);
		OreDictionary.registerOre("oreTungsten", BlockTungstenOre);
		OreDictionary.registerOre("oreUranium", BlockUraniumOre);
		OreDictionary.registerOre("oreZinc", BlockZincOre);
		
		//Ore Dictionary Registration for Items
		OreDictionary.registerOre("ingotAluminum", aluminiumIngot);
		OreDictionary.registerOre("ingotCobalt", cobaltIngot);
		OreDictionary.registerOre("ingotCopper", copperIngot);
		OreDictionary.registerOre("ingotFerrous", ferrousIngot);
		OreDictionary.registerOre("materialGraphite", graphiteStack);
		OreDictionary.registerOre("materialIridium", iridiumStack);
		OreDictionary.registerOre("ingotLead", leadIngot);
		OreDictionary.registerOre("ingotPigIron", pigIronIngot);
		OreDictionary.registerOre("ingotPlatinum", platinumIngot);
		OreDictionary.registerOre("ingotSilver", silverIngot);
		OreDictionary.registerOre("ingotTin", tinIngot);
		OreDictionary.registerOre("ingotTitanium", titaniumIngot);
		OreDictionary.registerOre("ingotTungsten", tungstenIngot);
		OreDictionary.registerOre("materialUranium", uraniumStack);
		OreDictionary.registerOre("ingotZinc", zincIngot);
		
		//Fluid Registry
		
	}

}
