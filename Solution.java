package com.javarush.task.task13.task1319;

import java.io.*;
import java.nio.charset.StandardCharsets;

/* 
Писатель в файл с консоли
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку «exit«.
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.


Требования:
1. Программа должна считывать c консоли имя файла.
2. Создай и используй объект типа BufferedWriter.
3. Программа должна читывать строки с консоли, пока пользователь не введет строку "exit".
4. Программа должна записать абсолютно все введенные строки (включая "exit") в файл, каждую строчку с новой строки.
5. Метод main должен закрывать объект типа BufferedWriter после использования.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName =/* "c\\test.txt";//*/reader.readLine();
        //System.out.println(fileName);
        //OutputStream outputStream = new FileOutputStream(fileName);
        BufferedWriter strrInput = new BufferedWriter(new FileWriter(fileName));
        while (true){
            String s = reader.readLine() + "\n";

           InputStream strInput = new ByteArrayInputStream(s.getBytes(StandardCharsets.UTF_8));

             /*       String carestka = "/n";
            InputStream */
            while (strInput.available() >0) {
                int data = strInput.read();
                strrInput.write(data);

            }

     strInput.close();
            if (s.equals("exit\n")) break;
        }
        strrInput.close();

    }
}
