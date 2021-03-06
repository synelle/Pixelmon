package pixelmon.items;

import pixelmon.battles.attacks.statusEffects.StatusEffectType;
import pixelmon.config.PixelmonCreativeTabs;
import pixelmon.entities.pixelmon.EntityPixelmon;
import pixelmon.enums.EnumStatusAilmentHealers;

public class ItemStatusAilmentHealer extends PixelmonItem {
	public EnumStatusAilmentHealers type;

	public ItemStatusAilmentHealer(int par1, EnumStatusAilmentHealers type) {
		super(par1);
		SetUsableInBattle(true);
		this.type = type;
		setMaxStackSize(16);
		setIconIndex(type.getIconIndex());
		setCreativeTab(PixelmonCreativeTabs.restoration);
	}

	public boolean healPokemon(EntityPixelmon pxm) {
		boolean healedAilment = false;
		for(StatusEffectType s: this.type.statusesHealed()){
			if (pxm.removeStatus(s)){
				healedAilment = true;
			}
		}
		return healedAilment;
	}
	
	@Override
	public void useFromBag(EntityPixelmon userPokemon, EntityPixelmon targetPokemon) {
		for(StatusEffectType s: this.type.statusesHealed()){
			userPokemon.removeStatus(s);
		}
		if (this.type.healsHP()){
			userPokemon.setEntityHealth(userPokemon.stats.HP);
		}
	}

}
