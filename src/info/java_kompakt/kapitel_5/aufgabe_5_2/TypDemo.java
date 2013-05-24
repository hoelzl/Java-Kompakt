/*
 * Copyright (c) 2013, Matthias Hölzl, Allaithy Raed, Martin Wirsing.
 *
 * Sie können diese Software unter den Bedingungen der MIT Lizenz
 * weitergeben und/oder modifizieren.  Siehe die Datei COPYING oder
 * <http://opensource.org/licenses/mit-license.php>.
 */

package info.java_kompakt.kapitel_5.aufgabe_5_2;

/**
 * Klasse, die alle Operationen auf primitiven Typen enthält.
 *
 * @author Matthias Hölzl (tc@xantira.com)
 */
// Diese Annotation dient dazu, Warnungen in IntelliJ zu unterdrücken.
@SuppressWarnings("FieldCanBeLocal")
public class TypDemo {
    private boolean b1 = true;
    private boolean b2 = false;
    private boolean b3 = true;

    private byte byte1 = 1;
    private byte byte2 = 127;
    private byte byte3 = -128;

    private short short1 = 1;
    private short short2 = 32767;
    private short short3 = -32768;

    private int int1 = 1;
    private int int2 = 2147483647;
    private int int3 = -2147483648;

    private long long1 = 1;
    private long long2 = 9223372036854775807L;
    private long long3 = -9223372036854775808L;

    private float float1 = 1.0f;
    private float float2 = 1.0e-10f;
    private float float3 = 1.0e10f;

    private double double1 = 1.0;
    private double double2 = 1.0e-10;
    private double double3 = 1.0e10;

    private char char1 = 'a';
    private char char2 = 'z';
    private char char3 = 'A';

    public void booleanOps() {
        System.out.format("!b1      = %s\n", !b1);
        System.out.format("b1 &  b2 = %s\n", b1 & b2);
        System.out.format("b1 &  b3 = %s\n", b1 & b3);
        System.out.format("b1 && b2 = %s\n", b1 && b2);
        System.out.format("b1 && b3 = %s\n", b1 && b3);
        System.out.format("b1 |  b2 = %s\n", b1 | b2);
        System.out.format("b1 |  b3 = %s\n", b1 | b3);
        System.out.format("b1 || b2 = %s\n", b1 || b2);
        System.out.format("b1 || b3 = %s\n", b1 || b3);
    }

    // Hilfsmethode, um eine Zahl in Binärdarstellung mit einer bestimmten Länge
    // umzuwandeln.  Liefert ein falsches Ergebnis, wenn sich `value' nicht mit
    // der gewünschten Zahl an Ziffern darastellen lässt.
    private static String toBinaryStringOfLength(long value, int length) {
        String binaryString = Long.toBinaryString(value);
        int fill = length - binaryString.length();
        if (value >= 0) {
            StringBuilder resultBuilder = new StringBuilder();
            for (int index = 0; index < fill; index++) {
                resultBuilder = resultBuilder.append('0');
            }
            resultBuilder.append(binaryString);
            return resultBuilder.toString();
        } else {
            // Für negative Zahlen ist binaryString 64 Zeichen lang, und daher
            // im Normalfall `fill' <= 0.
            return binaryString.substring(-fill);
        }
    }

    private static String toBinaryString(byte b) {
        return toBinaryStringOfLength(b, 8);
    }

    private static String toBinaryString(short s) {
        return toBinaryStringOfLength(s, 16);
    }

    private static String toBinaryString(int i) {
        return toBinaryStringOfLength(i, 32);
    }

    private static String toBinaryString(long l) {
        return toBinaryStringOfLength(l, 64);
    }

