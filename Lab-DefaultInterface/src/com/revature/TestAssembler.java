package com.revature;

import com.revature.assemblers.MyAssembler;
import com.yourname.interfaces.Packager;
import com.yourname.model.Package;

public class TestAssembler {
    public static void main(String[] args) {
        Packager packager = new MyAssembler();
        Package myPackage = packager.assemblePackage("This is a new content description.");

        System.out.println(myPackage);
    }
}