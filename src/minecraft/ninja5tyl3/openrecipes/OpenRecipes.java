/**
 * @author - Ninja_5tyl3
 */
/**
 * License
 * This work is licensed under the Creative Commons Attribution-NonCommercial 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc/3.0/.
 */
package ninja5tyl3.openrecipes;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import ninja5tyl3.NinjaAPI.Core;
import ninja5tyl3.NinjaAPI.NinjaConfiguration;

@Mod(modid="OpenRecipes Mod", name="OpenRecipes Mod", version="1.1.0")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class OpenRecipes
{
	@Instance("OpenRecipes Mod")
	public static OpenRecipes instanceOpenRecipes;
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		/**
		 *  Where the Magic happens
		 */
		//ItemStacks
		ItemStack fleshStack = new ItemStack(Item.rottenFlesh);
		ItemStack ironIngotStack = new ItemStack(Item.ingotIron);
		ItemStack flintStack = new ItemStack(Item.flint);
		ItemStack blazePowderStack = new ItemStack(Item.blazePowder);
		
		//Shapeless Recipes
		GameRegistry.addShapelessRecipe(new ItemStack (Item.leather), fleshStack, fleshStack, fleshStack);
		GameRegistry.addShapelessRecipe(new ItemStack (Item.dyePowder, 1, 2), new ItemStack(Item.dyePowder, 1, 4), new ItemStack(Item.dyePowder, 2, 11));
		GameRegistry.addShapelessRecipe(new ItemStack(Item.blazeRod), blazePowderStack, blazePowderStack);
		
		//Shaped Recipes
		GameRegistry.addRecipe(new ItemStack(Block.stoneBrick, 4, 3), "xx", "xx", 'x', new ItemStack(Block.stoneBrick, 1));
		GameRegistry.addRecipe(new ItemStack(Item.bow, 1), "xxy", "xy ", "y  ", 'x', new ItemStack(Item.stick, 1), 'y', new ItemStack(Item.silk, 1));
		GameRegistry.addRecipe(new ItemStack(Item.bow, 1), "yxx", " yx", "  y", 'x', new ItemStack(Item.stick, 1), 'y', new ItemStack(Item.silk, 1));
		GameRegistry.addRecipe(new ItemStack(Item.bow, 1), "yx ", "y x", "yx ", 'y', new ItemStack(Item.stick, 1), 'x', new ItemStack(Item.silk,1));
		GameRegistry.addRecipe(new ItemStack(Block.ice,8), "xxx", "xyx", "xxx", 'x', new ItemStack(Block.blockSnow, 1), 'y', new ItemStack(Item.bucketWater, 1));
		GameRegistry.addRecipe(new ItemStack(Item.flintAndSteel), "x ", " y", 'x', flintStack, 'y', ironIngotStack);
		
		//Smelting Recipes
		GameRegistry.addSmelting(Item.poisonousPotato.itemID, new ItemStack(Item.potato), 0.1f);
		
	}


}
