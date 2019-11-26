public class ThreadingExercise extends Thread{

	ThreadingExercise(){
        System.out.println("Threading");
    }
    
    @Override
    public void run(){
        try{
            for(int i=0; i<3; i++){
                System.out.println("Trying the run() Hellooo!!");
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
    
    @Override 
    public void finalize(){
        System.out.println("Trying the finalize() Byeee!!");
    }
    
    public static void main(String[] args) {
    	ThreadingExercise threadOne = new ThreadingExercise();
    	ThreadingExercise threadTwo = new ThreadingExercise();
        AnotherThreadExtender anotherThreadOne = new AnotherThreadExtender();
        AnotherThreadExtender anotherThreadTwo = new AnotherThreadExtender();
        threadOne.start();
        anotherThreadOne.start();
        anotherThreadTwo.start();
        threadTwo.start();
    }

}

class AnotherThreadExtender extends Thread{
    
    AnotherThreadExtender(){
        System.out.println("Started the ThreadingCLass numba2");
    }
    
    @Override
    public void run(){
        try{
            for(int i=0; i<3; i++){
                System.out.println("Try run and after do sleeppppp");
                Thread.sleep(1000);
            }
        }catch (
        		Exception e) {}
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
            System.out.println("Yessssss do the gc() !!");
            System.gc();
            System.out.println("Yess to the finalize()!!");
            System.runFinalization();
    }
}