    public void byteOps() {
        // Arithmetische Operationen auf Bytes werden als `int'-Werte
        // berechnet.
        System.out.format("byte1 + byte2  = %4d\n", byte1 + byte2);
        // Beim Casten nach Byte sieht man, dass ein Überlauf auftritt.
        System.out.format("byte1 + byte2  = %4d (Cast nach byte)\n",
                (byte) (byte1 + byte2));
        // Auch beim Subtrahieren von einem Byte kann ein Überlauf auftreten.
        // Wie bei der Addition fällt das aber erst auf, wenn man das
        // Ergebnis nach byte castet.
        System.out.format("byte3 - byte1  = %4d\n", byte3 - byte1);
        System.out.format("byte3 - byte1  = %4d (Cast nach byte)\n",
                (byte) (byte3 - byte1));
        byte1 = 7;
        byte2 = 3;
        byte3 = 7;
        System.out.format("byte1: %d, byte2: %d\n", byte1, byte2);
        System.out.format("byte1 * byte2  = %4d\n", byte1 * byte2);
        System.out.format("byte1 / byte2  = %4d\n", byte1 / byte2);
        // In format-Strings wird % als Escape-Zeichen benutzt und muss
        // daher verdoppelt werden, wenn es als Text ausgegeben werden
        // soll.
        System.out.format("byte1 %% byte2  = %4d\n", byte1 % byte2);

        System.out.println();
        System.out.format("byte1:   %d, byte2:   %d\n", byte1, byte2);
        System.out.format("byte1++: %d, ++byte2: %d\n", byte1++, ++byte2);
        System.out.format("byte1:   %d, byte2:   %d\n", byte1, byte2);
        System.out.format("byte1--: %d, --byte2: %d\n", byte1--, --byte2);
        System.out.format("byte1:   %d, byte2:   %d\n", byte1, byte2);

        System.out.println();
        System.out.format("byte1: %d, byte2: %d, byte3: %d\n",
                byte1, byte2, byte3);
        System.out.format("byte1 == byte2: %s\n", byte1 == byte2);
        System.out.format("byte1 == byte3: %s\n", byte1 == byte3);
        System.out.format("byte1 != byte2: %s\n", byte1 != byte2);
        System.out.format("byte1 != byte3: %s\n", byte1 != byte3);
        System.out.format("byte1 < byte2:  %s\n", byte1 < byte2);
        System.out.format("byte1 < byte3:  %s\n", byte1 < byte3);
        System.out.format("byte1 <= byte2: %s\n", byte1 <= byte2);
        System.out.format("byte1 <= byte3: %s\n", byte1 <= byte3);
        System.out.format("byte1 > byte2:  %s\n", byte1 > byte2);
        System.out.format("byte1 > byte3:  %s\n", byte1 > byte3);
        System.out.format("byte1 >= byte2: %s\n", byte1 >= byte2);
        System.out.format("byte1 >= byte3: %s\n", byte1 >= byte3);

        System.out.println();
        byte1 = 15;
        byte2 = 113;
        byte3 = -86;
        System.out.format("byte1: %4d (= 0b%s)\n", byte1, toBinaryString(byte1));
        System.out.format("byte2: %4d (= 0b%s)\n", byte2, toBinaryString(byte2));
        System.out.format("byte3: %4d (= 0b%s)\n", byte3, toBinaryString(byte3));

        System.out.format("byte1 & byte2: 0b%s\n",
                toBinaryString((byte) (byte1 & byte2)));
        System.out.format("byte1 & byte3: 0b%s\n",
                toBinaryString((byte) (byte1 & byte3)));

        System.out.format("byte1 | byte2: 0b%s\n",
                toBinaryString((byte) (byte1 | byte2)));
        System.out.format("byte1 | byte3: 0b%s\n",
                toBinaryString((byte) (byte1 | byte3)));

        System.out.format("byte1 ^ byte2: 0b%s\n",
                toBinaryString((byte) (byte1 ^ byte2)));
        System.out.format("byte1 ^ byte3: 0b%s\n",
                toBinaryString((byte) (byte1 ^ byte3)));

        System.out.format("~byte1:        0b%s\n",
                toBinaryString((byte) (~byte1)));
        System.out.format("~byte3:        0b%s\n",
                toBinaryString((byte) (~byte3)));

        System.out.format("byte1 << 1:    0b%s\n",
                toBinaryString((byte) (byte1 << 1)));
        System.out.format("byte3 << 1:    0b%s\n",
                toBinaryString((byte) (byte3 << 1)));
        System.out.format("byte1 >> 1:    0b%s\n",
                toBinaryString((byte) (byte1 >> 1)));
        System.out.format("byte3 >> 1:    0b%s\n",
                toBinaryString((byte) (byte3 >> 1)));
        System.out.format("byte1 >>> 1:   0b%s\n",
                toBinaryString((byte) (byte1 >>> 1)));
        System.out.format("byte3 >>> 1:   0b%s\n",
                toBinaryString((byte) (byte3 >>> 1)));
        System.out.format("byte1 >> 28:   0b%s\n",
                toBinaryString((byte) (byte1 >> 28)));
        System.out.format("byte3 >> 28:   0b%s\n",
                toBinaryString((byte) (byte3 >> 28)));
        System.out.format("byte1 >>> 28:  0b%s\n",
                toBinaryString((byte) (byte1 >>> 28)));
        System.out.format("byte3 >>> 28:  0b%s\n",
                toBinaryString((byte) (byte3 >>> 28)));
    }

