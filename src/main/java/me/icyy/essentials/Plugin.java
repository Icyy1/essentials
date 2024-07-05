package me.icyy.essentials;

import me.icyy.essentials.commands.*;
import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin
{
  private static final Logger LOGGER=Logger.getLogger("essentials");

  public void onEnable()
  {
    LOGGER.info("essentials enabled");

    this.getCommand("gmc").setExecutor(new gmc());
    this.getCommand("gms").setExecutor(new gms());
    this.getCommand("heal").setExecutor(new heal());
    this.getCommand("fly").setExecutor(new fly());
  }

  public void onDisable()
  {
    LOGGER.info("essentials disabled");
  }
}