package legend.game.input;

public enum InputAction {
  BUTTON_NORTH(0x10),
  BUTTON_SOUTH(0x20),
  BUTTON_EAST(0x40),
  BUTTON_WEST(0x80),

  BUTTON_CENTER_1(0x100),
  BUTTON_CENTER_2(0x800),
  BUTTON_THUMB_1(0x200),
  BUTTON_THUMB_2(0x400),
  BUTTON_SHOULDER_LEFT_1(0x4),
  BUTTON_SHOULDER_LEFT_2(0x1),
  BUTTON_SHOULDER_RIGHT_1(0x8),
  BUTTON_SHOULDER_RIGHT_2(0x2),

  DPAD_UP(0x1000),
  DPAD_DOWN(0x4000),
  DPAD_LEFT(0x8000),
  DPAD_RIGHT(0x2000),

  JOYSTICK_LEFT_X(-1),
  JOYSTICK_LEFT_Y(-1),
  JOYSTICK_LEFT_BUTTON_UP(0x1000),
  JOYSTICK_LEFT_BUTTON_DOWN(0x4000),
  JOYSTICK_LEFT_BUTTON_LEFT(0x8000),
  JOYSTICK_LEFT_BUTTON_RIGHT(0x2000),

  JOYSTICK_RIGHT_X(-1),
  JOYSTICK_RIGHT_Y(-1),
  JOYSTICK_RIGHT_BUTTON_UP(-1),
  JOYSTICK_RIGHT_BUTTON_DOWN(-1),
  JOYSTICK_RIGHT_BUTTON_LEFT(-1),
  JOYSTICK_RIGHT_BUTTON_RIGHT(-1),
  ;

  public final int hexCode;

  InputAction(final int hexCode) {
    this.hexCode = hexCode;
  }
}
