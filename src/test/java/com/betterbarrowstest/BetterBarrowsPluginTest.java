package com.betterbarrowstest;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;
import com.betterbarrowsbrothers.BetterBarrowsPlugin;

public class BetterBarrowsPluginTest 
{
    public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(BetterBarrowsPlugin.class);
		RuneLite.main(args);
	}
}
