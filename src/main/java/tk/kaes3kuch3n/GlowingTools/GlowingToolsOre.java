package tk.kaes3kuch3n.GlowingTools;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GlowingToolsOre extends Block {
	
	protected GlowingToolsOre(Material material) {
		super(material);
		
		setHardness(5.0F);
		setLightLevel(0.9F);
		setStepSound(soundTypeStone);
		setBlockName("GlowingOre");
		setCreativeTab(GlowingToolsCreativeTabs.tabGlowing);
		setBlockTextureName(GlowingTools.MODID + ":BlockGlowingOre");
		
	}
	
}
