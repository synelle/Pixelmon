package pixelmon.config;

import java.lang.reflect.Field;

import pixelmon.enums.EnumBadges;
import pixelmon.items.ItemBadge;
import net.minecraft.src.Item;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class PixelmonItemsBadges {
	public static int balanceBadgeID;
	public static int beaconBadgeID;
	public static int boulderBadgeID;
	public static int cascadeBadgeID;
	public static int coalBadgeID;
	public static int cobbleBadgeID;
	public static int dynamoBadgeID;
	public static int earthBadgeID;
	public static int featherBadgeID;
	public static int fenBadgeID;
	public static int fogBadgeID;
	public static int forestBadgeID;
	public static int glacierBadgeID;
	public static int heatBadgeID;
	public static int hiveBadgeID;
	public static int icicleBadgeID;
	public static int knuckleBadgeID;
	public static int marshBadgeID;
	public static int mindBadgeID;
	public static int mineBadgeID;
	public static int mineralBadgeID;
	public static int plainBadgeID;
	public static int rainbowBadgeID;
	public static int rainBadgeID;
	public static int relicBadgeID;
	public static int risingBadgeID;
	public static int soulBadgeID;
	public static int stoneBadgeID;
	public static int stormBadgeID;
	public static int thunderBadgeID;
	public static int volcanoBadgeID;
	public static int zephyrBadgeID;

	@Mod.Item(name = "Balance Badge", typeClass = "pixelmon.items.ItemBadge")
	public static Item balanceBadge;
	@Mod.Item(name = "Beacon Badge", typeClass = "pixelmon.items.ItemBadge")
	public static Item beaconBadge;
	@Mod.Item(name = "Boulder Badge", typeClass = "pixelmon.items.ItemBadge")
	public static Item boulderBadge;
	@Mod.Item(name = "Cascade Badge", typeClass = "pixelmon.items.ItemBadge")
	public static Item cascadeBadge;
	@Mod.Item(name = "Coal Badge", typeClass = "pixelmon.items.ItemBadge")
	public static Item coalBadge;
	@Mod.Item(name = "Cobble Badge", typeClass = "pixelmon.items.ItemBadge")
	public static Item cobbleBadge;
	@Mod.Item(name = "Dynamo Badge", typeClass = "pixelmon.items.ItemBadge")
	public static Item dynamoBadge;
	@Mod.Item(name = "Earth Badge", typeClass = "pixelmon.items.ItemBadge")
	public static Item earthBadge;
	@Mod.Item(name = "Feather Badge", typeClass = "pixelmon.items.ItemBadge")
	public static Item featherBadge;
	@Mod.Item(name = "Fen Badge", typeClass = "pixelmon.items.ItemBadge")
	public static Item fenBadge;
	@Mod.Item(name = "Fog Badge", typeClass = "pixelmon.items.ItemBadge")
	public static Item fogBadge;
	@Mod.Item(name = "Forest Badge", typeClass = "pixelmon.items.ItemBadge")
	public static Item forestBadge;
	@Mod.Item(name = "Glacier Badge", typeClass = "pixelmon.items.ItemBadge")
	public static Item glacierBadge;
	@Mod.Item(name = "Heat Badge", typeClass = "pixelmon.items.ItemBadge")
	public static Item heatBadge;
	@Mod.Item(name = "Hive Badge", typeClass = "pixelmon.items.ItemBadge")
	public static Item hiveBadge;
	@Mod.Item(name = "Icicle Badge", typeClass = "pixelmon.items.ItemBadge")
	public static Item icicleBadge;
	@Mod.Item(name = "Knuckle Badge", typeClass = "pixelmon.items.ItemBadge")
	public static Item knuckleBadge;
	@Mod.Item(name = "Marsh Badge", typeClass = "pixelmon.items.ItemBadge")
	public static Item marshBadge;
	@Mod.Item(name = "Mind Badge", typeClass = "pixelmon.items.ItemBadge")
	public static Item mindBadge;
	@Mod.Item(name = "Mine Badge", typeClass = "pixelmon.items.ItemBadge")
	public static Item mineBadge;
	@Mod.Item(name = "Mineral Badge", typeClass = "pixelmon.items.ItemBadge")
	public static Item mineralBadge;
	@Mod.Item(name = "Plain Badge", typeClass = "pixelmon.items.ItemBadge")
	public static Item plainBadge;
	@Mod.Item(name = "Rainbow Badge", typeClass = "pixelmon.items.ItemBadge")
	public static Item rainbowBadge;
	@Mod.Item(name = "Rain Badge", typeClass = "pixelmon.items.ItemBadge")
	public static Item rainBadge;
	@Mod.Item(name = "Relic Badge", typeClass = "pixelmon.items.ItemBadge")
	public static Item relicBadge;
	@Mod.Item(name = "Rising Badge", typeClass = "pixelmon.items.ItemBadge")
	public static Item risingBadge;
	@Mod.Item(name = "Soul Badge", typeClass = "pixelmon.items.ItemBadge")
	public static Item soulBadge;
	@Mod.Item(name = "Stone Badge", typeClass = "pixelmon.items.ItemBadge")
	public static Item stoneBadge;
	@Mod.Item(name = "Storm Badge", typeClass = "pixelmon.items.ItemBadge")
	public static Item stormBadge;
	@Mod.Item(name = "Thunder Badge", typeClass = "pixelmon.items.ItemBadge")
	public static Item thunderBadge;
	@Mod.Item(name = "Volcano Badge", typeClass = "pixelmon.items.ItemBadge")
	public static Item volcanoBadge;
	@Mod.Item(name = "Zephyr Badge", typeClass = "pixelmon.items.ItemBadge")
	public static Item zephyrBadge;

	public static void load(Configuration cfg) {
		balanceBadgeID = cfg.get("badges", "Balance Badge", 10200).getInt();
		beaconBadgeID = cfg.get("badges", "Beacon Badge", 10201).getInt();
		boulderBadgeID = cfg.get("badges", "Boulder Badge", 10202).getInt();
		cascadeBadgeID = cfg.get("badges", "Cascade Badge", 10203).getInt();
		coalBadgeID = cfg.get("badges", "Coal Badge", 10204).getInt();
		cobbleBadgeID = cfg.get("badges", "Cobble Badge", 10205).getInt();
		dynamoBadgeID = cfg.get("badges", "Dynamo Badge", 10206).getInt();
		earthBadgeID = cfg.get("badges", "Earth Badge", 10207).getInt();
		featherBadgeID = cfg.get("badges", "Feather Badge", 10208).getInt();
		fenBadgeID = cfg.get("badges", "Fen Badge", 10209).getInt();
		fogBadgeID = cfg.get("badges", "Fog Badge", 10210).getInt();
		forestBadgeID = cfg.get("badges", "Forest Badge", 10211).getInt();
		glacierBadgeID = cfg.get("badges", "Glaceir Badge", 10212).getInt();
		heatBadgeID = cfg.get("badges", "Heat Badge", 10213).getInt();
		hiveBadgeID = cfg.get("badges", "Hive Badge", 10214).getInt();
		icicleBadgeID = cfg.get("badges", "Icicle Badge", 10215).getInt();
		knuckleBadgeID = cfg.get("badges", "Knuckle Badge", 10216).getInt();
		marshBadgeID = cfg.get("badges", "Marsh Badge", 10217).getInt();
		mindBadgeID = cfg.get("badges", "Mind Badge", 10218).getInt();
		mineBadgeID = cfg.get("badges", "Mine Badge", 10219).getInt();
		mineralBadgeID = cfg.get("badges", "Mineral Badge", 10220).getInt();
		plainBadgeID = cfg.get("badges", "Plain Badge", 10221).getInt();
		rainbowBadgeID = cfg.get("badges", "Rainbow Badge", 10222).getInt();
		rainBadgeID = cfg.get("badges", "Rain Badge", 10223).getInt();
		relicBadgeID = cfg.get("badges", "Relic Badge", 10224).getInt();
		risingBadgeID = cfg.get("badges", "Rising Badge", 10225).getInt();
		soulBadgeID = cfg.get("badges", "Soul Badge", 10226).getInt();
		stoneBadgeID = cfg.get("badges", "Stone Badge", 10227).getInt();
		stormBadgeID = cfg.get("badges", "Storm Badge", 10228).getInt();
		thunderBadgeID = cfg.get("badges", "Thunder Badge", 10229).getInt();
		volcanoBadgeID = cfg.get("badges", "Volcano Badge", 10230).getInt();
		zephyrBadgeID = cfg.get("badges", "Zephyr Badge", 10231).getInt();

		balanceBadge = new ItemBadge(balanceBadgeID, EnumBadges.Balancebadge).setItemName("Balance Badge");
		beaconBadge = new ItemBadge(beaconBadgeID, EnumBadges.Beaconbadge).setItemName("Beacon Badge");
		boulderBadge = new ItemBadge(boulderBadgeID, EnumBadges.Boulderbadge).setItemName("Boulder Badge");
		cascadeBadge = new ItemBadge(cascadeBadgeID, EnumBadges.Cascadebadge).setItemName("Cascade Badge");
		coalBadge = new ItemBadge(coalBadgeID, EnumBadges.Coalbadge).setItemName("Coal Badge");
		cobbleBadge = new ItemBadge(cobbleBadgeID, EnumBadges.Cobblebadge).setItemName("Cobble Badge");
		dynamoBadge = new ItemBadge(dynamoBadgeID, EnumBadges.Dynamobadge).setItemName("Dynamo Badge");
		earthBadge = new ItemBadge(earthBadgeID, EnumBadges.Earthbadge).setItemName("Earth Badge");
		featherBadge = new ItemBadge(featherBadgeID, EnumBadges.Featherbadge).setItemName("Feather Badge");
		fenBadge = new ItemBadge(fenBadgeID, EnumBadges.Fenbadge).setItemName("Fen Badge");
		fogBadge = new ItemBadge(fogBadgeID, EnumBadges.Fogbadge).setItemName("Fog Badge");
		forestBadge = new ItemBadge(forestBadgeID, EnumBadges.Forestbadge).setItemName("Forest Badge");
		glacierBadge = new ItemBadge(glacierBadgeID, EnumBadges.Glacierbadge).setItemName("Glacier Badge");
		heatBadge = new ItemBadge(heatBadgeID, EnumBadges.Heatbadge).setItemName("Heat Badge");
		hiveBadge = new ItemBadge(hiveBadgeID, EnumBadges.Hivebadge).setItemName("Hive Badge");
		icicleBadge = new ItemBadge(icicleBadgeID, EnumBadges.Iciclebadge).setItemName("Icicle Badge");
		knuckleBadge = new ItemBadge(knuckleBadgeID, EnumBadges.Knucklebadge).setItemName("Knuckle Badge");
		marshBadge = new ItemBadge(marshBadgeID, EnumBadges.Marshbadge).setItemName("Marsh Badge");
		mindBadge = new ItemBadge(mindBadgeID, EnumBadges.Mindbadge).setItemName("Mind Badge");
		mineBadge = new ItemBadge(mineBadgeID, EnumBadges.Minebadge).setItemName("Mine Badge");
		mineralBadge = new ItemBadge(mineralBadgeID, EnumBadges.Mineralbadge).setItemName("Mineral Badge");
		plainBadge = new ItemBadge(plainBadgeID, EnumBadges.Plainbadge).setItemName("Plain Badge");
		rainbowBadge = new ItemBadge(rainbowBadgeID, EnumBadges.Rainbowbadge).setItemName("Rainbow Badge");
		rainBadge = new ItemBadge(rainBadgeID, EnumBadges.Rainbadge).setItemName("Rain Badge");
		relicBadge = new ItemBadge(relicBadgeID, EnumBadges.Relicbadge).setItemName("Relic Badge");
		risingBadge = new ItemBadge(risingBadgeID, EnumBadges.Risingbadge).setItemName("Rising Badge");
		soulBadge = new ItemBadge(soulBadgeID, EnumBadges.Soulbadge).setItemName("Soul Badge");
		stoneBadge = new ItemBadge(stoneBadgeID, EnumBadges.Stonebadge).setItemName("Stone Badge");
		stormBadge = new ItemBadge(stormBadgeID, EnumBadges.Stormbadge).setItemName("Storm Badge");
		thunderBadge = new ItemBadge(thunderBadgeID, EnumBadges.Thunderbadge).setItemName("Thunder Badge");
		volcanoBadge = new ItemBadge(volcanoBadgeID, EnumBadges.Volcanobadge).setItemName("Volcano Badge");
		zephyrBadge = new ItemBadge(zephyrBadgeID, EnumBadges.Zephyrbadge).setItemName("Zephyr Badge");
	}

	public static void addNames() {
		try {
			for (Field field : PixelmonItemsBadges.class.getFields()) {
				if (field.isAnnotationPresent(Mod.Item.class)) {
					Item item = (Item) field.get(null);
					LanguageRegistry.addName(item, field.getAnnotation(Mod.Item.class).name());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
