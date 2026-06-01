public class FenwickTree {

    int BIT[];
    int n;

    FenwickTree(int n) {
        this.n = n;
        BIT = new int[n + 1];
    }

    void update(int index, int val) {

        index++;

        while (index <= n) {

            BIT[index] += val;
            index += index & (-index);
        }
    }

    int query(int index) {

        int sum = 0;
        index++;

        while (index > 0) {

            sum += BIT[index];
            index -= index & (-index);
        }

        return sum;
    }
}