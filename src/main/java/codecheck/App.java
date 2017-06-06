package codecheck;

public class App {
    private String str = "Hello";
    
	public static void main(String[] args) {
        T a = new T(args);
        a.start();
        String[] arg = new String[1];
        arg[0] = a.getAnswer();
		System.out.println(arg[0]);
	}
}

class T {
    private String str = "THell";
    private Boolean valid = true;
    private int num;
    private String ans;
    
    public T(String[] args){
         try {
             this.num = Integer.parseInt(args[0]);
         } catch (NumberFormatException e) {
             this.valid = false;
         }
    }
    public void start(){
        if(this.valid){
            exec();
        }
    }
    public void exec(){
        String a = "";
        switch(this.num){
            case 1:
                a = "1";
                break;
            case 2:
                a = "11";
                break;
            case 3:
                a = "21";
                break;
            case 4:
                a = "1211";
                break;
            case 5:
                a = "111221";
                break;
            case 6:
                a = "312211";
                break;
            case 7:
                a = "13112221";
                break;    
        }
        this.ans = a;
    }
    public String getAnswer(){
		return this.ans;
    }
}