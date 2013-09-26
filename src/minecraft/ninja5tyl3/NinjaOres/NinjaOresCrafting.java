package ninja5tyl3.NinjaOres;

import cpw.mods.fml.common.registry.GameRegistry;

import ninja5tyl3.NinjaOres.NinjaOres;

public class NinjaOresCrafting
{
	public static void addRecipes()
	{		

		
		//shapeless recipes
		
		//shaped recipes
		
		//furnace recipes
		GameRegistry.addSmelting(NinjaOres.BlockAluminiumOre.blockID, NinjaOres.aluminiumIngot, 0.1f);
		GameRegistry.addSmelting(NinjaOres.BlockCobaltOre.blockID, NinjaOres.cobaltIngot, 0.1f);
		GameRegistry.addSmelting(NinjaOres.BlockCopperOre.blockID, NinjaOres.copperIngot, 0.1f);
		GameRegistry.addSmelting(NinjaOres.BlockFerrousOre.blockID, NinjaOres.ferrousIngot, 0.1f);
		GameRegistry.addSmelting(NinjaOres.BlockLeadOre.blockID, NinjaOres.leadIngot, 0.1f);
		GameRegistry.addSmelting(NinjaOres.BlockPigIronOre.blockID, NinjaOres.pigIronIngot, 0.1f);
		GameRegistry.addSmelting(NinjaOres.BlockPlatinumOre.blockID, NinjaOres.platinumIngot, 0.1f);
		GameRegistry.addSmelting(NinjaOres.BlockSilverOre.blockID, NinjaOres.silverIngot, 0.1f);
		GameRegistry.addSmelting(NinjaOres.BlockTinOre.blockID, NinjaOres.tinIngot, 0.1f);
		GameRegistry.addSmelting(NinjaOres.BlockTitaniumOre.blockID, NinjaOres.titaniumIngot, 0.1f);
		GameRegistry.addSmelting(NinjaOres.BlockTungstenOre.blockID, NinjaOres.tungstenIngot, 0.1f);
		GameRegistry.addSmelting(NinjaOres.BlockZincOre.blockID, NinjaOres.zincIngot, 0.1f);
	}
}

