public class RightTriangle {
    public static void main(String[] args) {
        int sideOne = Integer.parseInt(args[0]);
        int sideTwo = Integer.parseInt(args[1]);
        int sideThree = Integer.parseInt(args[2]);

        int sideOneSq = sideOne * sideOne;
        int sideTwoSq = sideTwo * sideTwo;
        int sideThreeSq = sideThree * sideThree;

        int squareMin = Math.min(sideOneSq, Math.min(sideTwoSq, sideThreeSq));
        int squareMax = Math.max(sideOneSq, Math.max(sideTwoSq, sideThreeSq));
        int squareMed = (sideOneSq + sideTwoSq + sideThreeSq) - (squareMin + squareMax);

        boolean result = (sideOne >= 0 && sideTwo >= 0 && sideThree >=0 && (squareMin + squareMed) == squareMax);
        System.out.println(result);
    }
}
