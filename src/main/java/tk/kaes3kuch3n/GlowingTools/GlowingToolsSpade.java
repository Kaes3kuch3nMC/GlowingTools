package tk.kaes3kuch3n.GlowingTools;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemSpade;

public class GlowingToolsSpade extends ItemSpade {
	
	protected GlowingToolsSpade(ToolMaterial toolMaterial) {
		super(toolMaterial);
		
		setCreativeTab(GlowingToolsCreativeTabs.tabGlowing);
		setUnlocalizedName("GlowingShovel");
		setTextureName(GlowingTools.MODID + ":ItemGlowingShovel");
		
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcon(IIconRegister reg) {
		this.itemIcon = reg.registerIcon(GlowingTools.MODID + ":ItemGlowingShovel");
	}
	
}
