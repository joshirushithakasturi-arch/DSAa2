public class SegmentTree {

    int[] tree;
    int n;

    SegmentTree(int arr[]) {

        n = arr.length;
        tree = new int[4 * n];

        build(arr, 1, 0, n - 1);
    }

    void build(int arr[],
               int node,
               int start,
               int end) {

        if (start == end)
            tree[node] = arr[start];
        else {

            int mid = (start + end) / 2;

            build(arr, node * 2,
                    start, mid);

            build(arr, node * 2 + 1,
                    mid + 1, end);

            tree[node] =
                    tree[node * 2]
                            + tree[node * 2 + 1];
        }
    }
}