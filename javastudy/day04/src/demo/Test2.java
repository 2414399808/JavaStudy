package demo;

public class Test2 {
    public static void main(String[] args) {
        int[] facescores={15,95555,10000,20000,312,-5};
        int max=facescores[0];
        for (int i = 1; i < facescores.length; i++) {
            if(facescores[i]>max)
                max=facescores[i];

        }
        System.out.println(max);
    }
}
