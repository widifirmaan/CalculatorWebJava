/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorws_client_application;

/**
 *
 * @author Administrator
 */
public class CalculatorWS_Client_Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int i = 3;
//        int j = 4;
//        int result = add(i, j);
//        System.out.println("Result = " + result);
try {
        int i = 3;
        int j = 4;
        int result = add(i, j);
        System.out.println("Result = " + result);
    } catch (Exception ex) {
        System.out.println("Exception: " + ex);
    }
    }

    private static int add(int i, int j) {
        calculatorws_client_application.CalculatorWS_Service service = new calculatorws_client_application.CalculatorWS_Service();
        calculatorws_client_application.CalculatorWS port = service.getCalculatorWSPort();
        return port.add(i, j);
    }

}
