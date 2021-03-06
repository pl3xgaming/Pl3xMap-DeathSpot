package net.pl3x.map.deathspots;

import net.pl3x.map.deathspots.configuration.Config;
import net.pl3x.map.deathspots.configuration.Lang;

public class Logger {
    public static java.util.logging.Logger log() {
        return DeathSpots.getInstance().getLogger();
    }

    public static void debug(String msg) {
        if (Config.DEBUG_MODE) {
            for (String part : Lang.split(msg)) {
                log().info(part);
            }
        }
    }

    public static void info(String msg) {
        for (String part : Lang.split(msg)) {
            log().info(part);
        }
    }

    public static void warn(String msg) {
        for (String part : Lang.split(msg)) {
            log().warning(part);
        }
    }

    public static void severe(String msg) {
        for (String part : Lang.split(msg)) {
            log().severe(part);
        }
    }
}
