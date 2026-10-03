package set;

/** Runs the Set contract suite against SortedArraySet. */
public class SortedArraySetTest extends SetTest {

  @Override
  protected Set<Integer> createSet() {
    return new SortedArraySet<>();
  }
}
