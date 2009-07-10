/*
 * See LICENSE file in distribution for copyright and licensing information.
 */
package org.yecht;

/**
 *
 * @author <a href="mailto:ola.bini@gmail.com">Ola Bini</a>
 */
public class YAML {
    public final static int YAML_MAJOR = 1;
    public final static int YAML_MINOR = 0;

    public final static String YECHT_VERSION = "0.0.1";
    public final static String DOMAIN = "yaml.org,2002";

    public final static int ALLOC_CT = 8;
    public final static int BUFFERSIZE = 4096;

    public static long[] realloc(long[] input, int size) {
        long[] newArray = new long[size];
        System.arraycopy(input, 0, newArray, 0, input.length);
        return newArray;
    }
}