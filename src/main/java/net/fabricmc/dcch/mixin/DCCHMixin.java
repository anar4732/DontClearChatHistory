package net.fabricmc.dcch.mixin;

import java.util.List;

import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

import net.minecraft.client.gui.hud.ChatHud;
import net.minecraft.client.gui.hud.ChatHudLine;

@Mixin(ChatHud.class)
public class DCCHMixin {
	@Shadow
	private @Final List<String> messageHistory;

	@Shadow
	private @Final List<ChatHudLine<?>> messages;

	@Shadow
	private @Final List<ChatHudLine<?>> visibleMessages;

	@Overwrite
	public void clear(boolean clearHistory) {
		this.visibleMessages.clear();
		this.messages.clear();
	}
}