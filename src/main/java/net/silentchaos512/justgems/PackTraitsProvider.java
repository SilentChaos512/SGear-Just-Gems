package net.silentchaos512.justgems;

import net.minecraft.data.DataGenerator;
import net.minecraft.network.chat.TextComponent;
import net.silentchaos512.gear.data.trait.SynergyTraitBuilder;
import net.silentchaos512.gear.data.trait.TraitBuilder;
import net.silentchaos512.gear.data.trait.TraitsProvider;

import java.util.ArrayList;
import java.util.Collection;

public class PackTraitsProvider extends TraitsProvider {
    public PackTraitsProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected Collection<TraitBuilder> getTraits() {
        Collection<TraitBuilder> ret = new ArrayList<>();

        ret.add(new SynergyTraitBuilder(JustGems.SYNERGY_BOOSTER_TRAIT, 5, 0.04f)
                .setRangeMin(0.799f)
                .cancelsWith(JustGems.SYNERGY_DAMPER_TRAIT)
                .setName(new TextComponent("Synergy Booster (Just Gems)"))
                .setDescription(new TextComponent("Raises synergy if it is at least 80%"))
        );

        ret.add(new SynergyTraitBuilder(JustGems.SYNERGY_DAMPER_TRAIT, 5, -0.05f)
                .setRangeMin(1.049f)
                .cancelsWith(JustGems.SYNERGY_BOOSTER_TRAIT)
                .setName(new TextComponent("Synergy Damper (Just Gems)"))
                .setDescription(new TextComponent("Lowers synergy if it is at least 105%"))
        );

        return ret;
    }
}
