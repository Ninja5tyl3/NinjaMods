package ninja5tyl3.steamtech.machines;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import ninja5tyl3.steamtech.machines.TileEntityForge;
import ninja5tyl3.steamtech.SteamTechBlock;

/**
 * Too many errors! Fixed the errors!  Moutha-Fucking TYPOS!
 * Need to work on the EVERYTHING!
 */
public class BlockForge extends BlockContainer
{
	private final Random forgeRand = new Random();
	
	//private final boolean isActive;
	
	public BlockForge(int id, Material material)
	{
		super(id, material);
		//TODO: create and register a texture
		setUnlocalizedName("SteamTech:Forge");
	}
	//called when block is broken and destroys the primary block
	@Override
	public void breakBlock(World world, int i, int j, int k, int par5, int par6)
	{
		TileEntityForge tileEntity = (TileEntityForge)world.getBlockTileEntity(i, j, k);
		if (tileEntity !=null)
		{
			world.destroyBlock(tileEntity.primary_x, tileEntity.primary_y, tileEntity.primary_z, false);
			world.removeBlockTileEntity(tileEntity.primary_x, tileEntity.primary_y, tileEntity.primary_z);
		}
		
		world.removeBlockTileEntity(i, j, k);
	}
	//primary block check
	@Override
	public void onNeighborBlockChange(World world, int i, int j, int k, int par5)
	{
		TileEntityForge tileEntity = (TileEntityForge)world.getBlockTileEntity(i, j, k);
		if (tileEntity !=null)
		{
			if(world.getBlockId(tileEntity.primary_x, tileEntity.primary_y, tileEntity.primary_z) < 1)
			{
				world.destroyBlock(i,j,k, false);
				world.removeBlockTileEntity(i, j, k);
			}
		}
	}
	//Motha-Fuckin Invisibility!
	@Override
	public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int l)
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
		return new TileEntityForge();
	}

}
