package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	 
    public static void main(String[] args) {
        try {
            // ファイルのパスを指定する
            File file = new File("D:\\SampleTest.txt");
         
            // ファイルが存在しない場合に例外が発生するので確認する
            if (!file.exists()) {
                System.out.print("ファイルが存在しません");
                return;
            }
         
            // BufferedReaderクラスのreadLineメソッドを使って1行ずつ読み込み表示する
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                System.out.println(data);
            }	//ファイルの終わり到達した場合、Nullを返す
         
            // 最後にファイルを閉じてリソースを開放する
            bufferedReader.close();
         
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}