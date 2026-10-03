package set;

/**
 * An array-backed implementation of the Set ADT.
 *
 * @param <T> the type of elements in this set.
 */
public class ArraySet<T> implements Set<T> {

  private T[] arr;   // the backing array
  private int size;  // how many items the set holds

  // arr only ever holds T, so the cast is safe.
  @SuppressWarnings("unchecked")
  public ArraySet() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Override
  public boolean contains(T item) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Override
  public boolean add(T item) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Override
  public boolean remove(T item) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Override
  public int size() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Returns the index of item, or -1 if item is not found.
  private int indexOf(T item) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Doubles the capacity. Same cast rationale as the constructor.
  @SuppressWarnings("unchecked")
  private void grow() {
    T[] bigger = (T[]) new Object[arr.length * 2];
    for (int i = 0; i < size; i++) {
      bigger[i] = arr[i];
    }
    arr = bigger;
  }
}
