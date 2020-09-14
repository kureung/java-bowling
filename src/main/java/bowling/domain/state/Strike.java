package bowling.domain.state;

public class Strike implements State {

  private Pins first;

  public Strike(Pins first) {
    this.first = first;
  }

  @Override
  public State roll(int second) {
    throw new UnsupportedOperationException();
  }

  @Override
  public String symbol() {
    return STRIKE;
  }

  @Override
  public boolean isDone() {
    return true;
  }

  @Override
  public String toString() {
    return "Strike{" + "first=" + first + '}';
  }
}