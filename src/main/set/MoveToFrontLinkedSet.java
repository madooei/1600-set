package set;

/**
 * A node-backed implementation of the Set ADT that uses the move-to-front heuristic.
 *
 * @param <T> the type of elements in this set.
 */
public class MoveToFrontLinkedSet<T> implements Set<T> {

  private Node<T> head;  // the first node, or null when empty
  private int size;      // how many items the set holds

  private static class Node<T> {
    T value;
    Node<T> next;

    Node(T value) {
      this.value = value;
    }
  }

  public MoveToFrontLinkedSet() {
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

  // Moves node to the head of the list. previous is the node before it,
  // or null if node is already the head.
  private void moveToFront(Node<T> node, Node<T> previous) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }
}
