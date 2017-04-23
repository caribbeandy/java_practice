import java.util.ArrayList;
class PowerSet {

    public static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set, int index) {

        if ( index == 0 ) {
            ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
            ArrayList<Integer> nested = new ArrayList<Integer>();
            nested.add(-1);
            ret.add(nested);
            return ret;
        }

        ArrayList<ArrayList<Integer>> prev = getSubsets(set, index-1);
            System.out.println(prev.size());

        for(int i=0; i<prev.size(); i++){
System.out.println(i);
            ArrayList<Integer> clone = prev.get(i);

            clone.add(set.get(i));
    
            prev.add(clone);
        }

        return prev;

    }

    public static void main(String [] args) {

        ArrayList<Integer> set = new ArrayList<Integer>();
        set.add(4);
    
        ArrayList<ArrayList<Integer>> x = getSubsets(set, 1);

        System.out.print("[");
        for(int i=0; i<x.size(); i++){

            ArrayList<Integer> tmp = x.get(i);
            System.out.print("{");
            for(int j=0; j<tmp.size(); j++){
                if ( tmp.get(j) == -1 ) {

                } else {
                    System.out.print(tmp.get(j));
                }
            }
            System.out.print("}");
        }
        System.out.print("]");

        System.out.println();

    }
}
