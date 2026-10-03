package set;

/** Runs the Set contract suite against MoveToFrontLinkedSet. */
public class MoveToFrontLinkedSetTest extends SetTest {

  @Override
  protected Set<Integer> createSet() {
    return new MoveToFrontLinkedSet<>();
  }
}
