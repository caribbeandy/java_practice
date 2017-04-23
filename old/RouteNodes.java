class RouteNodes {

    enum State{Visiting, Visited, Unvisited;}

    public static boolean search(Graph g, Node start, Node end) {

        if ( start == end ) {
            return true;
        }

        for(Node n: g.getNodes()) {
            n.state = State.Unvisited;
        }

        LinkedList<Node> queue = new LinkedList<Node>();

        start.state = State.Visiting;
        queue.add(start);

        Node tmp;

        while(!queue.empty()) {
           
           tmp = queue.removeFirst();

           if (tmp==end) {
                return true;
           }

           for(Node n: tmp.getAdjacent()) {
                if (n.state==State.Unvisited) {
                    n.state = State.Visiting;
                    queue.add(n);
                }
           }

           tmp.state = State.Visited;
        }

        return false;

    }

}