    public void shortOps() {
        // Arithmetische Operationen auf Shorts werden als `int'-Werte
        // berechnet.
        System.out.format("short1 + short2  = %4d\n", short1 + short2);
        // Beim Casten nach Short sieht man, dass ein Überlauf auftritt.
        System.out.format("short1 + short2  = %4d (Cast nach short)\n",
                (short) (short1 + short2));
        // Auch beim Subtrahieren von einem Short kann ein Überlauf auftreten.
        // Wie bei der Addition fällt das aber erst auf, wenn man das
        // Ergebnis nach short castet.
        System.out.format("short3 - short1  = %4d\n", short3 - short1);
        System.out.format("short3 - short1  = %4d (Cast nach short)\n",
                (short) (short3 - short1));
        short1 = 7;
        short2 = 3;
        short3 = 7;
        System.out.format("short1: %d, short2: %d\n", short1, short2);
        System.out.format("short1 * short2  = %4d\n", short1 * short2);
        System.out.format("short1 / short2  = %4d\n", short1 / short2);
        // In format-Strings wird % als Escape-Zeichen benutzt und muss
        // daher verdoppelt werden, wenn es als Text ausgegeben werden
        // soll.
        System.out.format("short1 %% short2  = %4d\n", short1 % short2);

        System.out.println();
        System.out.format("short1:   %d, short2:   %d\n", short1, short2);
        System.out.format("short1++: %d, ++short2: %d\n", short1++, ++short2);
        System.out.format("short1:   %d, short2:   %d\n", short1, short2);
        System.out.format("short1--: %d, --short2: %d\n", short1--, --short2);
        System.out.format("short1:   %d, short2:   %d\n", short1, short2);

        System.out.println();
        System.out.format("short1: %d, short2: %d, short3: %d\n",
                short1, short2, short3);
        System.out.format("short1 == short2: %s\n", short1 == short2);
        System.out.format("short1 == short3: %s\n", short1 == short3);
        System.out.format("short1 != short2: %s\n", short1 != short2);
        System.out.format("short1 != short3: %s\n", short1 != short3);
        System.out.format("short1 < short2:  %s\n", short1 < short2);
        System.out.format("short1 < short3:  %s\n", short1 < short3);
        System.out.format("short1 <= short2: %s\n", short1 <= short2);
        System.out.format("short1 <= short3: %s\n", short1 <= short3);
        System.out.format("short1 > short2:  %s\n", short1 > short2);
        System.out.format("short1 > short3:  %s\n", short1 > short3);
        System.out.format("short1 >= short2: %s\n", short1 >= short2);
        System.out.format("short1 >= short3: %s\n", short1 >= short3);

        System.out.println();
        short1 = 15;
        short2 = 113;
        short3 = -86;
        System.out.format("short1: %4d  (= 0b%s)\n", short1, toBinaryString(short1));
        System.out.format("short2: %4d  (= 0b%s)\n", short2, toBinaryString(short2));
        System.out.format("short3: %4d  (= 0b%s)\n", short3, toBinaryString(short3));

        System.out.format("short1 & short2: 0b%s\n",
                toBinaryString((short) (short1 & short2)));
        System.out.format("short1 & short3: 0b%s\n",
                toBinaryString((short) (short1 & short3)));

        System.out.format("short1 | short2: 0b%s\n",
                toBinaryString((short) (short1 | short2)));
        System.out.format("short1 | short3: 0b%s\n",
                toBinaryString((short) (short1 | short3)));

        System.out.format("short1 ^ short2: 0b%s\n",
                toBinaryString((short) (short1 ^ short2)));
        System.out.format("short1 ^ short3: 0b%s\n",
                toBinaryString((short) (short1 ^ short3)));

        System.out.format("~short1:         0b%s\n",
                toBinaryString((short) (~short1)));
        System.out.format("~short3:         0b%s\n",
                toBinaryString((short) (~short3)));

        System.out.format("short1 << 1:     0b%s\n",
                toBinaryString((short) (short1 << 1)));
        System.out.format("short3 << 1:     0b%s\n",
                toBinaryString((short) (short3 << 1)));
        System.out.format("short1 >> 1:     0b%s\n",
                toBinaryString((short) (short1 >> 1)));
        System.out.format("short3 >> 1:     0b%s\n",
                toBinaryString((short) (short3 >> 1)));
        System.out.format("short1 >>> 1:    0b%s\n",
                toBinaryString((short) (short1 >>> 1)));
        System.out.format("short3 >>> 1:    0b%s\n",
                toBinaryString((short) (short3 >>> 1)));
        System.out.format("short1 >> 28:    0b%s\n",
                toBinaryString((short) (short1 >> 28)));
        System.out.format("short3 >> 28:    0b%s\n",
                toBinaryString((short) (short3 >> 28)));
        System.out.format("short1 >>> 28:   0b%s\n",
                toBinaryString((short) (short1 >>> 28)));
        System.out.format("short3 >>> 28:   0b%s\n",
                toBinaryString((short) (short3 >>> 28)));
    }

