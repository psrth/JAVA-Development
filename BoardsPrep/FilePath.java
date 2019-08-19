package boardsPrep;
//AUTHOR: Parth Sharma, 10D
//ICSE.Board.Paper.2014 - Q6

import java.util.Scanner;

public class FilePath {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the full file path: ");
        String file=sc.nextLine();
        
        int l=file.length();
        int fs=file.lastIndexOf(".");
        int bs=(file.lastIndexOf("\\"))+1;

        String path=file.substring(0,bs);
        String name=file.substring(bs,fs);
        String ext=file.substring((fs+1),l);
    
        System.out.println("Path: "+path);
        System.out.println("File name: "+name);
        System.out.println("Extension: "+ext);
    }
}
