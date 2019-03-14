package ru.sbt.javaschool.step3;

import ru.sbt.javaschool.step3.observable.EmailNotificationListener;
import ru.sbt.javaschool.step3.observable.LogOpenListener;
import ru.sbt.javaschool.step3.observer.Publisher;

public class TestApp {
    public static void main(String[] args) {
        Publisher editor = new Publisher();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));
        editor.events.subscribe("rename", new LogOpenListener("/path/to/log/file.txt"));
        try {
            editor.openFile("test.txt");
            editor.saveFile();
            editor.renameFile("test.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}