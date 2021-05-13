package com.sekou.test;

import com.sekou.builders.Assembler;
import com.sekou.interfaces.Packager;
import com.sekou.model.Package;

public class TestPackager {

    public static void main(String[] args) {
        Packager packager = new Assembler();
        Package myPackage = packager.assemblePackage();

        System.out.println(myPackage);
    }
}