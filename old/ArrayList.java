class ArrayList {

    // Internal array will be filled from indices 0 to count-1
    private Object [] data;
    private int count = 0;

    // Factor by which to increase size
    private static final int INC_SIZE = 2;

    public ArrayList() {
        this.data = new Object[this.INC_SIZE];
    }

    public int getSize() {
        return this.count;
    }

    public void add(Object o) {

        if ( this.toResize() ) {
            this.resize();
        }

        this.data[count++] = o;
    }

    public Object get(int index) {

        if ( index >= count ) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            return this.data[index];
        }
    }

    public void remove(int index) {

        if ( index >= count ) {
            throw new ArrayIndexOutOfBoundsException();
        } else {

            while( index < count-1 ) {
                this.data[index] = this.data[index+1];
                index++;
            }

            this.data[index] = null;
            count--;
        }
    }

    public void print() {
        for(int i=0; i<this.getSize(); i++){
            System.out.print(this.data[i] + " ");
        }
        System.out.println();
    }

    private boolean toResize() {
        return this.getSize() == this.data.length;
    }

    private void resize() {

        Object [] o = new Object[this.data.length*this.INC_SIZE];

        for(int i=0; i<this.getSize(); i++) {
            o[i] = this.data[i];
        }

        this.data = o;
    }

    public static void main(String [] args) {

        ArrayList test = new ArrayList();
        int initSize = 50;

        for(int i=0;i<initSize; i++){
            test.add(i);
        }

        test.print();

        // Test size/add
        assert test.getSize() == initSize;

        // Test get
        assert (int)test.get(0) == 0;
        assert (int)test.get(initSize-1) == initSize-1;

        // Test remove
        test.remove(0);
        assert (int)test.get(0) == 1;

    }
}
