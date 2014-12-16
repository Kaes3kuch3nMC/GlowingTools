package tk.kaes3kuch3n.GlowingTools;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GlowingToolsBlock extends Block {
	
	/**
     * Adds new block.
     * 
     * @param material Material
     * 
     * 		(Example: Material.rock)
     * 
     */
	protected GlowingToolsBlock(Material material) {
		super(material);
		setHardness(10.0F);
		setLightLevel(1.0F);
		setStepSound(soundTypeMetal);
		setBlockName("GlowingBlock");
		setCreativeTab(GlowingToolsCreativeTabs.tabGlowing);
		setBlockTextureName(GlowingTools.MODID + ":BlockGlowingBlock");
	}
	
}
