package tk.kaes3kuch3n.GlowingTools;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import tk.kaes3kuch3n.GlowingTools.Proxies.GlowingToolsProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = GlowingTools.MODID, name = GlowingTools.NAME, version = GlowingTools.VERSION)
public class GlowingTools {
	
	//mcmod.info stuff
	public static final String MODID = "GlowingTools";
	public static final String NAME = "GlowingTools";
	public static final String VERSION = "1.0.0";
	
	//Proxies
	public static final String CLIENTSIDEPROXY = "tk.kaes3kuch3n.GlowingTools.Proxies.GlowingToolsClientProxy";
	public static final String SERVERSIDEPROXY = "tk.kaes3kuch3n.GlowingTools.Proxies.GlowingToolsClientProxy";
	
	@Instance(value = GlowingTools.MODID)
	public static GlowingTools instance;
	
	@SidedProxy(clientSide = GlowingTools.CLIENTSIDEPROXY, serverSide = GlowingTools.SERVERSIDEPROXY)
	public static GlowingToolsProxy proxy;
	
	//ArmorIDs
	public static int helmetGlowingID;
	public static int chestplateGlowingID;
	public static int leggingsGlowingID;
	public static int bootsGlowingID;
	
	//Materials
	public static ToolMaterial TOOLGLOWING;
	public static ArmorMaterial ARMORGLOWING;
	
	//Blocks
	public static Block blockGlowing;
	public static Block blockOre;
	
	//Items
	public static Item itemGlowing;
	public static Item itemIngot;
	
	//Tools
	public static Item itemPickaxeGlowing;
	public static Item itemAxeGlowing;
	public static Item itemShovelGlowing;
	public static Item itemHoeGlowing;
	public static Item itemSwordGlowing;
	
	//Armor
	public 	static Item itemHelmetGlowing;
	public static Item itemChestplateGlowing;
	public static Item itemLeggingsGlowing;
	public static Item itemBootsGlowing;
	
