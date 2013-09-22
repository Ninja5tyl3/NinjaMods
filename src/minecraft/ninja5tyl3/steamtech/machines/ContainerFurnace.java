package ninja5tyl3.steamtech.machines;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ContainerFurnace extends Container
{
	private TileEntityFurnace furnace;
	private int lastCookTime = 0;
	private int lastBurnTime = 0;
	private int lastItemBurntTime = 0;
	
	public ContainerFurnace(InventoryPlayer par1InventoryPlayer, TileEntityFurnace par2TileEntityfurnace)
	{
		this.furnace = par2TileEntityfurnace;
		this.addSlotToContainer(new Slot(par2TileEntityfurnace, 0, 56, 17));
		this.addSlotToContainer(new Slot(par2TileEntityfurnace, 1, 56, 53));
		this.addSlotToContainer(new SlotFurnace(par1InventoryPlayer.player, par2TileEntityfurnace, 2, 116, 35));
	}
	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
