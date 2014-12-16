package tk.kaes3kuch3n.GlowingTools;

import net.minecraft.item.Item;

public class GlowingToolsIngot extends Item {
	
	public GlowingToolsIngot() {
		
		setMaxStackSize(64);
		setCreativeTab(GlowingToolsCreativeTabs.tabGlowing);
		setUnlocalizedName("GlowingIngot");
		setTextureName(GlowingTools.MODID + ":ItemGlowingIngot");
		
	}
	
}
