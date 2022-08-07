package com.ishland.c2me.opts.chunk_serializer.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.gen.Accessor;

@Pseudo
@Mixin(remap = false, targets = "ca.spottedleaf.starlight.common.light.SWMRNibbleArray$SaveState")
public interface SaveStateAccessor {
    @Accessor(remap = false)
    byte[] getData();

    @Accessor(remap = false)
    int getState();
}
