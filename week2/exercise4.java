import java.util.*;

//我选择用了node，其实hashmap应该也行

public class exercise4 {
    int[][] exchanges = new int[][]{{1,3}, {0,2,4}, {1,5}, {0,4,6}, {1,3,5,7}, {2,4,8}, {3,7}, {4,6,8}, {5,7}};
    String init = "";
    String target = "123456780";
    public String exchange(String s, int now, int goal){
        char[] chars = s.toCharArray();
        char temp = chars[now];
        chars[now] = chars[goal];
        chars[goal] = temp;
        return new String(chars);
    }
    public int slide(){
        Queue<Node> q = new ArrayDeque<>();
        Set<String> visited = new HashSet<>();

        Node start = new Node(init);
        q.offer(start);

        int step = 0;
        while (!q.isEmpty()){
            int size = q.size();
            for (int i=0; i<size; i++){
                Node current = q.poll();
                if (current.value.equals(target)){
                    route(current);
                    return step;
                }
                int position = current.value.indexOf('0');
                int[] ex = exchanges[position];
                for (int j : ex){
                    String s = exchange(current.value, position, j);
                    Node now = new Node(s);
                    now.previous = current;
                    if (!visited.contains(s)){
                        q.offer(now);
                        visited.add(s);
                    }
                }
            }
            step++;
        }
        return -1;
    }

    public void route(Node n){
        ArrayList<Node> nodes = new ArrayList<>();
        while (n.previous != null){
            nodes.add(0, n);
            n = n.previous;
        }
        for (Node path : nodes){
            display(path.value);
        }
    }

    public void getInput(){
        Input in = new Input();
        System.out.print("Enter the initial board:");
        init = in.nextLine();
    }
    public void display(String s){
        int count = 0;
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                String c = s.substring(count, count+1);
                if (c.compareTo("0") != 0){
                    System.out.print(c + "  ");
                }
                else{
                    System.out.print(" " + "  ");
                }
                count ++;
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    public static void main(String[] args){
        exercise4 e = new exercise4();
        e.getInput();
        e.display(e.init);
        System.out.print(e.slide());
    }
}
