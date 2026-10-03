package set;

/**
 * A node-backed implementation of the Set ADT.
 *
 * @param <T> the type of elements in this set.
 */
public class LinkedSet<T> implements Set<T> {

  private Node<T> head;  // the first node, or null when empty
  private int size;      // how many items the set holds

  private static class Node<T> {
    T value;
    Node<T> next;

    Node(T value) {
      this.value = value;
    }
  }

  public LinkedSet() {
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
}
