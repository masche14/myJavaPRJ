public class Code04_13 {
    public static void main(String[] args) {
        String str = " 한글 ABCD efgh ";
        String cutStr= "";
        String upper= "";
        String lower= "";
        String allStr = "";


        upper = str.toUpperCase();
        lower = str.toLowerCase();
        cutStr = str.trim();
        allStr = str.replaceAll(" ", "");

        System.out.println("기존 문자열 ==> ["+str+"]");
        System.out.println("공백 제거1 ==> ["+cutStr+"]");
        System.out.println("공백 제거2 ==> ["+allStr+"]");
        System.out.println("대문자 ==> ["+upper+"]");
        System.out.println("대문자 ==> ["+lower+"]");
    }
}
