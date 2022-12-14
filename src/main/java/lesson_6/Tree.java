package lesson_6;

import org.w3c.dom.Node;

import java.util.function.Consumer;

public interface Tree<T> {

    void add(T item);

    boolean contains(T item);

    void remove(T item);

    void dfs(Consumer<T> visitor);

    void bfs(Consumer<T> visitor);

    boolean isBalanced();

}
