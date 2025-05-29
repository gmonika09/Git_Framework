public class MethodOverloading {

    public int sum(int i,int j){
        return i+j;

    }

    public int sum (int i,int j,int k) {
        return (i + j + k);
    }



    public static void main(String[] args) {

         MethodOverloading md = new MethodOverloading();
        System.out.println(md.sum(7,5));
        System.out.println(md.sum(6,7,8));



    }
}
