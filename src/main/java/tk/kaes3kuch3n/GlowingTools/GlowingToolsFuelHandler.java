package tk.kaes3kuch3n.GlowingTools;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class GlowingToolsFuelHandler implements IFuelHandler {
	
	@Override
	public int getBurnTime(ItemStack fuel) {
		//200 Ticks = 10 Sekunden = 1 Brennvorgang
		
		if(fuel.getItem() == GlowingTools.itemGlowing)
			return 12800;
		
		return 0;
	}

}
