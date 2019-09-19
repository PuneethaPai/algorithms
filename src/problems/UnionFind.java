package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class UnionFind {

    private final List<List> state;

    UnionFind(int size) {

        this.state = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            this.state.add(Arrays.asList(i));
        }
    }

    private UnionFind(List<List> state) {

        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnionFind unionFind = (UnionFind) o;
        return state.equals(unionFind.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state);
    }

    UnionFind union(int source, int target) {
        List<List> combined = state
                .stream()
                .filter(list -> list.contains(source) || list.contains(target))
                .collect(Collectors.toList());
        List<List> remaining = state.stream().filter(list -> !(list.contains(source) || list.contains(target))).collect(Collectors.toList());
        combined.addAll(remaining);
        return new UnionFind(combined);
    }
}
