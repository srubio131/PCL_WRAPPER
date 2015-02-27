
public class runme {
    
    static {
	System.loadLibrary("PCL_Wrapper");
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
            // TODO Auto-generated method stub
            System.out.println("Begin Testing:");
            System.out.println("Testing How Features work tutorial program1");
            How_Features_work_tutorial_test.program1_test();
            System.out.println("Testing How Features work tutorial program2");
            How_Features_work_tutorial_test.program2_test();
            System.out.println("Testing How Features work tutorial program3");
            How_Features_work_tutorial_test.program3_test();
            
            System.out.println("-------------------------------------------");
            System.out.println("Nube de puntos XYZRGBA");
            How_Features_work_tutorial_test.program4_test();
    }

}
