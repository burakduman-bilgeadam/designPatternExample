package stringBuilder;

public class StringBuilderDemo {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("Hello ");
        sb.append("Java");//now original string is changed
        sb.append(1);
        System.out.println(sb);//prints Hello Java
    }
}
