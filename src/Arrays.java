public class Arrays {

    public static void main(String[] args)   {

        double marks1[] = new double[5];

        marks1[0] = 85;
        marks1[1] = 95;
        marks1[2] = 105;
        marks1[3] = 115;
        marks1[4] = 125;

        int marks2[] = {5, 10, 15, 20, 35};

        for(int counter1 = 0; counter1 < marks2.length ; counter1++) {
            System.out.println(marks2[counter1]);
        }
    }
}