    public void intOps() {
        // Auch bei arithmetischen Operationen auf `int's kann ein Überlauf
        // auftreten.
        System.out.format("int1 + int2  = %4d\n", int1 + int2);
        System.out.format("int3 - int1  = %4d\n", int3 - int1);

        int1 = 7;
        int2 = 3;
        int3 = 7;
        System.out.format("int1: %d, int2: %d\n", int1, int2);
        System.out.format("int1 * int2  = %4d\n", int1 * int2);
        System.out.format("int1 / int2  = %4d\n", int1 / int2);
        // In format-Strings wird % als Escape-Zeichen benutzt und muss
        // daher verdoppelt werden, wenn es als Text ausgegeben werden
        // soll.
        System.out.format("int1 %% int2  = %4d\n", int1 % int2);

        System.out.println();
        System.out.format("int1:   %d, int2:   %d\n", int1, int2);
        System.out.format("int1++: %d, ++int2: %d\n", int1++, ++int2);
        System.out.format("int1:   %d, int2:   %d\n", int1, int2);
        System.out.format("int1--: %d, --int2: %d\n", int1--, --int2);
        System.out.format("int1:   %d, int2:   %d\n", int1, int2);

        System.out.println();
        System.out.format("int1: %d, int2: %d, int3: %d\n",
                int1, int2, int3);
        System.out.format("int1 == int2: %s\n", int1 == int2);
        System.out.format("int1 == int3: %s\n", int1 == int3);
        System.out.format("int1 != int2: %s\n", int1 != int2);
        System.out.format("int1 != int3: %s\n", int1 != int3);
        System.out.format("int1 < int2:  %s\n", int1 < int2);
        System.out.format("int1 < int3:  %s\n", int1 < int3);
        System.out.format("int1 <= int2: %s\n", int1 <= int2);
        System.out.format("int1 <= int3: %s\n", int1 <= int3);
        System.out.format("int1 > int2:  %s\n", int1 > int2);
        System.out.format("int1 > int3:  %s\n", int1 > int3);
        System.out.format("int1 >= int2: %s\n", int1 >= int2);
        System.out.format("int1 >= int3: %s\n", int1 >= int3);

        System.out.println();
        int1 = 15;
        int2 = 113;
        int3 = -86;
        System.out.format("int1: %4d (= 0b%s)\n", int1, toBinaryString(int1));
        System.out.format("int2: %4d (= 0b%s)\n", int2, toBinaryString(int2));
        System.out.format("int3: %4d (= 0b%s)\n", int3, toBinaryString(int3));

        System.out.format("int1 & int2:  0b%s\n", toBinaryString(int1 & int2));
        System.out.format("int1 & int3:  0b%s\n", toBinaryString(int1 & int3));

        System.out.format("int1 | int2:  0b%s\n", toBinaryString(int1 | int2));
        System.out.format("int1 | int3:  0b%s\n", toBinaryString(int1 | int3));

        System.out.format("int1 ^ int2:  0b%s\n", toBinaryString(int1 ^ int2));
        System.out.format("int1 ^ int3:  0b%s\n", toBinaryString(int1 ^ int3));

        System.out.format("~int1:        0b%s\n", toBinaryString(~int1));
        System.out.format("~int3:        0b%s\n", toBinaryString(~int3));

        System.out.format("int1 << 1:    0b%s\n", toBinaryString(int1 << 1));
        System.out.format("int3 << 1:    0b%s\n", toBinaryString(int3 << 1));
        System.out.format("int1 >> 1:    0b%s\n", toBinaryString(int1 >> 1));
        System.out.format("int3 >> 1:    0b%s\n", toBinaryString(int3 >> 1));
        System.out.format("int1 >>> 1:   0b%s\n", toBinaryString(int1 >>> 1));
        System.out.format("int3 >>> 1:   0b%s\n", toBinaryString(int3 >>> 1));
        System.out.format("int1 >> 28:   0b%s\n", toBinaryString(int1 >> 28));
        System.out.format("int3 >> 28:   0b%s\n", toBinaryString(int3 >> 28));
        System.out.format("int1 >>> 28:  0b%s\n", toBinaryString(int1 >>> 28));
        System.out.format("int3 >>> 28:  0b%s\n", toBinaryString(int3 >>> 28));
    }

