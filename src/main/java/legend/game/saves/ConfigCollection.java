package legend.game.saves;

import legend.game.modding.events.config.ConfigUpdatedEvent;
import legend.game.modding.registries.RegistryId;

import java.util.HashMap;
import java.util.Map;

import static legend.core.GameEngine.EVENTS;
import static legend.core.GameEngine.REGISTRIES;

public class ConfigCollection {
  private final Map<RegistryId, Object> configValues = new HashMap<>();

  public <T> T getConfig(final ConfigEntry<T> config) {
    //noinspection unchecked
    return (T)this.configValues.getOrDefault(config.getRegistryId(), config.defaultValue);
  }

  public <T> void setConfig(final ConfigEntry<T> config, final T value) {
    final T oldValue = this.getConfig(config);
    this.setConfigQuietly(config, value);
    config.onChange(this, oldValue, value);
    EVENTS.postEvent(new ConfigUpdatedEvent(config));
  }

  /** Doesn't trigger onChange */
  <T> void setConfigQuietly(final ConfigEntry<T> config, final T value) {
    this.configValues.put(config.getRegistryId(), value);
  }

  public void clearConfig() {
    this.configValues.clear();
  }

  public void clearConfig(final ConfigStorageLocation storageLocation) {
    this.configValues.keySet().removeIf(id -> REGISTRIES.config.getEntry(id).get().storageLocation == storageLocation);
  }

  public void copyConfigFrom(final ConfigCollection other) {
    this.configValues.putAll(other.configValues);
  }
}
