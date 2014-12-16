package tk.kaes3kuch3n.GlowingTools;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class GlowingToolsSword extends ItemSword {
	
	protected GlowingToolsSword(ToolMaterial toolMaterial) {
		super(toolMaterial);
		
		setCreativeTab(GlowingToolsCreativeTabs.tabGlowing);
		setUnlocalizedName("GlowingSword");
		setTextureName(GlowingTools.MODID + ":ItemGlowingSword");
		
	}
	
	public void addInformation(ItemStack itemStack, EntityPlayer player, List lore, boolean bool) {
		lore.add("Rightclick to spawn a sheep");
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcon(IIconRegister reg) {
		this.itemIcon = reg.registerIcon(GlowingTools.MODID + ":ItemGlowingSword");
	}
	
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
		
		if(!world.isRemote) {
			EntitySheep sheep = new EntitySheep(world);
			sheep.setPosition(player.posX, player.posY + 1, player.posZ);
			world.spawnEntityInWorld(sheep);
		}
		
		return itemStack;
		
	}
	
}
