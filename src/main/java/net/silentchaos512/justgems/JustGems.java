package net.silentchaos512.justgems;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import net.silentchaos512.gear.api.traits.ITrait;
import net.silentchaos512.gear.util.DataResource;

@Mod(JustGems.NAMESPACE)
@Mod.EventBusSubscriber(modid = JustGems.NAMESPACE, bus = Mod.EventBusSubscriber.Bus.MOD)
public class JustGems {
    public static final String NAMESPACE = "just_gems";

    public static final DataResource<ITrait> SYNERGY_BOOSTER_TRAIT = DataResource.trait(new ResourceLocation(NAMESPACE, "synergy_booster"));
    public static final DataResource<ITrait> SYNERGY_DAMPER_TRAIT = DataResource.trait(new ResourceLocation(NAMESPACE, "synergy_damper"));

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        gen.addProvider(new PackMaterialsProvider(gen));
        gen.addProvider(new PackTraitsProvider(gen));
    }
}
