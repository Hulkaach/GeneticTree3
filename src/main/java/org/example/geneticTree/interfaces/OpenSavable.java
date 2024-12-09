package org.example.geneticTree.interfaces;

import java.io.Serializable;

public interface OpenSavable {
    boolean save(Serializable object, String path);

    Object load(String path);
}
