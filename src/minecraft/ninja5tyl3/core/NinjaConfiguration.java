package ninja5tyl3.core;

import java.io.File;

import cpw.mods.fml.common.FMLLog;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;

public class NinjaConfiguration extends Configuration
{
	public static final String CATEGORY_FLUID = "fluid";
	public static final String CATEGORY_RECIPE = "recipe";
	private static boolean[] configMarkers = new boolean[Item.itemsList.length];
	private static final int ITEM_SHIFT = 256;
    private static final int MAX_BLOCKS = 4096;
    private String fileName = null;
	
    public NinjaConfiguration(File suggestedConfigurationFile)
    {
		// TODO Auto-generated constructor stub
	}
    
    public Property getRecipe(String key, boolean defaultValue) {return getRecipe(CATEGORY_RECIPE, defaultValue, null); }
    public Property getRecipe(String key, boolean defaultValue, String comment) {return getRecipe(CATEGORY_RECIPE, defaultValue, comment); }
    
	public Property getFluid(String key, int defaultID) { return getItem(CATEGORY_FLUID, key, defaultID, null); }
    public Property getFluid(String key, int defaultID, String comment) { return getItem(CATEGORY_FLUID, key, defaultID, comment); }
    public Property getFluid(String category, String key, int defaultID) { return getItem(category, key, defaultID, null); }
    public Property getFluid(String category, String key, int defaultID, String comment)
    {
        Property prop = get(category, key, -1, comment);
        int defaultShift = defaultID + ITEM_SHIFT;

        if (prop.getInt() != -1)
        {
            configMarkers[prop.getInt() + ITEM_SHIFT] = true;
            return prop;
        }
        else
        {
            if (defaultID < MAX_BLOCKS - ITEM_SHIFT)
            {
                FMLLog.warning(
                    "Mod attempted to get a item ID with a default value in the block ID section, " +
                    "mod authors should make sure there defaults are above %d unless explicitly needed " +
                    "so that all block ids are free to store blocks.", MAX_BLOCKS - ITEM_SHIFT);
                FMLLog.warning("Config \"%s\" Category: \"%s\" Key: \"%s\" Default: %d", fileName, category, key, defaultID);
            }

            if (Item.itemsList[defaultShift] == null && !configMarkers[defaultShift] && defaultShift >= Block.blocksList.length)
            {
                prop.set(defaultID);
                configMarkers[defaultShift] = true;
                return prop;
            }
            else
            {
                for (int x = Item.itemsList.length - 1; x >= ITEM_SHIFT; x--)
                {
                    if (Item.itemsList[x] == null && !configMarkers[x])
                    {
                        prop.set(x - ITEM_SHIFT);
                        configMarkers[x] = true;
                        return prop;
                    }
                }

                throw new RuntimeException("No more item ids available for " + key);
            }
        }
    }

}
