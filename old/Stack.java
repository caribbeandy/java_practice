class Stack {

    private int numberOfStacks = 3;
    private int stackCapacity;
    private int [] values;
    private int [] sizes;


    public Stack(int stackSize) {
        stackCapacity = stackSize;

        values = new int[stackSize*numberOfStacks];
        sizes = new int[numberOfStacks];
    }

    public boolean isFull(int stackNum) {
        return sizes[stackNum] == stackCapacity;
    }

    public void push(int stackNum, int val) throws Exception {

        // If stack full, throw exception
        if (isFull(stackNum)) {
            throw new Exception();
        }

        // Increase the size of the given stack
        sizes[stackNum]++;

        // Set the correct index
        values[indexOfTop(stackNum)]= val;
    }

    public int pop(int stackNum) throws Exception {

        if (isEmpty(stackNum)) {
            throw new Exception();
        }

        sizes[stackNum]--;

        int top = indexOfTop(stackNum);

        return values[top];
    }

    public int peek(int stackNum) throws Exception {
        if (isEmpty(stackNum)) {
            throw new Exception();
        }

        return values[indexOfTop(stackNum)];
    }

    public boolean isEmpty(int stackNum) {
        return sizes[stackNum]==0;
    }


    public int indexOfTop(int stackNum) {
        // Calculate the offset
        int offset = stackNum * stackCapacity;

        // Get how many elements in the given stack
        int size = sizes[stackNum];

        // The index will be the offset plus the size of the given stack
        return offset + size - 1;
    }

}
