package pixelmon.client;

import java.io.File;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.world.WorldEvent;
import pixelmon.CommonProxy;
import pixelmon.battles.animations.particles.EntityGastlyParticle;
import pixelmon.blocks.TileEntityAnvil;
import pixelmon.blocks.TileEntityFossilMachine;
import pixelmon.blocks.TileEntityHealer;
import pixelmon.blocks.TileEntityPC;
import pixelmon.blocks.apricornTrees.TileEntityApricornTree;
import pixelmon.client.gui.GuiChooseStarter;
import pixelmon.client.gui.GuiHealer;
import pixelmon.client.gui.GuiPixelmonOverlay;
import pixelmon.client.gui.GuiTrading;
import pixelmon.client.gui.battles.ClientBattleManager;
import pixelmon.client.gui.battles.GuiBattle;
import pixelmon.client.gui.inventoryExtended.InventoryDetectionTickHandler;
import pixelmon.client.gui.pc.GuiPC;
import pixelmon.client.gui.pokechecker.GuiScreenPokeChecker;
import pixelmon.client.gui.pokechecker.GuiScreenPokeCheckerMoves;
import pixelmon.client.gui.pokechecker.GuiScreenPokeCheckerStats;
import pixelmon.client.gui.pokedex.GuiPokedex;
import pixelmon.client.keybindings.MinimizeMaximizeOverlayKey;
import pixelmon.client.keybindings.MovementHandler;
import pixelmon.client.keybindings.NextPokemonKey;
import pixelmon.client.keybindings.PreviousPokemonKey;
import pixelmon.client.keybindings.SendPokemonKey;
import pixelmon.client.models.fossils.ModelFossil;
import pixelmon.client.render.RenderPixelmon;
import pixelmon.client.render.RenderPokeball;
import pixelmon.client.render.RenderTileEntityAnvil;
import pixelmon.client.render.RenderTileEntityApricornTrees;
import pixelmon.client.render.RenderTileEntityHealer;
import pixelmon.client.render.RenderTileEntityPC;
import pixelmon.client.render.RenderTileFossilMachine;
import pixelmon.client.render.RenderTrainer;
import pixelmon.entities.EntityCamera;
import pixelmon.entities.pixelmon.EntityPixelmon;
import pixelmon.entities.pokeballs.EntityPokeBall;
import pixelmon.entities.trainers.EntityTrainer;
import pixelmon.enums.EnumGui;
import pixelmon.enums.EnumPixelmonParticles;
import pixelmon.enums.EnumPokeballs;
import pixelmon.sounds.Sounds;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.KeyBindingRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.registry.TickRegistry;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenderers() {
		for (EnumPokeballs p : EnumPokeballs.values()) {
			MinecraftForgeClient.preloadTexture("/pixelmon/texture/pokeballs/" + p.getTexture());
			MinecraftForgeClient.preloadTexture("/pixelmon/texture/pokeballs/" + p.getFlashRedTexture());
			MinecraftForgeClient.preloadTexture("/pixelmon/texture/pokeballs/" + p.getCaptureTexture());
		}
		RenderingRegistry.registerEntityRenderingHandler(EntityPokeBall.class, new RenderPokeball());
		RenderingRegistry.registerEntityRenderingHandler(EntityCamera.class, new RenderInvisible());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityHealer.class, new RenderTileEntityHealer());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPC.class, new RenderTileEntityPC());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityApricornTree.class, new RenderTileEntityApricornTrees());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAnvil.class, new RenderTileEntityAnvil());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilMachine.class, new RenderTileFossilMachine());
		MinecraftForgeClient.preloadTexture("/pixelmon/image/pitems.png");
		MinecraftForgeClient.preloadTexture("/pixelmon/image/pitems2.png");
		MinecraftForgeClient.preloadTexture("/pixelmon/block/blocks.png");
		addPokemonRenderers();
		MinecraftForge.EVENT_BUS.register(new GuiPixelmonOverlay());
	}

	@Override
	public World GetClientWorld() {
		return Minecraft.getMinecraft().theWorld;
	}

	@Override
	public void preloadTextures() {
		// for (EnumPokemon pokemon : EnumPokemon.values())
		// MinecraftForgeClient.preloadTexture("/pixelmon/texture/pokemon/" +
		// pokemon.name.toLowerCase() + ".png");
	}

	@Override
	public void registerKeyBindings() {
		MinecraftForge.EVENT_BUS.register(this);

		KeyBindingRegistry.registerKeyBinding(new SendPokemonKey());
		KeyBindingRegistry.registerKeyBinding(new NextPokemonKey());
		KeyBindingRegistry.registerKeyBinding(new PreviousPokemonKey());
		KeyBindingRegistry.registerKeyBinding(new MinimizeMaximizeOverlayKey());
		TickRegistry.registerTickHandler(new MovementHandler(), Side.CLIENT);
	}

	private void addPokemonRenderers() {
		RenderingRegistry.registerEntityRenderingHandler(EntityTrainer.class, new RenderTrainer(0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityPixelmon.class, new RenderPixelmon(0.5f));
	}

	public ModelBase loadModel(String name) {
		ModelBase model = null;
		try {
			Class<?> var3 = (Class<?>) Class.forName("pixelmon.client.models.pokemon.Model" + name);
			if (var3 != null) {
				model = (ModelBase) var3.getConstructor(new Class[] {}).newInstance(new Object[] {});
			}

		} catch (Exception e) {
			System.out.println("Can't find Model for " + name);
		}
		if (model == null)
			System.out.println("Can't find Model for " + name);
		return model;
	}

	@Override
	public ModelFossil loadFossilModel(String name) {
		ModelFossil model = null;
		try {
			Class<?> var3 = (Class<?>) Class.forName("pixelmon.client.models.fossils.Model" + name);
			if (var3 != null) {
				model = (ModelFossil) var3.getConstructor(new Class[] {}).newInstance(new Object[] {});
			}

		} catch (Exception e) {
			System.out.println("Can't find Model for " + name);
		}
		if (model == null)
			System.out.println("Can't find Model for " + name);
		return model;
	}

	public ModelBase getTrainerModel(String name) {
		ModelBase model = null;
		try {
			Class<?> var3 = (Class<?>) Class.forName("pixelmon.client.models.trainers.Model" + name);
			if (var3 != null) {
				model = (ModelBase) var3.getConstructor(new Class[] {}).newInstance(new Object[] {});
			}

		} catch (Exception e) {
			System.out.println("Error in Model for " + name);
			System.out.println(e.getMessage());
			return null;
		}
		if (model == null)
			System.out.println("Can't find Model for " + name);
		return model;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == EnumGui.ChooseStarter.getIndex())
			return new GuiChooseStarter();
		else if (ID == EnumGui.LearnMove.getIndex())
			return new GuiBattle();
		else if (ID == EnumGui.LevelUp.getIndex())
			return new GuiBattle();
		else if (ID == EnumGui.Battle.getIndex())
			return new GuiBattle(x);
		else if (ID == EnumGui.Pokedex.getIndex())
			return new GuiPokedex(player.username, x);
		else if (ID == EnumGui.PC.getIndex())
			return new GuiPC();
		else if (ID == EnumGui.Healer.getIndex())
			return new GuiHealer();
		else if (ID == EnumGui.PokeChecker.getIndex())
			return new GuiScreenPokeChecker(ServerStorageDisplay.get(x));
		else if (ID == EnumGui.PokeCheckerStats.getIndex())
			return new GuiScreenPokeCheckerStats(ServerStorageDisplay.get(x));
		else if (ID == EnumGui.PokeCheckerMoves.getIndex())
			return new GuiScreenPokeCheckerMoves(ServerStorageDisplay.get(x));
		else if (ID == EnumGui.Trading.getIndex())
			return new GuiTrading(x);

		return null;
	}

	public static File getMinecraftDir() {
		return Minecraft.getMinecraftDir();
	}

	@ForgeSubscribe
	public void onWorldLoad(WorldEvent.Load event) {
		ServerStorageDisplay.clear();
		PixelmonServerStore.clearList();
	}

	public static void spawnParticle(EnumPixelmonParticles particle, World worldObj, double posX, double posY, double posZ, boolean isShiny) {
		try {
			EntityFX fx;
			if (particle.particleClass == EntityGastlyParticle.class)
				fx = new EntityGastlyParticle(worldObj, posX, posY, posZ, 0, 0, 0, isShiny);
			else
				fx = (EntityFX) particle.particleClass.getConstructor(World.class, double.class, double.class, double.class, double.class, double.class, double.class).newInstance(
						worldObj, posX, posY, posZ, 0d, 0d, 0d);
			Minecraft.getMinecraft().effectRenderer.addEffect(fx);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public int getTexture(String string, String string2) {
		return RenderingRegistry.addTextureOverride(string, string2);
	}

	@Override
	public void registerSounds() {
		Sounds.installSounds();
	}

	@Override
	public void registerTickHandlers() {
		TickRegistry.registerTickHandler(new InventoryDetectionTickHandler(), Side.CLIENT);
	}

	@Override
	public void registerCameraEntity(EntityCamera entityCamera) {
		ClientBattleManager.camera = entityCamera;
	}

	public ModelBase[] models = new ModelBase[650];

	@Override
	public ModelBase[] getModels() {
		return models;
	}
}