    public void longOps() {
        // Auch bei arithmetischen Operationen auf `long's kann ein Überlauf
        // auftreten.
        System.out.format("long1 + long2  = %4d\n", long1 + long2);
        System.out.format("long3 - long1  = %4d\n", long3 - long1);

        long1 = 7;
        long2 = 3;
        long3 = 7;
        System.out.format("long1: %d, long2: %d\n", long1, long2);
        System.out.format("long1 * long2  = %4d\n", long1 * long2);
        System.out.format("long1 / long2  = %4d\n", long1 / long2);
        // In format-Strings wird % als Escape-Zeichen benutzt und muss
        // daher verdoppelt werden, wenn es als Text ausgegeben werden
        // soll.
        System.out.format("long1 %% long2  = %4d\n", long1 % long2);

        System.out.println();
        System.out.format("long1:   %d, long2:   %d\n", long1, long2);
        System.out.format("long1++: %d, ++long2: %d\n", long1++, ++long2);
        System.out.format("long1:   %d, long2:   %d\n", long1, long2);
        System.out.format("long1--: %d, --long2: %d\n", long1--, --long2);
        System.out.format("long1:   %d, long2:   %d\n", long1, long2);

        System.out.println();
        System.out.format("long1: %d, long2: %d, long3: %d\n",
                long1, long2, long3);
        System.out.format("long1 == long2: %s\n", long1 == long2);
        System.out.format("long1 == long3: %s\n", long1 == long3);
        System.out.format("long1 != long2: %s\n", long1 != long2);
        System.out.format("long1 != long3: %s\n", long1 != long3);
        System.out.format("long1 < long2:  %s\n", long1 < long2);
        System.out.format("long1 < long3:  %s\n", long1 < long3);
        System.out.format("long1 <= long2: %s\n", long1 <= long2);
        System.out.format("long1 <= long3: %s\n", long1 <= long3);
        System.out.format("long1 > long2:  %s\n", long1 > long2);
        System.out.format("long1 > long3:  %s\n", long1 > long3);
        System.out.format("long1 >= long2: %s\n", long1 >= long2);
        System.out.format("long1 >= long3: %s\n", long1 >= long3);

        System.out.println();
        long1 = 15;
        long2 = 113;
        long3 = -86;
        System.out.format("long1: %4d (= 0b%s)\n", long1, toBinaryString(long1));
        System.out.format("long2: %4d (= 0b%s)\n", long2, toBinaryString(long2));
        System.out.format("long3: %4d (= 0b%s)\n", long3, toBinaryString(long3));

        System.out.format("long1 & long2: 0b%s\n", toBinaryString(long1 & long2));
        System.out.format("long1 & long3: 0b%s\n", toBinaryString(long1 & long3));

        System.out.format("long1 | long2: 0b%s\n", toBinaryString(long1 | long2));
        System.out.format("long1 | long3: 0b%s\n", toBinaryString(long1 | long3));

        System.out.format("long1 ^ long2: 0b%s\n", toBinaryString(long1 ^ long2));
        System.out.format("long1 ^ long3: 0b%s\n", toBinaryString(long1 ^ long3));

        System.out.format("~long1:        0b%s\n", toBinaryString(~long1));
        System.out.format("~long3:        0b%s\n", toBinaryString(~long3));

        System.out.format("long1 << 1:    0b%s\n", toBinaryString(long1 << 1));
        System.out.format("long3 << 1:    0b%s\n", toBinaryString(long3 << 1));
        System.out.format("long1 >> 1:    0b%s\n", toBinaryString(long1 >> 1));
        System.out.format("long3 >> 1:    0b%s\n", toBinaryString(long3 >> 1));
        System.out.format("long1 >>> 1:   0b%s\n", toBinaryString(long1 >>> 1));
        System.out.format("long3 >>> 1:   0b%s\n", toBinaryString(long3 >>> 1));
        System.out.format("long1 >> 28:   0b%s\n", toBinaryString(long1 >> 28));
        System.out.format("long3 >> 28:   0b%s\n", toBinaryString(long3 >> 28));
        System.out.format("long1 >>> 28:  0b%s\n", toBinaryString(long1 >>> 28));
        System.out.format("long3 >>> 28:  0b%s\n", toBinaryString(long3 >>> 28));
    }

