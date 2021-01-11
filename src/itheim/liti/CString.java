package itheim.liti;

public class CString {
    public static void main(String[] args) {
        String str ="gdhf jkk djhha jdf";
        String strs[]=str.split("\\s");
        String newString[] = getCapital(strs);
        StringBuffer sb = new StringBuffer();
        for(String s:newString){
            sb.append(s+" ");
        }
        System.out.println(sb);
    }
    public  static String[] getCapital(String strs[]){
        String newString []=new String[strs.length];
        for (int i=0;i<strs.length;i++){
            char s []={strs[i].charAt(0)};
            String string = new String(s);
            String s1 = string.toUpperCase();
            String s2 = strs[i].substring(1);
            newString[i] = s1.concat(s2);
        }
        return newString;
    }
}
