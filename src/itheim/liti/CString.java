package itheim.liti;

public class CString {
    public static void main(String[] args) {
        String str ="gdhf jkk djhha jdf";
        String strs[]=str.split("//");
        String newString[] = getCapital(strs);

    }
    public  static String[] getCapital(String strs[]){
        String newString []=new String[strs.length];
        for (int i=0;i<strs.length;i++){
            char s []={strs[i].charAt(0)};
            String string = new String(s);

        }
        return newString;
    }
}
