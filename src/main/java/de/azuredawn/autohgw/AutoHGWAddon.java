package de.azuredawn.autohgw;

import net.labymod.api.addon.Addon;

public class AutoHGWAddon extends Addon {
    @Override
    protected void enable() {
        System.out.println("Enabled");
    }

    @Override
    protected void disable() {
        System.out.println("Disabled");
    }
}
