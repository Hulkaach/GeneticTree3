package org.example.geneticTree.interfaces;

import java.io.*;

public class FileHandler implements OpenSavable {

    @Override
    public boolean save(Serializable object, String path) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path))) {
            objectOutputStream.writeObject(object);
            return true;
        } catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }

    @Override
    public Object load(String path) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path))) {
            return objectInputStream.readObject();
        } catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }
}
