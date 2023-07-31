package String;
import java.util.Scanner;
public class stringBufferToString {
    StringBuffer s;
    public String stringBufferToStringConversion(StringBuffer s){
        String result = s.toString();
        return result;
    }
    stringBufferToString(StringBuffer s){
        this.s=s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        StringBuffer sbb=new StringBuffer(sc.nextLine());
        stringBufferToString sbs =new stringBufferToString(sbb);
        String sb=sbs.stringBufferToStringConversion(sbs.s);
        sb.concat("Hello");
        System.out.println(sbb);
	System.out.println("End of program...");
    }
}


