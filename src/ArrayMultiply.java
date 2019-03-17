import java.util.ArrayList;
import java.util.List;

class ArrayMultiply {
    private List result;
    private final List<Integer> input;

    ArrayMultiply(ArrayList<Integer> input) {
        this.input = input;
        this.result = new ArrayList<>(input);
    }

    List compute() {
        computeRight(1, 0);
        return result;
    }

    private int computeRight(int leftProduct, int index) {
        if(index == input.size()){
            return 1;
        }
        final int rightProduct = computeRight(leftProduct * input.get(index), index + 1);
        result.set(index, leftProduct * rightProduct);
        return input.get(index) * rightProduct;
    }
}
