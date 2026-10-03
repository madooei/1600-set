package set;

/**
 * An array-backed implementation of the Set ADT that uses the transpose heuristic.
 *
 * @param <T> the type of elements in this set.
 */
public class TransposeArraySet<T> implements Set<T> {

  private T[] arr;   // the backing array
  private int size;  // how many items the set holds

  // arr only ever holds T, so the cast is safe.
  @SuppressWarnings("unchecked")
  public TransposeArraySet() {
    arr = (T[]) new Object[10];  // start with room for 10 items
    size = 0;                    // the set starts empty
  }

  @Override
  public boolean contains(T item) {
    if (item == null) {
      throw new IllegalArgumentException();
    }
    int i = indexOf(item);
    if (i == -1) {
      return false;
    }
    if (i > 0) {
      T temp = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = temp;  // swap the found item one step toward the front
    }
    return true;
  }

  @Override
  public boolean add(T item) {
    if (item == null) {
      throw new IllegalArgumentException();
    }
    if (indexOf(item) != -1) {
      return false;    // already present; a set holds no duplicates
    }
    if (size == arr.length) {
      grow();          // grow when the array is full
    }
    arr[size] = item;  // append at the end
    size++;
    return true;
  }

  @Override
  public boolean remove(T item) {
    if (item == null) {
      throw new IllegalArgumentException();
    }
    int i = indexOf(item);
    if (i == -1) {
      return false;          // not present; nothing changed
    }
    arr[i] = arr[size - 1];  // move the last item into the gap
    arr[size - 1] = null;    // clear the vacated slot
    size--;
    return true;
  }

  @Override
  public int size() {
    return size;
  }

  // Returns the index of item, or -1 if item is not found.
  private int indexOf(T item) {
    for (int i = 0; i < size; i++) {
      if (arr[i].equals(item)) {
        return i;
      }
    }
    return -1;
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
