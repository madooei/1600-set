package set;

/** Runs the Set contract suite against TransposeArraySet. */
public class TransposeArraySetTest extends SetTest {

  @Override
  protected Set<Integer> createSet() {
    return new TransposeArraySet<>();
  }
}
