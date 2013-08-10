package ninja5tyl3.steamtech;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;
import ninja5tyl3.steamtech.SteamTech;

public class SteamTechCrafting
{
	//"Block" Stacks
	ItemStack copperOre = new ItemStack(SteamTech.BlockCopperOre);
	ItemStack aluminiumOre = new ItemStack(SteamTech.BlockAluminiumOre);
	ItemStack cobaltOre = new ItemStack(SteamTech.BlockCobaltOre);
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
	
	//Item Stacks
	static ItemStack copperIngot = new ItemStack(SteamTech.ItemCopperIngot);
	static ItemStack tinIngot = new ItemStack(SteamTech.ItemTinIngot);
	static ItemStack aluminiumIngot = new ItemStack(SteamTech.ItemAluminiumIngot);
	
	public static void addRecipes()
	{		
		//OreDictionary Registration
		OreDictionary.registerOre("ingotCopper", copperIngot);
		OreDictionary.registerOre("ingotTin", tinIngot);
		OreDictionary.registerOre("ingotAluminium", aluminiumIngot);
		
		//shapeless recipes
		
		//shaped recipes
		
		//furnace recipes
		GameRegistry.addSmelting(SteamTech.BlockCopperOre.blockID, copperIngot, 0.1f);
		GameRegistry.addSmelting(SteamTech.BlockAluminiumOre.blockID, aluminiumIngot, 0.1f);
		GameRegistry.addSmelting(SteamTech.BlockTinOre.blockID, tinIngot, 0.1f);
	}
}
