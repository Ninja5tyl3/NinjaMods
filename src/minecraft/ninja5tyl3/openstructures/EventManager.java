package ninja5tyl3.openstructures;

import java.util.Random;

import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.*;
import net.minecraft.world.gen.*;
import cpw.mods.fml.common.IWorldGenerator;

public class EventManager implements IWorldGenerator
{
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch(world.provider.dimensionId)
		{
			case -1: generateNether(world, random, chunkX*16, chunkZ*16);
			case 0: generatSurface(world, random, chunkX*16, chunkZ*16);
			case 1: generatEnd(world, random, chunkX*16, chunkZ*16);
		}
		
	}

	private void generatEnd(World world, Random random, int i, int j)
	{
		int Xcoord = i + random.nextInt(16);
		int Ycoord = 10 + random.nextInt(256);
		int Zcoord = j + random.nextInt(16);
	}

	private void generatSurface(World world, Random random, int i, int j)
	{
		int Xcoord = i + random.nextInt(16);
		int Ycoord = 10 + random.nextInt(256);
		int Zcoord = j + random.nextInt(16);
		
		//(new test()).generate(world, random, Xcoord, Ycoord, Zcoord);
		//(new test2()).generate(world, random, Xcoord, Ycoord, Zcoord);
		
		/**
		 * eventually want to add configs to toggle individual structure generation
		 */
		(new Dire9x9_Stone_Brick()).generate(world, random, Xcoord, Ycoord, Zcoord);
		
	}

	private void generateNether(World world, Random random, int i, int j) {
		int Xcoord = i + random.nextInt(16);
		int Ycoord = 10 + random.nextInt(128);
		int Zcoord = j + random.nextInt(16);
		
	}

}
