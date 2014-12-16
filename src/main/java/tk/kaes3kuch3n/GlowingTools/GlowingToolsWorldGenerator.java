package tk.kaes3kuch3n.GlowingTools;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class GlowingToolsWorldGenerator implements IWorldGenerator {
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		
		switch(world.provider.dimensionId) {
			
		case -1: generateNether(world, random, chunkX * 16, chunkZ * 16);
		case 0: generateOverworld(world, random, chunkX * 16, chunkZ * 16);
		case 1: generateEnd(world, random, chunkX * 16, chunkZ * 16);
			
		}
		
	}
	
	private void generateNether(World world, Random random, int x, int z) {
		//Block-generation Nether
	}
	
	private void generateOverworld(World world, Random random, int x, int z) {
		generateOre(GlowingTools.blockOre, world, random, x, z, 16, 16, 1 + random.nextInt(5), 10, 10, 30);
	}
	
	private void generateEnd(World world, Random random, int x, int z) {
		//Block-generation End
	}
	
	public void generateOre(Block block, World world, Random random, int posX, int posZ, int maxX, int maxZ, int maxSize, int count, int minY, int maxY) {
		
		int difY = maxY - minY;
		
		for(int i = 0; i < count; i++) {
			
			int positionX = posX + random.nextInt(maxX);
			int positionY = minY + random.nextInt(difY);
			int positionZ = posZ + random.nextInt(maxZ);
			(new WorldGenMinable(block, maxSize)).generate(world, random, positionX, positionY, positionZ);
			
		}
		
	}

}
