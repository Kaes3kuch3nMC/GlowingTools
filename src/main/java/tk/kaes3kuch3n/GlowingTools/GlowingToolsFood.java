package tk.kaes3kuch3n.GlowingTools;

import net.minecraft.item.ItemFood;

public class GlowingToolsFood extends ItemFood {
	
	public GlowingToolsFood(int healAmount, float saturationModifier, boolean isWolfsFavoriteMeat) {
		super(healAmount, saturationModifier, isWolfsFavoriteMeat);
		
		setMaxStackSize(16);
		setCreativeTab(GlowingToolsCreativeTabs.tabGlowing);
		setTextureName(GlowingTools.MODID + ":NoTexture");
		
	}

}
