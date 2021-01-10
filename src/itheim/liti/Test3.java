package itheim.liti;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        File file = new File("F:\\sdas");
        getFileNmae(file);
    }
    public static void getFileNmae(File file){
        if(file.isDirectory()){
            File files []=file.listFiles();
            for(File f:files){
                System.out.println(f.getName());
                getFileNmae(f);
            }
        }else {
            System.out.println(file.getName());
        }

    }
}
