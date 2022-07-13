package com.company;


import java.util.Scanner;
import java.lang.Math;

public class GradeStudent1 {
    static Scanner sc = new Scanner(System.in);
    static final int MAX_TOTAL_POINT = 100;

    // call method homeWork()
    public static void main(String[] args) {
        // method homeWork() call midTerm() and finalTerm() first
        // Call method report last
        homeWork();
    }

    public static double[] midTerm() {
        int weight;
        System.out.println("\nMidterm:");
        do {
            System.out.print("Weight (0-100)? ");
            weight = sc.nextInt();

        } while (weight < 0 || weight > 100);

        // check scoreEarn input
        int scoreEarn;
        do {
            System.out.print("Score earned? ");
            scoreEarn = sc.nextInt();
        } while (scoreEarn < 0 || scoreEarn > 100);

        // check shift input
        int shift;
        do {
            System.out.print("Were scores shifted (1=yes, 2=no)? ");
            shift = sc.nextInt();
        } while (shift != 1 && shift != 2);

        int totalPoint;
        if (shift == 1) {
            System.out.print("Score shift: ");
            int shiftAmount = sc.nextInt();
            totalPoint = shiftAmount + scoreEarn;
            if (totalPoint > MAX_TOTAL_POINT) { // sử dụng math.min()
                totalPoint = 100;
            } else {
                totalPoint = shiftAmount + scoreEarn;
            }
        } else {
            totalPoint = scoreEarn;
        }
        double weightScore = (double)totalPoint/100 * weight;
        weightScore = Math.floor(weightScore * 10) / 10;
        System.out.println("Total points = " + totalPoint + " / " + 100);
        System.out.printf("Weighted score = " + weightScore + " / " + weight);
        // return double weight score midTerm()
        return new double[] {weightScore, weight};
    }

    public static double[] finalTerm() {
        System.out.println("\nFinal:");
        int weight;
        do {
            System.out.print("Weight (0-100)? ");
            weight = sc.nextInt();

        } while (weight < 0 || weight > 100);

        int scoreEarn;
        do {
            System.out.print("Score earned? ");
            scoreEarn = sc.nextInt();
        } while (scoreEarn < 0 || scoreEarn > 100);
        // choose shift
        int shift;
        do {
            System.out.print("Were scores shifted (1=yes, 2=no)? ");
            shift = sc.nextInt();
        } while (shift != 1 && shift != 2);

        int totalPoint;
        if (shift == 1) {
            System.out.print("Score shift: ");
            int shiftAmount = sc.nextInt();
            totalPoint = shiftAmount + scoreEarn;
            totalPoint = Math.min(totalPoint, 100);
        } else {
            totalPoint = scoreEarn;
        }
        double weightScore = (double) totalPoint/100 * weight;
        weightScore = Math.floor(weightScore * 10) / 10;
        System.out.println("Total points = " + totalPoint + " / " + 100);
        System.out.printf("Weighted score = " + weightScore + " / " +  weight);
        // return double weight score midTerm()
        return new double[] {weightScore, weight};
    }

    public static void homeWork() {
        // create array midTerm and set array = return of method midTerm()
        double[] midTerm = midTerm();
        System.out.println();
        // create array midTerm and set array = return of method finalTerm()
        double[] finalTerm = finalTerm();
        System.out.println();

        System.out.println("\nHomework:");
        int weight;
        // condition if weight != 100 input again
        do {
            System.out.print("Weight (0-100)? ");
            weight = sc.nextInt();
        } while (midTerm[1] + finalTerm[1] + weight != 100);

        // condition if  variable numAssign < 0  input again
        int numAssign;
        do {
            System.out.print("Number of assignments? ");
            numAssign = sc.nextInt();
        } while (numAssign < 0);

        int max;
        int score;
        int scoreAssign=0;
        int maxAssign=0;
        // input score and max
        // score always less than max, if not again
        for (int i=0; i<numAssign; i++) {
            do {
                System.out.print("Assignment " + (i + 1) + " score and max: ");
                score = sc.nextInt();
                max = sc.nextInt();
            } while (score>max || (score<0 && max<0));
            scoreAssign += score;
            maxAssign += max;
        }
        maxAssign = Math.min(maxAssign, 150);
        int sectionQty;
        do {
            System.out.print("How many sections did you attend? ");
            sectionQty = sc.nextInt();
        } while (sectionQty < 0);
        int sectionPoint = sectionQty * 5;
        sectionPoint = Math.min(sectionPoint, 30);
        System.out.println("Section point = " + sectionPoint + " / 30");

        int totalScore = scoreAssign + sectionPoint;
        int totalMax = maxAssign + 30;
        totalScore = Math.min(totalScore, totalMax);
        System.out.println("Total points = " + totalScore + " / " + totalMax);

        // Calculator weightScore always less than weight
        // if not weightScore value equal weight
        double weightScore = (double) totalScore / totalMax * weight;
        weightScore = Math.min(weightScore, weight);
        weightScore = Math.floor(weightScore * 10) / 10;

        System.out.print("Weighted score = "+ weightScore + " / " + weight);
        System.out.println();
        report(midTerm, finalTerm, weightScore);
    }
    // show Overall percentage and GPA
    // input parameter array double a,
    public static void report(double[] midTerm, double[] finalTerm, double c) {
        double overallPer = midTerm[0] + finalTerm[0] + c;
        System.out.println();
        System.out.print("Overall percentage = " + overallPer);
        // value GPA based condition overallPer
        double GPA;
        if (overallPer == 100) {
            GPA = 4.0;
        } else if (overallPer >= 85) {
             GPA = 3.0;
         } else if (overallPer >= 75) {
             GPA = 2.0;
         } else if (overallPer >= 60) {
             GPA = 1.0;
         } else {
             GPA = 0.0;
         }

        System.out.println("\nYour grade will be at least: " + GPA);

    }
}
