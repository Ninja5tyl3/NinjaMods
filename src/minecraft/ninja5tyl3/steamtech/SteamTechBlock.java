package ninja5tyl3.steamtech;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class SteamTechBlock extends Block{
	
	public SteamTechBlock(int id, Material par2Material) {
		
		super(id,par2Material);
		this.setCreativeTab(CreativeTabs.tabBlock);
		
	}
	
	public void registerIcons(IconRegister par1IconRegister) {
		
		this.blockIcon = par1IconRegister.registerIcon(SteamTech.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}

}
