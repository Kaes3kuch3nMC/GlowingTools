package tk.kaes3kuch3n.GlowingTools;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class GlowingToolsArmor extends ItemArmor {
	
	public GlowingToolsArmor(ArmorMaterial armorMaterial, int renderIndex, int armorType) {
		super(armorMaterial, renderIndex, armorType);
		
		setCreativeTab(GlowingToolsCreativeTabs.tabGlowing);
		
		if(armorType == 0)
			setTextureName(GlowingTools.MODID + ":ItemGlowingHelmet");
		else if(armorType == 1)
			setTextureName(GlowingTools.MODID + ":ItemGlowingChestplate");
		else if(armorType == 2)
			setTextureName(GlowingTools.MODID + ":ItemGlowingLeggings");
		else if(armorType == 3)
			setTextureName(GlowingTools.MODID + ":ItemGlowingBoots");
		
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		
		if(stack.getItem() == GlowingTools.itemHelmetGlowing || stack.getItem() == GlowingTools.itemChestplateGlowing || stack.getItem() == GlowingTools.itemBootsGlowing)
			return GlowingTools.MODID + ":GlowingArmor1";
		
		if(stack.getItem() == GlowingTools.itemLeggingsGlowing)
			return GlowingTools.MODID + ":GlowingArmor2";
		
		else
			return null;
		
	}
	
}
