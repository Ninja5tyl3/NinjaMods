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

import ninja5tyl3.steamtech.machines.TileEntityFurnace;
import ninja5tyl3.steamtech.SteamTechBlock;

/**
 * Too many errors! Fixed the errors!  Moutha-Fucking TYPOS!
 * Need to work on the EVERYTHING!
 */
public class BlockFurnace extends BlockContainer
{
	//Radomly throws inventory contents everywhere
	private final Random furnaceRand = new Random();
	
	//True if acitve forge, false if idle
	private final boolean isActive;
	
	//used to prevent the inventory to be dropped upon block removal, used internally when the forge changes between active and idle
	private static boolean keepFurnaceInventory = false;
	
	private Icon topIcon;
	private Icon frontIcon;
	
	public BlockFurnace(int par1, int i, Material iron, boolean par2)
	{
		super(par1, Material.iron);
		this.isActive = par2;
	}
	//called when block is broken and destroys the primary block
	@Override
	public void breakBlock(World world, int i, int j, int k, int par5, int par6)
	{
		TileEntityFurnace tileEntity = (TileEntityFurnace)world.getBlockTileEntity(i, j, k);
		if (tileEntity !=null)
		{
			world.destroyBlock(tileEntity.primary_x, tileEntity.primary_y, tileEntity.primary_z, false);
			world.removeBlockTileEntity(tileEntity.primary_x, tileEntity.primary_y, tileEntity.primary_z);
		}
		
		world.removeBlockTileEntity(i, j, k);
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
		return new TileEntityFurnace();
	}

}