import java.util.Objects;

class UnionFind {
    private final int size;

    UnionFind(int size) {

        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnionFind unionFind = (UnionFind) o;
        return size == unionFind.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }
}
