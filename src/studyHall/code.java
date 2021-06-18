package studyHall;

public class code {

    public static void main(String[] args) {
        int [] arr1={20,-6,90,2,200,8};
        int []ages={3,6,7,8,200};
        double[] wages={5.5,6.7,9.0,12.0};
        double [] arr2={2.5,3.0,-25};
        System.out.println(minNumber(arr2)); //  double [] arr2={2.5,3.0,-25};  // result =-25.0
        System.out.println(minNumber(wages)); //    double[] wages={5.5,6.7,9.0,12.0};
        System.out.println(minNumber(arr1)); //  int [] arr1={20,-6,90,2,200,8};
        System.out.println(minNumber(ages)); //   int []ages={3,6,7,8,200};
    }
    public static double  minNumber(double [] arr1){
        double mymin=arr1[0]; // what i suppose
        int length= arr1.length;
        for (int i=0; i<length; i++){
            if (arr1[i]<mymin){
                mymin=arr1[i];
            }
        }
        return mymin;
    }
    public static int minNumber(int [] arr2){
        int  min=arr2[0];
        for( int each: arr2){
            if (each<min){
                min=each;
            }
        }
        return min;
    }

}
