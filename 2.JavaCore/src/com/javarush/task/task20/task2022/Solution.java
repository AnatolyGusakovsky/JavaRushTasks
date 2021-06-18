package com.javarush.task.task20.task2022;

import java.io.*;

/* 
Переопределение сериализации в потоке
*/

public class Solution implements Serializable, AutoCloseable {
    private transient FileOutputStream stream;
    private String filename;

    public Solution(String filename) throws FileNotFoundException {
        this.filename = filename;
        this.stream = new FileOutputStream(this.filename);
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\r\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        stream = new FileOutputStream(filename, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) {
        // only for testing
        try (Solution solution = new Solution("C:/Monarch/filename.txt")) {

            solution.writeObject("TestData");

            // serialization object
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:/Monarch/serialize.txt"));
            objectOutputStream.writeObject(solution);

            // deserialization object
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:/Monarch/serialize.txt"));
            Solution solutionD = (Solution) objectInputStream.readObject();

            // write data to new object
            solutionD.writeObject("TestDataNew");

            // check that in file (C:/filename.txt) are data "TestData and TestDataNew"
            FileInputStream fileInputStream = new FileInputStream("C:/Monarch/filename.txt");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String s1 = bufferedReader.readLine();
            String s2 = bufferedReader.readLine();

            System.out.println("s1: " + s1);
            System.out.println("s2: " + s2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception t) {
            t.printStackTrace();
        }


    }
}
