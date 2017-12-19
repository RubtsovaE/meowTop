import static org.junit.Assert.*;


    public class SquarePolynomTest {

        private SquarePolynom squarePolynom = new SquarePolynom();

        @org.junit.Test
        public void solutionsOfSquarePolynomWhitOneRoot() throws Exception {
            double[] roots = {1., 1.};
            double[] coef = {1., -2., 1.};
            squarePolynom.setCoef(coef);
            assertArrayEquals(roots, squarePolynom.solutionsOfSquarePolynom(), 0);
        }

        @org.junit.Test
        public void solutionsOfSquarePolynomWhitTwoRoots() throws Exception {
            double[] roots = {0.5, -2.};
            double[] coef = {2., 3., -2.};
            squarePolynom.setCoef(coef);
            assertArrayEquals(roots, squarePolynom.solutionsOfSquarePolynom(), 0);
        }

        @org.junit.Test(expected = IllegalArgumentException.class)
        public void solutionsOfSquarePolynomWhitoutRoots() {
            double[] coef = {1, 1, 8};
            squarePolynom.setCoef(coef);
            squarePolynom.solutionsOfSquarePolynom();
        }

        @org.junit.Test(expected = IllegalArgumentException.class)
        public void thisPolynomIsNotSquarePolynom() {
            double[] coef = {0, 1, 8};
            squarePolynom.setCoef(coef);
            squarePolynom.solutionsOfSquarePolynom();
        }

    }

