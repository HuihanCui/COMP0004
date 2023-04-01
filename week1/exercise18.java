public class exercise18 {
    public int getInput(){
        Input in = new Input();
        System.out.print("Type in your number:");
        return in.nextInt();
    }
    public void standard(int n){
        if (n==0){
            System.out.print("zero ");
        }
        if (n==1){
            System.out.print("one ");
        }
        if (n==2){
            System.out.print("two ");
        }
        if (n==3){
            System.out.print("three ");
        }
        if (n==4){
            System.out.print("four ");
        }
        if (n==5){
            System.out.print("five ");
        }
        if (n==6){
            System.out.print("six ");
        }
        if (n==7){
            System.out.print("seven ");
        }
        if (n==8){
            System.out.print("eight ");
        }
        if (n==9){
            System.out.print("nine ");
        }
        if (n==10){
            System.out.print("ten ");
        }
        if (n==11){
            System.out.print("eleven ");
        }
        if (n==12){
            System.out.print("twelve ");
        }
        if (n==13){
            System.out.print("thirteen ");
        }
        if (n==14){
            System.out.print("fourteen ");
        }
        if (n==15){
            System.out.print("fifteen ");
        }
        if (n==16){
            System.out.print("sixteen ");
        }
        if (n==17){
            System.out.print("seventeen ");
        }
        if (n==18){
            System.out.print("eighteen ");
        }
        if (n==19){
            System.out.print("nineteen ");
        }
        if (n==20){
            System.out.print("twenty ");
        }
        if (n==30){
            System.out.print("thirty ");
        }
        if (n==40){
            System.out.print("fourty ");
        }
        if (n==50){
            System.out.print("fifty ");
        }
        if (n==60){
            System.out.print("sixty ");
        }
        if (n==70){
            System.out.print("seventy ");
        }
        if (n==80){
            System.out.print("eighty ");
        }
        if (n==90){
            System.out.print("ninety ");
        }
        if (n==100){
            System.out.print("hundred ");
        }
    }
    public void read(int n){
        int i;
        if (n<20){
            standard(n);
        }
        if (n<100 && n>19){
            i = n%10;
            standard(n-i);
            if (i!=0){
                standard(i);
            }
        }
        if (n>=100){
            i = n%100;
            n = (n-i)/100;
            standard(n);
            standard(100);
            if (i!=0){
                System.out.print("and ");
                read(i);
            }
        }
    }
    public static void main(String[] args){
        exercise18 e = new exercise18();
        e.read(e.getInput());
    }
}
