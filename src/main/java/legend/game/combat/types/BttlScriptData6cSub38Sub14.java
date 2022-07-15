package legend.game.combat.types;

import legend.core.memory.Value;
import legend.core.memory.types.MemoryRef;
import legend.core.memory.types.UnsignedByteRef;
import legend.core.memory.types.UnsignedIntRef;
import legend.core.memory.types.UnsignedShortRef;

public class BttlScriptData6cSub38Sub14 implements MemoryRef {
  private final Value ref;

  public final UnsignedByteRef _00;

  public final UnsignedShortRef _02;
  public final UnsignedShortRef _04;
  public final UnsignedShortRef _06;
  public final UnsignedShortRef _08;

  /** TODO */
  public final UnsignedIntRef ptr_10;

  public BttlScriptData6cSub38Sub14(final Value ref) {
    this.ref = ref;

    this._00 = ref.offset(1, 0x00L).cast(UnsignedByteRef::new);

    this._02 = ref.offset(2, 0x02L).cast(UnsignedShortRef::new);
    this._04 = ref.offset(2, 0x04L).cast(UnsignedShortRef::new);
    this._06 = ref.offset(2, 0x06L).cast(UnsignedShortRef::new);
    this._08 = ref.offset(2, 0x08L).cast(UnsignedShortRef::new);

    this.ptr_10 = ref.offset(4, 0x10L).cast(UnsignedIntRef::new);
  }

  @Override
  public long getAddress() {
    return this.ref.getAddress();
  }
}