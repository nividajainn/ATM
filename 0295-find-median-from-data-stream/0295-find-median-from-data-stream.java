class MedianFinder {

    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;

    public MedianFinder() {

        left = new PriorityQueue<>(Collections.reverseOrder()); // Max Heap
        right = new PriorityQueue<>();                          // Min Heap
    }

    public void addNum(int num) {

        left.add(num);

        right.add(left.remove());

        if (right.size() > left.size()) {
            left.add(right.remove());
        }
    }

    public double findMedian() {

        if (left.size() == right.size()) {
            return (left.peek() + right.peek()) / 2.0;
        }

        return left.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */