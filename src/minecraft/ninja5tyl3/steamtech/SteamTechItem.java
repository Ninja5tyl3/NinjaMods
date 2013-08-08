package ninja5tyl3.steamtech;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SteamTechItem extends Item
{
	public SteamTechItem(int id)
	{
		super(id);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(SteamTech.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}
}
