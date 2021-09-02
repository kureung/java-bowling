package bowling.state;

import bowling.pin.Pin;

public class Spare extends Finish {

  private static final String SEPARATOR = "|";
  private static final String SPARE = "/";

  private final Pin first;

  private final Pin second;

  public Spare(final Pin first, final Pin second) {
    this.first = first;
    this.second = second;
  }

  @Override
  public String score() {
    return first.totalDownPin().toString() + SEPARATOR + SPARE;
  }

  @Override
  public Pin totalPin() {
    return second.totalDownPin(first);
  }
}