package com.ishland.c2me.notickvd.mixin;

import net.minecraft.server.world.ChunkLevelType;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(World.class)
public class MixinWorld {

    @Shadow @Final public boolean isClient;

    @ModifyArg(method = "markAndNotifyBlock", at = @At(value = "INVOKE", target = "Lnet/minecraft/server/world/ChunkLevelType;isAfter(Lnet/minecraft/server/world/ChunkLevelType;)Z"))
    private ChunkLevelType modifyLeastStatus(ChunkLevelType levelType) {
        return levelType.ordinal() > ChunkLevelType.FULL.ordinal() ? ChunkLevelType.FULL : levelType;
    }

}
