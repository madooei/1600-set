# Set

The `Set` ADT with five implementations: a linked list, an unsorted array, each of those two with a self-organizing heuristic (move-to-front and transpose), and a sorted array that searches with binary search. A JUnit suite checks all five implementations against the same contract.

## Prerequisites

- JDK 17+
- The JUnit jar is already vendored in `lib/`; there is nothing to download.

## Repository layout

```plaintext
code/
  README.md
  .gitignore
  lib/
    junit-platform-console-standalone-6.1.0.jar
  src/
    main/
      set/
        Set.java                        # the Set ADT contract
        LinkedSet.java                  # node-backed Set
        ArraySet.java                   # array-backed Set
        MoveToFrontLinkedSet.java       # LinkedSet with the move-to-front heuristic
        TransposeArraySet.java          # ArraySet with the transpose heuristic
        SortedArraySet.java             # sorted-array Set
        Main.java                       # demo entry point (the username example)
    test/
      set/
        SetTest.java                    # abstract: the Set contract suite
        LinkedSetTest.java              # runs the suite against LinkedSet
        ArraySetTest.java               # runs the suite against ArraySet
        MoveToFrontLinkedSetTest.java   # runs the suite against MoveToFrontLinkedSet
        TransposeArraySetTest.java      # runs the suite against TransposeArraySet
        SortedArraySetTest.java         # runs the suite against SortedArraySet
  scripts/
    run.sh                              # compile and run the Set demo (set.Main)
    test.sh                             # compile and run every JUnit test
```

## How to compile and run

- `scripts/test.sh` — compiles everything and runs the full JUnit suite.
- `scripts/test.sh set.ArraySetTest` — compiles everything and runs only that test class. Use this while you are working on one class and the others are still empty.
- `scripts/run.sh` — compiles everything and runs the `Main` demo.

## What's here

- `set.Set<T>` — the Set contract: `add`, `remove`, `contains`, and `size`.
- `set.LinkedSet<T>` — the node-backed implementation, which adds new items at the head of the list.
- `set.ArraySet<T>` — the array-backed implementation, which removes an item by moving the last item into its slot.
- `set.MoveToFrontLinkedSet<T>` — a `LinkedSet` whose `contains` moves the item it finds to the head of the list.
- `set.TransposeArraySet<T>` — an `ArraySet` whose `contains` swaps the item it finds one slot toward the front.
- `set.SortedArraySet<T>` — the sorted-array implementation, whose `contains` uses binary search. The element type must be `Comparable`.
- `set.Main` — a runnable demo of the username example, run on all five implementations.
- `set.SetTest` — the abstract contract suite. It checks only `contains` and `size`, because a set has no order to check.
- `set.LinkedSetTest`, `set.ArraySetTest`, `set.MoveToFrontLinkedSetTest`, `set.TransposeArraySetTest`, `set.SortedArraySetTest` — each runs the contract suite against one implementation.

## The heuristic classes

The chapter applies move-to-front to the `contains` method of `LinkedSet`, and transpose to the `contains` method of `ArraySet`. This code does not change those two classes. It puts each heuristic in a class of its own, `MoveToFrontLinkedSet` and `TransposeArraySet`, so you have both versions of each implementation, with and without the heuristic. Apart from `contains` (and the `moveToFront` helper), the operations of each heuristic class are the same as those of the class it is based on.
