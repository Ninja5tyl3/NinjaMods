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
	public static void addRecipes()
	{		

		
		//shapeless recipes
		
		//shaped recipes
		
		//furnace recipes
		GameRegistry.addSmelting(SteamTech.BlockAluminiumOre.blockID, SteamTech.aluminiumIngot, 0.1f);
		GameRegistry.addSmelting(SteamTech.BlockCobaltOre.blockID, SteamTech.cobaltIngot, 0.1f);
		GameRegistry.addSmelting(SteamTech.BlockCopperOre.blockID, SteamTech.copperIngot, 0.1f);
		GameRegistry.addSmelting(SteamTech.BlockFerrousOre.blockID, SteamTech.ferrousIngot, 0.1f);
		GameRegistry.addSmelting(SteamTech.BlockLeadOre.blockID, SteamTech.leadIngot, 0.1f);
		GameRegistry.addSmelting(SteamTech.BlockPigIronOre.blockID, SteamTech.pigIronIngot, 0.1f);
		GameRegistry.addSmelting(SteamTech.BlockPlatinumOre.blockID, SteamTech.platinumIngot, 0.1f);
		GameRegistry.addSmelting(SteamTech.BlockSilverOre.blockID, SteamTech.silverIngot, 0.1f);
		GameRegistry.addSmelting(SteamTech.BlockTinOre.blockID, SteamTech.tinIngot, 0.1f);
		GameRegistry.addSmelting(SteamTech.BlockTitaniumOre.blockID, SteamTech.titaniumIngot, 0.1f);
		GameRegistry.addSmelting(SteamTech.BlockTungstenOre.blockID, SteamTech.tungstenIngot, 0.1f);
		GameRegistry.addSmelting(SteamTech.BlockZincOre.blockID, SteamTech.zincIngot, 0.1f);
	}
}
