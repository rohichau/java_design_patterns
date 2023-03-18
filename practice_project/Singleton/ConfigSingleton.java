package Singleton;

public class ConfigSingleton {

    private static volatile ConfigSingleton config;

    private ConfigSingleton(){};

    public ConfigSingleton getInstance() {
        if (null == config) {
            synchronized (ConfigSingleton.class) {
                if (null == config) {
                    return new ConfigSingleton();
                }
            }
            return new ConfigSingleton();
        }
        return config;
    }

}
