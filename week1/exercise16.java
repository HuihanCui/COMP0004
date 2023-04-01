
public class exercise16 {
    public boolean same(char[] a, char[] b){
        if (a.length != b.length){
            return false;
        }
        int count = 0;
        for (char i : a){
            for (int j=0; j<b.length; j++){
                if (b[j] == i){
                    b[j] = ' ';
                    count++;
                    break;
                }
            }
        }
        if (count != a.length){
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        char[] a = {'d','a','d','d'};
        char[] b = {'d','d','c','a'};
        exercise16 e = new exercise16();
        System.out.print(e.same(a,b));
    }
}
