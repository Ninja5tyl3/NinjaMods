package ninja5tyl3.steamtech.machines;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 * Too many errors!
 * Need to work on the EVERYTHING!
 */
public class BlockForge extends BlockContainer
{
	
	public BlockForge(int id, Material material)
	{
		super(id, material);
		//todo: create and register a texture
		setUnlocalizedName("SteamTech:Forge");
	}
	//called when block is broken and destroys the primary block
	@Override
	public void breakBlock(World world, int i, int j, int k, int par5, int par6)
	{
		TileEntityForge tileEntity = (TileEntityForge)world.getBlockTileEntity(i, j, k);
		if (tileEntity !=null)
		{
			world.destryBlock(tileEntity.primary_x, tileEntity.primary_y, tileEntity.primary_z, false);
			world.removeBlockTileEntity(tileEntity.primary_x, tileEntity.primary_y, tileEntity.primary_z);
		}
		
		world.removeBlockTileEntity(i, j, k);
	}
	//primary block check
	@Override
	public void onNeigborBlockChange(World world, int i, int j, int k, int par5)
	{
		TileEntityForge tileEntity = (TileEntityForge)world.getBlockTileEntity(i, j, k);
		if (tileEntity !=null)
		{
			if(world.getBlockId(tileEntity.primary_x, tileEntity.primary_y, tileEntity.primary_z) < 1)
			{
				world.destryBlock(i,j,k, false);
				world.removeBlockTileEntity(i, j, k);
			}
		}
	}
	//Motha-Fuckin Invisibility!
	@Override
	public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int 1)
	{
		return false;
	}
	//rendering of surrounding blocks
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}
	
	@Override
	public TileEntity createNewTileEntity(World world)
	{
		return new TileEntityFoge();
	}

}
