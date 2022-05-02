package net.silentchaos512.justgems;

import com.google.common.collect.Lists;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.data.DataGenerator;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.silentchaos512.gear.api.item.GearType;
import net.silentchaos512.gear.api.part.PartType;
import net.silentchaos512.gear.data.material.MaterialBuilder;
import net.silentchaos512.gear.data.material.MaterialsProvider;
import net.silentchaos512.gear.gear.material.MaterialCategories;
import net.silentchaos512.gear.gear.part.PartTextureSet;
import net.silentchaos512.gear.gear.trait.condition.GearTypeTraitCondition;
import net.silentchaos512.gear.gear.trait.condition.MaterialRatioTraitCondition;
import net.silentchaos512.gear.util.Const;

import java.util.ArrayList;
import java.util.Collection;

public class PackMaterialsProvider extends MaterialsProvider {
    public PackMaterialsProvider(DataGenerator generator) {
        super(generator, JustGems.NAMESPACE);
    }

    @Override
    protected Collection<MaterialBuilder> getMaterials() {
        Collection<MaterialBuilder> ret = Lists.newArrayList();

        ret.add(gem("agate", "Agate")
                .mainStatsCommon(384, 14, 14, 30, 1.4f)
                .mainStatsHarvest(2, 8)
                .mainStatsMelee(3, 3, 0.1f)
                .mainStatsRanged(1, 0.1f)
                .mainStatsArmor(16, 4, 6)
                .trait(PartType.MAIN, Const.Traits.SILKY, 1)
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 5)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0xE61DE6)
        );

        ret.add(gem("alexandrite", "Alexandrite")
                .mainStatsCommon(1024, 20, 15, 45, 1.2f)
                .mainStatsHarvest(2, 8)
                .mainStatsMelee(4, 3, 0.0f)
                .mainStatsRanged(4, -0.1f)
                .mainStatsArmor(14, 0, 6)
                .trait(PartType.MAIN, Const.Traits.SPOON, 1)
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 1)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0x9500A3)
        );

        ret.add(gem("amazonite", "Amazonite")
                .mainStatsCommon(1949, 94, 37, 40, 0.8f)
                .mainStatsHarvest(3, 9)
                .mainStatsMelee(4, 6, 0.0f)
                .mainStatsRanged(2, 0.0f)
                .mainStatsArmor(17, 2, 7)
                .trait(PartType.MAIN, Const.Traits.HARD, 4)
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 2)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0x28BEE0)
        );

        ret.add(gem("amber", "Amber")
                .mainStatsCommon(256, 6, 18, 30, 1.5f)
                .mainStatsHarvest(2, 5)
                .mainStatsMelee(2, 4, 0.1f)
                .mainStatsRanged(0, 0.4f)
                .mainStatsArmor(12, 0, 12)
                .trait(PartType.MAIN, Const.Traits.LIGHT, 3)
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 4)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0xE6A31D)
        );

        ret.add(gem("ametrine", "Ametrine")
                .mainStatsCommon(512, 10, 15, 45, 1.3f)
                .mainStatsHarvest(2, 8)
                .mainStatsMelee(4, 2, -0.3f)
                .mainStatsRanged(3, 0.2f)
                .mainStatsArmor(16, 4, 12)
                .trait(PartType.MAIN, Const.Traits.ACCELERATE, 1)
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 2)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0xA30052)
        );

        ret.add(gem("ammolite", "Ammolite")
                .mainStatsCommon(512, 18, 11, 60, 1.5f)
                .mainStatsHarvest(2, 12)
                .mainStatsMelee(4, 7, 0.3f)
                .mainStatsRanged(2, 0.3f)
                .mainStatsArmor(20, 4, 14)
                .trait(PartType.MAIN, Const.Traits.ANCIENT, 4)
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 1)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0xE045FF)
        );

        ret.add(gem("apatite", "Apatite")
                .mainStatsCommon(512, 8, 11, 60, 1.4f)
                .mainStatsHarvest(2, 10)
                .mainStatsMelee(3, 5, 0.0f)
                .mainStatsRanged(3, 0.1f)
                .mainStatsArmor(12, 0, 10)
                .trait(PartType.MAIN, Const.Traits.FLOATSTONER, 1)
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 3)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0x45FFD1)
        );

        ret.add(gem("aquamarine", "Aquamarine")
                .mainStatsCommon(512, 10, 12, 30, 1.3f)
                .mainStatsHarvest(2, 10)
                .mainStatsMelee(3, 4, 0.1f)
                .mainStatsRanged(3, -0.1f)
                .mainStatsArmor(14, 0, 10)
                .trait(PartType.MAIN, Const.Traits.AQUATIC, 4)
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 1)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0x1DE6E6)
        );

        ret.add(gem("benitoite", "Benitoite")
                .mainStatsCommon(768, 17, 17, 45, 1.2f)
                .mainStatsHarvest(3, 9)
                .mainStatsMelee(5, 3, 0.2f)
                .mainStatsRanged(2, 0.1f)
                .mainStatsArmor(16, 2, 4)
                .trait(PartType.MAIN, Const.Traits.CHIPPING, 4)
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 2)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0x001BA3)
        );

        ret.add(gem("black_diamond", "Black Diamond")
                .mainStatsCommon(1792, 42, 12, 45, 1.0f)
                .mainStatsHarvest(3, 10)
                .mainStatsMelee(3, 4, -0.2f)
                .mainStatsRanged(2, -0.2f)
                .mainStatsArmor(18, 2, 6)
                .trait(PartType.MAIN, Const.Traits.CRUSHING, 3)
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 1)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0x1E1E1E)
        );

        ret.add(gem("carnelian", "Carnelian")
                .mainStatsCommon(512, 12, 12, 45, 1.1f)
                .mainStatsHarvest(2, 9)
                .mainStatsMelee(2, 3, 0.0f)
                .mainStatsRanged(4, 0.0f)
                .mainStatsArmor(16, 2, 4)
                .trait(PartType.MAIN, Const.Traits.MAGMATIC, 1,
                        new GearTypeTraitCondition(GearType.TOOL),
                        new MaterialRatioTraitCondition(0.45f))
                .trait(PartType.MAIN, Const.Traits.FIERY, 1,
                        new GearTypeTraitCondition(GearType.WEAPON),
                        new MaterialRatioTraitCondition(0.45f))
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 1)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0xA30E00)
        );

        ret.add(gem("cats_eye", "Cat's Eye")
                .mainStatsCommon(1280, 30, 8, 60, 1.1f)
                .mainStatsHarvest(2, 10)
                .mainStatsMelee(4, 5, 0.1f)
                .mainStatsRanged(2, 0.2f)
                .mainStatsArmor(12, 0, 10)
                .trait(PartType.MAIN, Const.Traits.KITTY_VISION, 1,
                        new GearTypeTraitCondition(GearType.HELMET))
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 1)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0xFFC145)
        );

        ret.add(gem("chrysoprase", "Chrysoprase")
                .mainStatsCommon(768, 13, 10, 60, 1.2f)
                .mainStatsHarvest(2, 8)
                .mainStatsMelee(4, 3, 0.1f)
                .mainStatsRanged(4, -0.1f)
                .mainStatsArmor(15, 2, 8)
                .trait(PartType.MAIN, Const.Traits.TERMINUS, 1,
                        new GearTypeTraitCondition(GearType.TOOL))
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 2)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0x64FF45)
        );

        ret.add(gem("citrine", "Citrine")
                .mainStatsCommon(768, 18, 16, 45, 1.1f)
                .mainStatsHarvest(2, 10)
                .mainStatsMelee(4, 2, 0.1f)
                .mainStatsRanged(3, 0.1f)
                .mainStatsArmor(16, 2, 4)
                .trait(PartType.MAIN, Const.Traits.MIGHTY, 3,
                        new GearTypeTraitCondition(GearType.TOOL),
                        new MaterialRatioTraitCondition(0.35f))
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 2)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0xA35F00)
        );

        ret.add(gem("coral", "Coral")
                .mainStatsCommon(512, 9, 10, 60, 1.4f)
                .mainStatsHarvest(2, 10)
                .mainStatsMelee(4, 6, 0.2f)
                .mainStatsRanged(1, 0.2f)
                .mainStatsArmor(12, 0, 12)
                .trait(PartType.MAIN, Const.Traits.ANCIENT, 4)
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 2)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0xFF5545)
        );

        ret.add(gem("euclase", "Euclase")
                .mainStatsCommon(1024, 14, 15, 45, 1.4f)
                .mainStatsHarvest(3, 10)
                .mainStatsMelee(3, 5, -0.1f)
                .mainStatsRanged(4, -0.2f)
                .mainStatsArmor(14, 4, 6)
                .trait(PartType.MAIN, Const.Traits.MIGHTY, 2,
                        new GearTypeTraitCondition(GearType.TOOL),
                        new MaterialRatioTraitCondition(0.35f))
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 1)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0x006DA3)
        );

        ret.add(gem("fluorite", "Fluorite")
                .mainStatsCommon(512, 12, 12, 60, 1.1f)
                .mainStatsHarvest(2, 9)
                .mainStatsMelee(2, 3, 0.0f)
                .mainStatsRanged(4, 0.0f)
                .mainStatsArmor(16, 2, 4)
                .trait(PartType.MAIN, Const.Traits.SNOW_WALKER, 1,
                        new GearTypeTraitCondition(GearType.BOOTS))
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 3)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0x45D1FF)
        );

        ret.add(gem("galaxite", "Galaxite")
                .mainStatsCommon(400, 12, 8, 40, 1.2f)
                .mainStatsHarvest(2, 5)
                .mainStatsMelee(4, 2, 0.3f)
                .mainStatsRanged(1, 0.2f)
                .mainStatsArmor(17, 2, 2)
                .trait(PartType.MAIN, Const.Traits.SHARP, 2)
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 2)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0x4D4D4D)
        );

        ret.add(gem("garnet", "Garnet")
                .mainStatsCommon(512, 12, 12, 30, 1.2f)
                .mainStatsHarvest(2, 7)
                .mainStatsMelee(4, 3, -0.1f)
                .mainStatsRanged(1, -0.1f)
                .mainStatsArmor(16, 2, 6)
                .trait(PartType.MAIN, Const.Traits.FIERY, 2,
                        new GearTypeTraitCondition(GearType.WEAPON))
                .trait(PartType.MAIN, Const.Traits.MIGHTY, 1,
                        new GearTypeTraitCondition(GearType.TOOL),
                        new MaterialRatioTraitCondition(0.35f))
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 1)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0xE64F1D)
        );

        ret.add(gem("green_sapphire", "Green Sapphire")
                .mainStatsCommon(1024, 24, 16, 30, 1.1f)
                .mainStatsHarvest(2, 100)
                .mainStatsMelee(2, 2, 0.1f)
                .mainStatsRanged(2, 0.0f)
                .mainStatsArmor(14, 2, 8)
                .trait(PartType.MAIN, Const.Traits.TERMINUS, 1,
                        new GearTypeTraitCondition(GearType.HARVEST_TOOL))
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 1)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0x1DE61D)
        );

        ret.add(gem("heliodor", "Heliodor")
                .mainStatsCommon(384, 9, 10, 30, 1.3f)
                .mainStatsHarvest(2, 12)
                .mainStatsMelee(4, 3, 0.0f)
                .mainStatsRanged(0, 0.2f)
                .mainStatsArmor(12, 0, 6)
                .trait(PartType.MAIN, Const.Traits.CHIPPING, 2)
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 2)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0xE6C51D)
        );

        ret.add(gem("iolite", "Iolite")
                .mainStatsCommon(768, 20, 11, 45, 1.0f)
                .mainStatsHarvest(2, 6)
                .mainStatsMelee(2, 4, 0.0f)
                .mainStatsRanged(0, 0.0f)
                .mainStatsArmor(20, 4, 6)
                .trait(PartType.MAIN, Const.Traits.STELLAR, 2)
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 1)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0x5F00A3)
        );

        ret.add(gem("jade", "Jade")
                .mainStatsCommon(512, 17, 14, 60, 1.3f)
                .mainStatsHarvest(2, 7)
                .mainStatsMelee(5, 5, 0.0f)
                .mainStatsRanged(1, 0.3f)
                .mainStatsArmor(18, 4, 14)
                .trait(PartType.MAIN, Const.Traits.CRUSHING, 3)
                .trait(PartType.MAIN, Const.Traits.JAGGED, 2)
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 2)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0xA2FF45)
        );

        ret.add(gem("jasper", "Jasper")
                .mainStatsCommon(512, 14, 16, 45, 1.2f)
                .mainStatsHarvest(2, 7)
                .mainStatsMelee(3, 3, 0.0f)
                .mainStatsRanged(1, -0.1f)
                .mainStatsArmor(18, 4, 8)
                .trait(PartType.MAIN, Const.Traits.RACKER, 1,
                        new GearTypeTraitCondition(GearType.HARVEST_TOOL))
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 2)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0xA38800)
        );

        ret.add(gem("kunzite", "Kunzite")
                .mainStatsCommon(768, 15, 10, 60, 1.2f)
                .mainStatsHarvest(2, 8)
                .mainStatsMelee(6, 5, -0.2f)
                .mainStatsRanged(1, 0.1f)
                .mainStatsArmor(18, 2, 8)
                .trait(PartType.MAIN, Const.Traits.SILKY, 1)
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 2)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0xFF45E0)
        );

        ret.add(gem("kyanite", "Kyanite")
                .mainStatsCommon(1536, 28, 14, 60, 1.2f)
                .mainStatsHarvest(3, 14)
                .mainStatsMelee(5, 7, 0.3f)
                .mainStatsRanged(2, 0.2f)
                .mainStatsArmor(17, 2, 8)
                .trait(PartType.MAIN, Const.Traits.STELLAR, 3)
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 2)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0x4583FF)
        );

        ret.add(gem("lepidolite", "Lepidolite")
                .mainStatsCommon(256, 6, 14, 45, 1.3f)
                .mainStatsHarvest(2, 4)
                .mainStatsMelee(3, 7, 0.1f)
                .mainStatsRanged(2, 0.0f)
                .mainStatsArmor(20, 4, 10)
                .trait(PartType.MAIN, Const.Traits.CURE_WITHER, 1)
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 4)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0xA3007A)
        );

        ret.add(gem("lonsdaleite", "Lonsdaleite")
                .mainStatsCommon(2000, 62, 22, 60, 0.9f)
                .mainStatsHarvest(4, 15)
                .mainStatsMelee(6, 3, 0.2f)
                .mainStatsRanged(4, 0.0f)
                .mainStatsArmor(24, 8, 4)
                .trait(PartType.MAIN, Const.Traits.STURDY, 2)
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 2)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0xFC7758)
        );

        ret.add(gem("malachite", "Malachite")
                .mainStatsCommon(512, 14, 14, 45, 1.2f)
                .mainStatsHarvest(2, 8)
                .mainStatsMelee(4, 2, 0.3f)
                .mainStatsRanged(2, 0.2f)
                .mainStatsArmor(18, 2, 8)
                .trait(PartType.MAIN, Const.Traits.ERODED, 2)
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 3)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0x00A336)
        );

        ret.add(gem("moldavite", "Moldavite")
                .mainStatsCommon(512, 14, 14, 45, 1.4f)
                .mainStatsHarvest(2, 8)
                .mainStatsMelee(4, 2, 0.3f)
                .mainStatsRanged(3, 0.0f)
                .mainStatsArmor(18, 2, 8)
                .trait(PartType.MAIN, Const.Traits.MIGHTY, 3,
                        new GearTypeTraitCondition(GearType.TOOL))
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 3)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0x88A300)
        );

        ret.add(gem("moonstone", "Moonstone")
                .mainStatsCommon(768, 16, 20, 45, 1.1f)
                .mainStatsHarvest(2, 8)
                .mainStatsMelee(3, 3, -0.2f)
                .mainStatsRanged(3, 0.1f)
                .mainStatsArmor(14, 0, 10)
                .trait(PartType.MAIN, Const.Traits.CRACKLER, 1,
                        new GearTypeTraitCondition(GearType.HARVEST_TOOL))
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 2)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0x898989)
        );

        ret.add(gem("morganite", "Morganite")
                .mainStatsCommon(512, 14, 12, 30, 1.3f)
                .mainStatsHarvest(2, 9)
                .mainStatsMelee(4, 2, -0.1f)
                .mainStatsRanged(2, 0.1f)
                .mainStatsArmor(14, 0, 8)
                .trait(PartType.MAIN, Const.Traits.CHIPPING, 2)
                .trait(PartType.MAIN, Const.Traits.LUCKY, 2)
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 2)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0xFF88FE)
        );

        ret.add(gem("onyx", "Onyx")
                .mainStatsCommon(256, 5, 8, 30, 1.0f)
                .mainStatsHarvest(2, 8)
                .mainStatsMelee(6, 2, -0.3f)
                .mainStatsRanged(0, -0.2f)
                .mainStatsArmor(12, 0, 4)
                .trait(PartType.MAIN, Const.Traits.ERODED, 1)
                .trait(PartType.MAIN, JustGems.SYNERGY_DAMPER_TRAIT, 2)
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 3)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0x2F2F2F)
        );

        ret.add(gem("opal", "Opal")
                .mainStatsCommon(384, 9, 13, 30, 1.1f)
                .mainStatsHarvest(2, 8)
                .mainStatsMelee(3, 5, -0.3f)
                .mainStatsRanged(0, 0.3f)
                .mainStatsArmor(16, 2, 10)
                .trait(PartType.MAIN, JustGems.SYNERGY_BOOSTER_TRAIT, 2)
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 2)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0xE4E4E4)
        );

        ret.add(gem("pearl", "Pearl")
                .mainStatsCommon(512, 14, 17, 60, 1.4f)
                .mainStatsHarvest(2, 8)
                .mainStatsMelee(4, 5, 0.3f)
                .mainStatsRanged(2, 0.2f)
                .mainStatsArmor(26, 4, 10)
                .trait(PartType.MAIN, Const.Traits.ADAMANT, 2,
                        new GearTypeTraitCondition(GearType.ARMOR))
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 3)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0xE2E8F1)
        );

        ret.add(gem("peridot", "Peridot")
                .mainStatsCommon(512, 10, 14, 30, 1.2f)
                .mainStatsHarvest(2, 6)
                .mainStatsMelee(4, 3, -0.4f)
                .mainStatsRanged(2, -0.2f)
                .mainStatsArmor(14, 0, 6)
                .trait(PartType.MAIN, Const.Traits.TERMINUS, 1,
                        new GearTypeTraitCondition(GearType.TOOL),
                        materialCountOrRatio(2, 0.5f))
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 2)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0xA3E61D)
        );

        ret.add(gem("phosphophyllite", "Phosphophyllite")
                .mainStatsCommon(384, 6, 20, 30, 1.2f)
                .mainStatsHarvest(2, 11)
                .mainStatsMelee(2, 5, 0.3f)
                .mainStatsRanged(2, 0.3f)
                .mainStatsArmor(10, 0, 8)
                .trait(PartType.MAIN, Const.Traits.SYNERGISTIC, 4)
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 4)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0x1DE682)
        );

        ret.add(gem("pyrope", "Pyrope")
                .mainStatsCommon(1024, 25, 12, 60, 1.2f)
                .mainStatsHarvest(2, 9)
                .mainStatsMelee(7, 3, 0.0f)
                .mainStatsRanged(2, 0.0f)
                .mainStatsArmor(10, 2, 8)
                .trait(PartType.MAIN, Const.Traits.FLAME_WARD, 1,
                        new GearTypeTraitCondition(GearType.ARMOR),
                        materialCountOrRatio(3, 0.33f))
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 1)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0xFF4574)
        );

        ret.add(gem("rose_quartz", "Rose Quartz")
                .mainStatsCommon(1024, 20, 20, 60, 1.2f)
                .mainStatsHarvest(2, 10)
                .mainStatsMelee(5, 4, 0.0f)
                .mainStatsRanged(2, -0.1f)
                .mainStatsArmor(15, 0, 10)
                .trait(PartType.MAIN, Const.Traits.LUSTROUS, 3,
                        new GearTypeTraitCondition(GearType.HARVEST_TOOL))
                .trait(PartType.MAIN, Const.Traits.CHIPPING, 1)
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 2)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0xFF78B6)
        );

        ret.add(gem("ruby", "Ruby")
                .mainStatsCommon(1024, 24, 10, 30, 1.1f)
                .mainStatsHarvest(2, 8)
                .mainStatsMelee(5, 2, -0.2f)
                .mainStatsRanged(1, -0.2f)
                .mainStatsArmor(14, 2, 4)
                .trait(PartType.MAIN, Const.Traits.SHARP, 4,
                        new GearTypeTraitCondition(GearType.TOOL))
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 1)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0xE61D1D)
        );

        ret.add(gem("sapphire", "Sapphire")
                .mainStatsCommon(1024, 20, 10, 30, 1.1f)
                .mainStatsHarvest(2, 8)
                .mainStatsMelee(4, 4, -0.2f)
                .mainStatsRanged(1, -0.2f)
                .mainStatsArmor(16, 2, 4)
                .trait(PartType.MAIN, Const.Traits.SHARP, 4,
                        new GearTypeTraitCondition(GearType.TOOL))
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 1)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0x1D1DE6)
        );

        ret.add(gem("sodalite", "Sodalite")
                .mainStatsCommon(768, 15, 14, 60, 1.3f)
                .mainStatsHarvest(2, 9)
                .mainStatsMelee(4, 4, 0.0f)
                .mainStatsRanged(3, -0.1f)
                .mainStatsArmor(12, 0, 8)
                .trait(PartType.MAIN, Const.Traits.CHILLED, 4,
                        new GearTypeTraitCondition(GearType.WEAPON))
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 2)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0x5445FF)
        );

        ret.add(gem("spinel", "Spinel")
                .mainStatsCommon(1024, 26, 18, 45, 1.2f)
                .mainStatsHarvest(2, 8)
                .mainStatsMelee(5, 2, -0.3f)
                .mainStatsRanged(2, -0.2f)
                .mainStatsArmor(20, 4, 6)
                .trait(PartType.MAIN, Const.Traits.CRUSHING, 3)
                .trait(PartType.MAIN, Const.Traits.ERODED, 2)
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 2)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0xA34400)
        );

        ret.add(gem("sunstone", "Sunstone")
                .mainStatsCommon(768, 15, 16, 60, 1.1f)
                .mainStatsHarvest(3, 8)
                .mainStatsMelee(6, 6, -0.1f)
                .mainStatsRanged(3, 0.1f)
                .mainStatsArmor(14, 2, 8)
                .trait(PartType.MAIN, Const.Traits.IGNITE, 1,
                        new GearTypeTraitCondition(GearType.TOOL),
                        new MaterialRatioTraitCondition(0.5f))
                .trait(PartType.MAIN, Const.Traits.LUSTROUS, 3)
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 2)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0xFF7445)
        );

        ret.add(gem("tanzanite", "Tanzanite")
                .mainStatsCommon(512, 15, 12, 30, 1.3f)
                .mainStatsHarvest(2, 6)
                .mainStatsMelee(3, 4, -0.3f)
                .mainStatsRanged(3, -0.3f)
                .mainStatsArmor(18, 2, 4)
                .trait(PartType.MAIN, Const.Traits.ADAMANT, 1)
                .trait(PartType.MAIN, Const.Traits.RUSTIC, 3)
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 2)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0x601DE6)
        );

        ret.add(gem("tektite", "Tektite")
                .mainStatsCommon(768, 18, 13, 60, 1.1f)
                .mainStatsHarvest(2, 9)
                .mainStatsMelee(5, 4, 0.0f)
                .mainStatsRanged(3, 0.0f)
                .mainStatsArmor(22, 4, 8)
                .trait(PartType.MAIN, Const.Traits.JAGGED, 4)
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 3)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0x8F7C6B)
        );

        ret.add(gem("topaz", "Topaz")
                .mainStatsCommon(768, 21, 10, 30, 1.1f)
                .mainStatsHarvest(2, 9)
                .mainStatsMelee(4, 2, -0.1f)
                .mainStatsRanged(2, -0.1f)
                .mainStatsArmor(20, 4, 6)
                .trait(PartType.MAIN, Const.Traits.LUSTROUS, 2,
                        new GearTypeTraitCondition(GearType.TOOL))
                .trait(PartType.MAIN, Const.Traits.REFRACTIVE, 1,
                        materialCountOrRatio(3, 0.5f))
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 1)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0xE6711D)
        );

        ret.add(gem("tourmaline", "Tourmaline")
                .mainStatsCommon(800, 27, 22, 45, 1.3f)
                .mainStatsHarvest(3, 8)
                .mainStatsMelee(0.5f, 1.5f, 0.0f)
                .mainStatsRanged(0, 0.0f)
                .mainStatsArmor(20, 0, 10)
                .trait(PartType.MAIN, Const.Traits.ERODED, 4)
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 2)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0xEE2386)
        );

        ret.add(gem("turquoise", "Turquoise")
                .mainStatsCommon(512, 11, 15, 45, 1.1f)
                .mainStatsHarvest(2, 9)
                .mainStatsMelee(3, 3, -0.1f)
                .mainStatsRanged(3, 0.3f)
                .mainStatsArmor(16, 2, 10)
                .trait(PartType.MAIN, Const.Traits.CHILLED, 2,
                        new GearTypeTraitCondition(GearType.WEAPON))
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 3)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0x00A388)
        );

        ret.add(gem("yellow_diamond", "Yellow Diamond")
                .mainStatsCommon(1792, 42, 18, 60, 1.1f)
                .mainStatsHarvest(4, 9)
                .mainStatsMelee(5, 4, 0.2f)
                .mainStatsRanged(3, 0.0f)
                .mainStatsArmor(20, 4, 6)
                .trait(PartType.MAIN, Const.Traits.MIGHTY, 4,
                        new GearTypeTraitCondition(GearType.TOOL))
                .trait(PartType.MAIN, Const.Traits.CRUSHING, 3,
                        new GearTypeTraitCondition(GearType.ARMOR))
                .trait(PartType.MAIN, JustGems.SYNERGY_DAMPER_TRAIT, 1)
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 1)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0xFFFF45)
        );

        ret.add(gem("zircon", "Zircon")
                .mainStatsCommon(768, 15, 13, 45, 1.3f)
                .mainStatsHarvest(2, 9)
                .mainStatsMelee(3, 5, -0.3f)
                .mainStatsRanged(2, 0.3f)
                .mainStatsArmor(16, 2, 6)
                .trait(PartType.MAIN, Const.Traits.ERODED, 3)
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 2)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0xA3A300)
        );

        ret.add(gem("zirconia", "Zirconia")
                .mainStatsCommon(1000, 31, 15, 50, 1.1f)
                .mainStatsHarvest(3, 10)
                .mainStatsMelee(5, 4, 0.1f)
                .mainStatsRanged(2, 0.0f)
                .mainStatsArmor(20, 6, 3)
                .trait(PartType.MAIN, Const.Traits.FLOATSTONER, 1,
                        new GearTypeTraitCondition(GearType.TOOL),
                        new MaterialRatioTraitCondition(0.7f))
                .trait(PartType.MAIN, Const.Traits.BRITTLE, 4)
                .displayAll(PartTextureSet.HIGH_CONTRAST_WITH_HIGHLIGHT, 0xEEEEEE)
        );

        return ret;
    }

    private MaterialBuilder gem(String name, String nameText) {
        return new MaterialBuilder(modId(name), 3, ItemTags.create(new ResourceLocation("forge", "gems/" + name)))
                .name(new TextComponent(nameText))
                .categories(MaterialCategories.GEM);
    }
}
