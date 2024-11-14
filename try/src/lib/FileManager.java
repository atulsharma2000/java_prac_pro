package lib;

import java.io.*;
import java.util.List;

public class FileManager {
    
    public static void saveBooks(List<Book> books) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("books.dat"))) {
            out.writeObject(books);
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Book> loadBooks() throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("books.dat"))) {
            return (List<Book>) in.readObject();
        }
    }
}