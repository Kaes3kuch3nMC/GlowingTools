package tk.kaes3kuch3n.GlowingTools;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemHoe;

public class GlowingToolsHoe extends ItemHoe {
	
	protected GlowingToolsHoe(ToolMaterial toolMaterial) {
		super(toolMaterial);
		
		setCreativeTab(GlowingToolsCreativeTabs.tabGlowing);
		setUnlocalizedName("GlowingHoe");
		setTextureName(GlowingTools.MODID + ":ItemGlowingHoe");
		
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcon(IIconRegister reg) {
		this.itemIcon = reg.registerIcon(GlowingTools.MODID + ":ItemGlowingHoe");
	}
	
}
