import static java.lang.System.out;

class Main{
    public static void main(String[] args){
        SubClass sc = new SubClass(5);
        sc.pattern20();
    }
}

class SubClass{
    int choice;

    SubClass(int num){
        this.choice = num;
    }

    void pattern1(){
        for(int i = 0; i < choice; i++){
            for (int j = 0; j < choice; j++){
                out.print("* ");
            }
            out.println();
        }
    }

    void pattern2(){
        for(int i = 0; i < choice; i++){
            for (int j = 0; j < choice; j++){
                if(i >= j){ out.print("* "); }
            }
            out.println();
        }
    }

    void pattern3(){
        for(int i = 0; i < choice; i++){
            for (int j = 0; j < choice; j++){
                if(i >= j){ out.print(j+1 + " "); }
            }
            out.println();
        }
    }

    void pattern4(){
        for(int i = 0; i < choice; i++){
            for (int j = 0; j <= i; j++){
                out.print(i+1 + " ");
            }
            out.println();
        }
    }

    void pattern5(){
        for(int i = 0; i < choice; i++){
            for (int j = choice; j > i; j--){
                out.print("* ");
            }
            out.println();
        }
    }

    void pattern6(){
        for(int i = choice; i >= 0; i--){
            for (int j = 0; j < i; j++){
                out.print(j+1 + " ");
            }
            out.println();
        }
    }

    void pattern7(){
        for(int i=0; i<choice; i++){
            for(int j=choice-i; j>0; j--){ out.print(" "); }
            for(int j=0; j<2*i+1; j++){ out.print("*"); }
            for(int j=choice-i; j>0; j--){ out.print(" "); }
            out.println();
        }
    }

    void pattern8(){
        for(int i=0; i<choice; i++){
            for(int j=0; j<i; j++){ out.print(" "); }
            for(int j=0; j<2*choice-(2*i+1); j++){ out.print("*"); }
            for(int j=0; j<i; j++){ out.print(" "); }
            out.println();
        }
    }

    void pattern9(){
        SubClass sc = new SubClass(choice);
        sc.pattern7();
        sc.pattern8();
    }
    
    void pattern10(){
        for(int i=1; i<2*choice; i++){
            if(i<=choice){
                for(int j=0; j<i; j++){ out.print("*"); }
            } else{
                for(int j=2*choice-i; j>0; j--){ out.print("*"); }
            }
            out.println();
        }
    }

    void pattern11(){
        for(int i=1; i<=choice; i++){
            int digit= (i%2==0) ? 0 : 1;
           for(int j=1; j<=i; j++){
            out.print(digit);
            digit=1-digit;
           }
            out.println();
        }
    }

    void pattern12(){
        for(int i=1; i<=choice; i++){
            for(int j=1; j<=i; j++){out.print(j); }
            for(int j=2*choice-2*i; j>0; j--){ out.print(" "); }
            for(int j=i; j>0; j--){ out.print(j); }
            out.println();
        }
    }

    void pattern13(){
        int count =1;
        for(int i=0; i<choice; i++){
            for(int j=0; j<=i; j++){
                out.print(count+ " ");
                count++;
            }
            out.println();
        }
    }

    void pattern14(){
        for(int i=0; i<choice; i++){
            char A = 65;
            for(int j=0; j<=i; j++){ out.print(A++ + " "); }
            out.println();
        }
    }

    void pattern15(){
        for(int i=choice; i>0; i--){
            char A = 65;
            for(int j=0; j<i; j++){ out.print(A++ + " "); }
            out.println();
        }
    }

    void pattern16(){
        char A = 65;
        for(int i=0; i<choice; i++){
            for(int j=0; j<=i; j++){ out.print(A + " "); }
            A++;
            out.println();
        }
    }

    void pattern17(){
        for(int i=0; i<choice; i++){
            char A = 65;
            for(int j=choice-i; j>0; j--){ out.print(" "); }
            for(int j=0; j<2*i+1; j++){ 
                out.print(A);  
                A = (j < i) ? ++A : --A;
            }
            for(int j=choice-i; j>0; j--){out.print(" "); }
            out.println();
        }
    }

    void pattern18(){
        for(int i=0; i<choice; i++){
            for(char ch = (char)('A'+choice-1-i); ch <= (char)('A'+choice-1); ch++){ out.print(ch + " "); }
            out.println();
        }
    }

    void pattern19(){
        for(int i=0; i<choice; i++){
            for(int j=choice-i; j>0; j--){ out.print("*"); }
            for(int j=0; j<2*i+1; j++){ out.print(" "); }
            for(int j=choice-i; j>0; j--){ out.print("*"); }
            out.println();
        }
        for(int i=0; i<choice; i++){
            for(int j=0; j<=i; j++){ out.print("*"); }
            for(int j=0; j<2*choice-(2*i+1); j++){ out.print(" "); }
            for(int j=0; j<=i; j++){ out.print("*"); }
            out.println();
        }

    }

    void pattern20(){
        for(int i=1; i<2*choice; i++){
            if(i<=choice){
                for(int j=1; j<=i; j++){out.print("*"); }
                for(int j=2*(choice-i); j>0; j--){ out.print(" "); }
                for(int j=i; j>0; j--){ out.print("*"); }
            } else{
                for(int j = 1; j <= 2 * choice - i; j++) { out.print("*"); }
                for(int j = 1; j <= 2 * (i - choice); j++) { out.print(" "); }
                for(int j = 1; j <= 2 * choice - i; j++) { out.print("*"); }
            }
            out.println();
        }
    }
}