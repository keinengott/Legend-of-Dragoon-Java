package legend.game.characters;

import legend.game.combat.bobj.BattleObject27c;

import java.util.HashMap;
import java.util.Map;

public class StatCollection {
  private final Map<StatType, Stat> stats = new HashMap<>();

  public StatCollection(final StatType... stats) {
    for(final StatType stat : stats) {
      this.stats.put(stat, stat.make(this));
    }
  }

  public <T extends Stat> T getStat(final StatType<T> type) {
    //noinspection unchecked
    return (T)this.stats.get(type);
  }

  public void turnFinished(final BattleObject27c bobj) {
    for(final Stat stat : this.stats.values()) {
      stat.turnFinished(bobj);
    }
  }
}
