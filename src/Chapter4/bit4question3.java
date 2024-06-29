package Chapter4;

public class bit4question3 {
    public static void main(String[] args) {
        int cap = 80, cbp = 72, marks = 350;//cap is candidate A percentage, while cbp is candidate b percentage.
        double moca, mocb; // moca and mocb is marks of candidate a and b respectively.

        moca = cap/100.0 * marks;
        mocb = cbp/100.0 * marks;
        System.out.println("The marks of Candidate A is: "+moca);
        System.out.println("The marks of Candidate B is: "+mocb);
    }
}
