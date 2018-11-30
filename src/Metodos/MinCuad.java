package Metodos;

/**
 *
 * @author _
 */
public class MinCuad {

    public double getY(int x, double[]y){
        double r = 0;
        int n = y.length;
        double sumX = 0;
        double sumX2 = 0;
        double sumY = 0;
        double sumXY = 0;
        for (int i = 0; i < n; i++) {
            double xtemp = i+1;
            sumX += xtemp;
            sumY += y[i];
            sumXY += (xtemp*y[i]);
            sumX2 += Math.pow(xtemp, 2);
        }
        double divisor = (n*sumX2)-(Math.pow(sumX,2));
        double m = ((n*sumXY)-(sumX*sumY))/divisor;
        double b = ((sumY*sumX2)-(sumX*sumXY))/divisor;
        r = (m*x)+b;
        return r;
    }
    
}
