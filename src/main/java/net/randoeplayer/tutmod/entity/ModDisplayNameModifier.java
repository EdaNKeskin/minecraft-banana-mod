package net.randoeplayer.tutmod.entity;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
//import net.minecraftforge.client.event.RenderNameplateEvent;

//@Mod.EventBusSubscriber(modid = tutmod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModDisplayNameModifier {
/* doesnt work, change? delete class?
    @SubscribeEvent
    public static void onRenderNameplate(RenderNameplateEvent event) {
        // Check if the rendered entity is a player
        if (event.getEntity() instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) event.getEntity();

            // Check if it's the local player
            if (player == Minecraft.getInstance().player) {
                // Modify the display name as desired
                event.setContent(new StringTextComponent("Your New Display Name"));
            }
        }
    }
    *
 */
}
