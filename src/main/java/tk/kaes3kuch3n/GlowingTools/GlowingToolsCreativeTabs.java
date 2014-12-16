package tk.kaes3kuch3n.GlowingTools;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class GlowingToolsCreativeTabs {
	
	public static CreativeTabs tabGlowing = new CreativeTabs("tabGlowing") {
		
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return GlowingTools.itemPickaxeGlowing;
		}
	};
	
}
