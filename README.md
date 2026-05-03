# HashTable and Binary Search Tree Implementation

## Overview

This project provides implementations of two fundamental data structures in Java:

* Hash Table (using chaining)
* Binary Search Tree (BST)

The implementations are written from scratch without using built-in Java collection classes.

---

## Project Structure

* `MyHashTable.java` — implementation of the hash table
* `BST.java` — implementation of the binary search tree
* `Student.java` — custom key class with overridden `hashCode()`
* `Main.java` — test class

---

## Hash Table

The hash table uses **separate chaining** to handle collisions.

Implemented methods:

* `put(K key, V value)`
* `get(K key)`
* `remove(K key)`
* `contains(V value)`
* `size()`

A total of 10,000 elements are inserted to evaluate performance and distribution across buckets.

---

## Binary Search Tree

The BST is implemented using generic types where keys are comparable.

Implemented methods:

* `put(K key, V value)`
* `get(K key)`
* `delete(K key)`
* `iterator()` (in-order traversal)

The in-order traversal ensures that elements are returned in sorted order by key.

---

## Execution

To compile and run the project:

```
javac *.java
java Main
```

---

## Notes

* A custom `hashCode()` method is implemented in the `Student` class.
* Duplicate keys in the hash table overwrite existing values.
* The BST is not self-balancing.
