package corgitaco.notanothertempmod.data.capabilities;

import corgitaco.notanothertempmod.NotAnotherTemperatureMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = NotAnotherTemperatureMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CapabilityEvent {
    public static final ResourceLocation PLAYER_IMPACTS = new ResourceLocation(NotAnotherTemperatureMod.MOD_ID, "player_impacts");

    @SubscribeEvent
    public static void onAttachCapabilitiesToEntities(AttachCapabilitiesEvent<Entity> e) {
        Entity ent = e.getObject();
        if (ent instanceof PlayerEntity) {
            e.addCapability(PLAYER_IMPACTS, new PlayerImpactsCapabilityProvider());
        }
    }
}