    public void floatOps() {
        // Beim Rechnen mit `float'-Werten kommt es leicht zu Rundungsfehlern.
        System.out.format("float1: %f, float2: %f\n", float1, float2);
        System.out.format("float1 + float2  = %4f\n", float1 + float2);
        System.out.format("float3 - float1  = %4f\n", float3 - float1);
        System.out.format("float1 * float2  = %4f\n", float1 * float2);
        System.out.format("float1 / float2  = %4f\n", float1 / float2);
        System.out.format("float1 %% float2  = %4f\n", float1 % float2);

        System.out.println();
        System.out.format("float1:   %f, float2:   %f\n", float1, float2);
        System.out.format("float1++: %f, ++float2: %f\n", float1++, ++float2);
        System.out.format("float1:   %f, float2:   %f\n", float1, float2);
        System.out.format("float1--: %f, --float2: %f\n", float1--, --float2);
        System.out.format("float1:   %f, float2:   %f\n", float1, float2);

        System.out.println();
        System.out.format("float1: %f, float2: %f, float3: %f\n",
                float1, float2, float3);
        System.out.format("float1 == float2: %s\n", float1 == float2);
        System.out.format("float1 == float3: %s\n", float1 == float3);
        System.out.format("float1 != float2: %s\n", float1 != float2);
        System.out.format("float1 != float3: %s\n", float1 != float3);
        System.out.format("float1 < float2:  %s\n", float1 < float2);
        System.out.format("float1 < float3:  %s\n", float1 < float3);
        System.out.format("float1 <= float2: %s\n", float1 <= float2);
        System.out.format("float1 <= float3: %s\n", float1 <= float3);
        System.out.format("float1 > float2:  %s\n", float1 > float2);
        System.out.format("float1 > float3:  %s\n", float1 > float3);
        System.out.format("float1 >= float2: %s\n", float1 >= float2);
        System.out.format("float1 >= float3: %s\n", float1 >= float3);
    }

