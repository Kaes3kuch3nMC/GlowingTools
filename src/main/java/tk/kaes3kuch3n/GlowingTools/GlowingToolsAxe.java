package tk.kaes3kuch3n.GlowingTools;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemAxe;

public class GlowingToolsAxe extends ItemAxe {
	
	protected GlowingToolsAxe(ToolMaterial toolMaterial) {
		super(toolMaterial);
		
		setCreativeTab(GlowingToolsCreativeTabs.tabGlowing);
		setUnlocalizedName("GlowingAxe");
		setTextureName(GlowingTools.MODID + ":ItemGlowingAxe");
		
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcon(IIconRegister reg) {
		this.itemIcon = reg.registerIcon(GlowingTools.MODID + ":ItemGlowingAxe");
	}
	
}
