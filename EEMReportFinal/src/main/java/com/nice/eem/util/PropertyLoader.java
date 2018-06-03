/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nice.eem.util;

import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author pooja.v
 */
public abstract class PropertyLoader {

    private static final boolean THROW_ON_LOAD_FAILURE = true;
    private static final boolean LOAD_AS_RESOURCE_BUNDLE = false;
    private static final String SUFFIX = ".properties";

    public static Properties loadProperties(String name, ClassLoader loader) {
        if (name == null) {
            throw new IllegalArgumentException("null input: name");
        }
        if (name.startsWith("/")) {
            name = name.substring(1);
        }
        if (name.endsWith(".properties")) {
            name = name.substring(0, name.length() - ".properties".length());
        }
        Properties result = null;

        InputStream in = null;
        try {
            if (loader == null) {
                loader = ClassLoader.getSystemClassLoader();
            }
            name = name.replace('.', '/');
            if (!name.endsWith(".properties")) {
                name = name.concat(".properties");
            }
            in = loader.getResourceAsStream(name);
            if (in != null) {
                result = new Properties();
                result.load(in);
            }
            if (in != null) {
                try {
                    in.close();
                } catch (Throwable ignore) {
                }
            }
            if (result != null) {
                return result;
            }
        } catch (Exception e) {
            result = null;
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (Throwable ignore) {
                }
            }
        }
        throw new IllegalArgumentException("could not load [" + name + "]" + " as " + "a classloader resource");

        // return result;
    }

    public static Properties loadProperties(String name) {
        return loadProperties(name, Thread.currentThread().getContextClassLoader());
    }     
}
