package tk.kaes3kuch3n.GlowingTools;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemPickaxe;

public class GlowingToolsPickaxe extends ItemPickaxe {
	
	protected GlowingToolsPickaxe(ToolMaterial toolMaterial) {
		super(toolMaterial);
		
		setCreativeTab(GlowingToolsCreativeTabs.tabGlowing);
		setUnlocalizedName("GlowingPickaxe");
		setTextureName(GlowingTools.MODID + ":ItemGlowingPickaxe");
		
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcon(IIconRegister reg) {
		this.itemIcon = reg.registerIcon(GlowingTools.MODID + ":ItemGlowingPickaxe");
	}

}
