public class Main {
    public static void main(String[] args) {

        String [] brands = {"Nike","Adidas","Reebok"};
        int [][] quartsales = {{100,150,70},{88,92,103},{75,45,90},{65,95,175}};
        String [] quarters = {"Q1","Q2","Q3","Q4"};
        //shoe brand names and the annual quartsales

        int numbrands = brands.length;
        int numquarters = quarters.length;

        //Calculations for the arrays
        int [] totals = new int[numbrands];
        double[] average = new double[numbrands];
        int[] min = new int[numbrands];
        int [] max = new int[numbrands];

        //Initializing
        for (int j = 0;j < numbrands; j++){
            min [j] = quartsales[0][j];
            max [j] = quartsales[0][j];
        }
        for (int j = 0; j < numbrands; j++) {
            int sum = 0;
            for (int i = 0; i < numquarters; i++) {
                int val = quartsales[i][j];
                sum += val;

                if (val < min[j]) {
                    min[j] = val;
                }
                if (val > max[j]) {
                    max[j] = val;
                }
            }
            totals[j] = sum;
            average[j] = (double) sum / numquarters;
        }
        System.out.println("SHOE SALES");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-11s%-12s%-12s%-12s\n", "QUARTER", brands[0], brands[1], brands[2]);
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < numquarters; i++) {
            System.out.printf("%-11s%-12d%-12d%-12d\n", quarters[i], quartsales[i][0], quartsales[i][1], quartsales[i][2]);
        }
        System.out.println("--------------------------------------------------");
        System.out.printf("%-11s%-12d%-12d%-12d\n", "TOTAL:", totals[0], totals[1], totals[2]);
        System.out.printf("%-11s%-12.1f%-12.1f%-12.1f\n", "AVERAGE:", average[0], average[1], average[2]);
        System.out.printf("%-11s%-12d%-12d%-12d\n", "MIN:", min[0], min[1], min[2]);
        System.out.printf("%-11s%-12d%-12d%-12d\n", "MAX:", max[0], max[1], max[2]);
        System.out.println("--------------------------------------------------");
    }
}