	//Loads new Blocks/Materials/Items/Tools/Armor
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		loadBlocks();
		loadMaterials();
		loadItems();
		loadTools();
		loadArmor();
		
	}

	//Loads textures, FuelHandler, WorldGenerator and new recipes
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		proxy.registerRenderers();
		GameRegistry.registerFuelHandler(new GlowingToolsFuelHandler());
		
		loadRecipes();
		
	}
	
	//Connect to other mods
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
		GameRegistry.registerWorldGenerator(new GlowingToolsWorldGenerator(), 1);
		
	}
	
	/**
     * Registers new recipes in GameRegistry.
     */
	public void loadRecipes() {
		
		//Shapeless Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(itemGlowing), Items.diamond);
		GameRegistry.addShapelessRecipe(new ItemStack(itemIngot, 9), blockGlowing);
		
		//Shaped Recipes
		GameRegistry.addShapedRecipe(new ItemStack(blockGlowing), 
				"###", 
				"###", 
				"###", 
				'#', itemIngot
				);
		
		GameRegistry.addShapedRecipe(new ItemStack(itemPickaxeGlowing), 
				"###", 
				" X ", 
				" X ", 
				'#', itemIngot, 
				'X', Items.stick
				);
		
		GameRegistry.addShapedRecipe(new ItemStack(itemAxeGlowing), 
				"## ", 
				"#X ", 
				" X ", 
				'#', itemIngot, 
				'X', Items.stick
				);
		
		GameRegistry.addShapedRecipe(new ItemStack(itemHoeGlowing), 
				"## ", 
				" X ", 
				" X ", 
				'#', itemIngot, 
				'X', Items.stick
				);
		
		GameRegistry.addShapedRecipe(new ItemStack(itemShovelGlowing), 
				" # ", 
				" X ", 
				" X ", 
				'#', itemIngot, 
				'X', Items.stick
				);
		
		GameRegistry.addShapedRecipe(new ItemStack(itemSwordGlowing), 
				" # ", 
				" # ", 
				" X ", 
				'#', itemIngot, 
				'X', Items.stick
				);
		
		GameRegistry.addShapedRecipe(new ItemStack(itemHelmetGlowing), 
				"###", 
				"# #", 
				'#', itemIngot
				);
		
		GameRegistry.addShapedRecipe(new ItemStack(itemChestplateGlowing), 
				"# #", 
				"###", 
				"###", 
				'#', itemIngot
				);
		
		GameRegistry.addShapedRecipe(new ItemStack(itemLeggingsGlowing), 
				"###", 
				"# #", 
				"# #", 
				'#', itemIngot
				);
		
		GameRegistry.addShapedRecipe(new ItemStack(itemBootsGlowing), 
				"# #", 
				"# #", 
				'#', itemIngot
				);
		
		//Smelting Recipes
		GameRegistry.addSmelting(Blocks.coal_block, new ItemStack(Items.diamond), 15.0F);
		
		GameRegistry.addSmelting(blockOre, new ItemStack(itemIngot), 25.0F);
		
	}
	
	/**
     * Registers new materials in GameRegistry.
     */
	private void loadMaterials() {
		
		TOOLGLOWING = EnumHelper.addToolMaterial("GLOWING", 5, 2500, 10.0F, 5.0F, 25);
		
		ARMORGLOWING = EnumHelper.addArmorMaterial("GLOWING", 50, new int[] {6, 10, 8, 6}, 30);
		
	}
	
	/**
     * Registers new blocks in GameRegistry.
     */
	public void loadBlocks() {
		
		blockGlowing = new GlowingToolsBlock(Material.iron);
		GameRegistry.registerBlock(blockGlowing, "GlowingBlock");
		
		blockOre = new GlowingToolsOre(Material.rock);
		GameRegistry.registerBlock(blockOre, "GlowingOre");
		
	}
	
	/**
     * Registers new items in GameRegistry.
     */
	public void loadItems() {
		
		itemGlowing = new GlowingToolsItem();
		GameRegistry.registerItem(itemGlowing, "GlowingItem");
		
		itemIngot = new GlowingToolsIngot();
		GameRegistry.registerItem(itemIngot, "GlowingIngot");
		
	}
	
	/**
     * Registers new tools in GameRegistry.
     */
	private void loadTools() {
		
		itemPickaxeGlowing = new GlowingToolsPickaxe(TOOLGLOWING);
		GameRegistry.registerItem(itemPickaxeGlowing, "GlowingPickaxe");
		
		itemAxeGlowing = new GlowingToolsAxe(TOOLGLOWING);
		GameRegistry.registerItem(itemAxeGlowing, "GlowingAxe");
		
		itemShovelGlowing = new GlowingToolsSpade(TOOLGLOWING);
		GameRegistry.registerItem(itemShovelGlowing, "GlowingShovel");
		
		itemHoeGlowing = new GlowingToolsHoe(TOOLGLOWING);
		GameRegistry.registerItem(itemHoeGlowing, "GlowingHoe");
		
		itemSwordGlowing = new GlowingToolsSword(TOOLGLOWING);
		GameRegistry.registerItem(itemSwordGlowing, "GlowingSword");
		
	}
	
	/**
     * Registers new armor in GameRegistry.
     */
	private void loadArmor() {
		
		itemHelmetGlowing = new GlowingToolsArmor(ARMORGLOWING, helmetGlowingID, 0).setUnlocalizedName("GlowingHelmet");
		GameRegistry.registerItem(itemHelmetGlowing, "GlowingHelmet");
		
		itemChestplateGlowing = new GlowingToolsArmor(ARMORGLOWING, chestplateGlowingID, 1).setUnlocalizedName("GlowingChestplate");
		GameRegistry.registerItem(itemChestplateGlowing, "GlowingChestplate");
		
		itemLeggingsGlowing = new GlowingToolsArmor(ARMORGLOWING, leggingsGlowingID, 2).setUnlocalizedName("GlowingLeggings");
		GameRegistry.registerItem(itemLeggingsGlowing, "GlowingLeggings");
		
		itemBootsGlowing = new GlowingToolsArmor(ARMORGLOWING, bootsGlowingID, 3).setUnlocalizedName("GlowingBoots");
		GameRegistry.registerItem(itemBootsGlowing, "GlowingBoots");
		
	}
	
}
