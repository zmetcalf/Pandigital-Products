import java.util.ArrayList;

public class PandigitalProducts {

    private ArrayList<Integer> productList = new ArrayList<Integer>();

    public PandigitalProducts() {       
    }
    
    public void calculatePandigitalProducts() {
        int product;
        
        for(int multiplicand = 1; multiplicand < 31427; multiplicand++) {
            for(int multiplier = 1; multiplier < 31427; multiplier++) {
                product = multiplicand * multiplier;
                if(checkPandigital(multiplicand, multiplier, product)) {
                    addToArrayList(product);
                }
            } // End multiplier for-loop   
        } // End multiplicand for-loop    
    }
    
    public void printPandigitalProductsSum() {
        int sum = 0;
    
        for(int i = 0; i < productList.size(); i++) {
            sum += productList.get(i);
        }
        
        System.out.println("The sum of the pandigital products is: " + sum);
    }
    
    private boolean checkPandigital(int multiplicand, int multiplier,
                                     int product) {
        String checkPan;
        
        checkPan = Integer.toString(multiplicand) + 
                            Integer.toString(multiplier) + 
                            Integer.toString(product);
        
        if(checkPan.length() != 9) {
            return false;
        }
        
        for(int i = 1; i <= 9; i++) {
            if(checkPan.contains(Integer.toString(i)) == false) {
                return false;
            }
        }
        
        return true;
    }
    
    private void addToArrayList(int product) {
        if(productList.contains(product) == false) {
            productList.add(product);
        }
    }
}
