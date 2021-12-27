class NumberPrinter {
    void printNumber(int a){
        System.out.println(a);
    }

    void printNumber(int x, int b){
        printNumber(x);
        System.out.println(b);
    }

    void printNumber(int x, int y, int c){
        printNumber(x,y);
        System.out.println(c);
    }
}
