package tk.kaes3kuch3n.GlowingTools;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class GlowingToolsItem extends Item {
	
	public GlowingToolsItem() {
		setMaxStackSize(64);
		setUnlocalizedName("GlowingItem");
		setCreativeTab(GlowingToolsCreativeTabs.tabGlowing);
		setTextureName(GlowingTools.MODID + ":NoTexture");
	}
	
	public void addInformation(ItemStack itemStack, EntityPlayer player, List lore, boolean bool) {
		lore.add("It's just a pointless item...");
	}
	
}
