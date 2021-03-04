package com.gmail.mybmcc22.models;

import com.sun.source.tree.Tree;

import java.util.TreeMap;

public class MaterialCatalog {
    //Polymorphism

    private TreeMap<String, Material> materialMap;

    public MaterialCatalog() {
        materialMap = new TreeMap<String, Material>();
    }

    public void addMaterial(Material newMaterial) {
        materialMap.put(newMaterial.getId(), newMaterial);
    }

    public TreeMap<String, Material> getMap() {
        return materialMap;
    }

    public Material findMaterial(String title) throws MaterialNotFoundException {
        title = title.trim();

        for (Material nextMaterial : materialMap.values()) {
            if (nextMaterial.getTitle().equalsIgnoreCase(title)){
                return nextMaterial;
            }
        }
        throw new MaterialNotFoundException();
    }

    public int getNumberOfMaterial() {
        return  materialMap.size();
    }
}