    public void doubleOps() {
        // Auch beim Rechnen mit `double'-Werten kommt es zu Rundungsfehlern,
        // allerdings sind diese für die meisten Anwendungsfälle weit weniger
        // sichtbar als bei `float's.
        System.out.format("double1: %f, double2: %f\n", double1, double2);
        System.out.format("double1 + double2  = %4f\n", double1 + double2);
        System.out.format("double3 - double1  = %4f\n", double3 - double1);
        System.out.format("double1 * double2  = %4f\n", double1 * double2);
        System.out.format("double1 / double2  = %4f\n", double1 / double2);
        System.out.format("double1 %% double2  = %4f\n", double1 % double2);

        System.out.println();
        System.out.format("double1:   %f, double2:   %f\n", double1, double2);
        System.out.format("double1++: %f, ++double2: %f\n", double1++, ++double2);
        System.out.format("double1:   %f, double2:   %f\n", double1, double2);
        System.out.format("double1--: %f, --double2: %f\n", double1--, --double2);
        System.out.format("double1:   %f, double2:   %f\n", double1, double2);

        System.out.println();
        System.out.format("double1: %f, double2: %f, double3: %f\n",
                double1, double2, double3);
        System.out.format("double1 == double2: %s\n", double1 == double2);
        System.out.format("double1 == double3: %s\n", double1 == double3);
        System.out.format("double1 != double2: %s\n", double1 != double2);
        System.out.format("double1 != double3: %s\n", double1 != double3);
        System.out.format("double1 < double2:  %s\n", double1 < double2);
        System.out.format("double1 < double3:  %s\n", double1 < double3);
        System.out.format("double1 <= double2: %s\n", double1 <= double2);
        System.out.format("double1 <= double3: %s\n", double1 <= double3);
        System.out.format("double1 > double2:  %s\n", double1 > double2);
        System.out.format("double1 > double3:  %s\n", double1 > double3);
        System.out.format("double1 >= double2: %s\n", double1 >= double2);
        System.out.format("double1 >= double3: %s\n", double1 >= double3);
    }

    public static void main(String[] args) {
        TypDemo td1 = new TypDemo();
        td1.booleanOps();
        System.out.println();
        td1.byteOps();
        System.out.println();
        td1.shortOps();
        System.out.println();
        td1.intOps();
        System.out.println();
        td1.longOps();
        System.out.println();
        td1.floatOps();
        System.out.println();
        td1.doubleOps();
    }
}
