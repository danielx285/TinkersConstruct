package slimeknights.tconstruct.tools.modifiers;

import slimeknights.tconstruct.library.modifiers.Modifier;

public class EmptyModifier extends Modifier {
  @Override
  public boolean shouldDisplay(boolean advanced) {
    return false;
  }
}
