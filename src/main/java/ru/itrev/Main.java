package ru.itrev;

public class Main {
    public static void main(String[] args) {
        Parser parser = new Parser("C:\\Users\\username\\example.json");
        System.out.println(parser.getValuesByKey("word"));
    }
}
