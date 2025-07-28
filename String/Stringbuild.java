public class Stringbuild{
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
//String builder is used for memory eficiency
//because is string memory will be be recreating at too much time when we are going to add any thing in the string
