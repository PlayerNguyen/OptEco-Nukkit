package com.github.playernguyen.configuration;

import cn.nukkit.utils.Config;
import com.github.playernguyen.OptEcoN;

import java.io.File;

public abstract class YamlConfiguration {

    private final File file;
    private final Config config;

    public YamlConfiguration(String name, String parent) {
        // Data folder setup
        File dataFolder = OptEcoN.inst.getDataFolder();
        if (!dataFolder.exists() && !dataFolder.mkdir()) {
            throw new NullPointerException("Cannot find or create data folder");
        }
        // Parent
        File parentFolder = (parent == null || parent.equalsIgnoreCase(""))
                ? dataFolder : new File(dataFolder, parent);
        if (!parentFolder.exists() || !parentFolder.mkdir()) {
            throw new NullPointerException("Cannot find or create parent folder");
        }
        // Config
        this.file = new File(parentFolder, name);
        this.config = new Config(file, Config.YAML);

    }

    public File getFile() {
        return file;
    }

    public Config getConfig() {
        return config;
    }
}
