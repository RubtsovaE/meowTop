public class SquarePolynom {
/*
Eee!
 */
    private double[] coef;

    public SquarePolynom(){}

    public double discriminant(){
        return Math.pow(coef[1],2)-4*coef[2]*coef[0];
    }

    public double[] solutionsOfSquarePolynom()throws IllegalArgumentException{
        if(!checkSquarePolynom()){
            throw new IllegalArgumentException("This polynomial isn't square polynomial.");
        }
        if(discriminant()<0){
            throw new IllegalArgumentException("This square polynomial hasn't roots.");
        }
        double[] roots = new double[2];
        roots[0]=((-coef[1]+Math.sqrt(discriminant()))/(2*coef[0]));
        roots[1]=((-coef[1]-Math.sqrt(discriminant()))/(2*coef[0]));
        return roots;
    }

    public double[] getCoef() {
        return coef;
    }

    public void setCoef(double[] coef) {
        this.coef = coef;
    }

    private boolean checkSquarePolynom(){
        return (coef[0]!=0);
    }
}
