package ninja5tyl3.steamtech.world;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.FluidRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ninja5tyl3.steamtech.SteamTech;

public class FluidSteam extends Item
{
	public FluidSteam()
	{
		super(SteamTech.SteamID);
		setUnlocalizedName("steam");
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister)
	{
		this.itemIcon = iconRegister.registerIcon("SteamTech:Steam");
		
		
	}
}
