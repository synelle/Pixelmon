package pixelmon;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.ModelBase;
import net.minecraft.src.World;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.network.IGuiHandler;
import pixelmon.config.PixelmonBlocks;
import pixelmon.entities.EntityCamera;
import pixelmon.gui.GuiHandler;
import pixelmon.models.fossils.ModelFossil;
import pixelmon.sounds.Sounds;

public class CommonProxy implements IGuiHandler {
	public void registerRenderers() {
	}

	public World GetClientWorld() {
		return null;
	}

	public GuiHandler guiHandler = new GuiHandler();

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return guiHandler.getServerGuiElement(ID, player, world, x, y, z);
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return null;
	}

	public int addArmor(String name){
		return RenderingRegistry.addNewArmourRendererPrefix(name);
	}
	
	public void preloadTextures() {
	}

	public void registerPacketHandlers() {
	}

	public void registerKeyBindings() {
	}

	public ModelBase loadModel(String name) {
		return null;
	}

	public ModelBase getTrainerModel(String model) {
		return null;
	}

	public int getTexture(String string, String string2) {
		return 0;
	}

	public void registerSounds() {
	}

	public void registerTickHandlers() {
	}

	public void loadEvents() {
	}

	public void registerCameraEntity(EntityCamera entityCamera) {
	}

	private ModelBase[] models = new ModelBase[0];

	public ModelBase[] getModels() {
		return models;
	}

	public ModelFossil loadFossilModel(String modelName) {
		return null;
	}

}
