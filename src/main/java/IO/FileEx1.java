package IO;

import java.io.File;

public class FileEx1 {
    public static void main(String[] args) {
        if(args.length!=1){
            System.out.println("usage : java FileEx Directory");
            System.exit(0);
        }
        File f = new File(args[0]);

        if(!f.exists() || !f.isDirectory()) {
            System.out.println("no directory");
            System.exit(0);
        }

        File[] files = f.listFiles();

        for(int i=0; i<files.length; i++) {
            String fileName = files[i].getName();
            System.out.println(files[i].isDirectory());
        }
    }
}
