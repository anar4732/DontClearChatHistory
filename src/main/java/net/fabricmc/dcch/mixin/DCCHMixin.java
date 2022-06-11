package net.fabricmc.dcch.mixin;

import net.minecraft.client.gui.hud.ChatHud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ChatHud.class)
public class DCCHMixin {
	/**
	 * @author anar4732
	 */
	@Overwrite
	public void clear(boolean clearHistory) {
		// Do not clear the chat history
	}
}