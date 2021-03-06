# laszip4j
The LASzip library ported to Java

This is a Java port of the [LASzip](https://github.com/LASzip/LASzip) and 
[LAStools](https://github.com/LAStools/LAStools) libraries by Martin Isenburg.

The port to Java is *not* complete. Many classes are stubs only and have not
been ported. The main driver was to have a Java implementation of the laszip 
utility and be able to unpack LAZ files for 
[Canton of Zurich](http://geolion.zh.ch/geodatensatz/show?nbid=2606)
in Switzerland, which works fine.

Usage is the same as with the native laszip utility, but invoked as a runnable
jar:

    java -jar laszip4j-0.2.jar -oparse xyzc -keep_class 3 4 5 6 10 -i 7015_2640.laz -o 7015_2640.xyzk
    
On top of LASzip and LAStools this library also provides convenience classes
for reading LAS points. You can read LAS points in your code like this:

        LASReader reader = new LASReader(new File("data.laz"));
        for (LASPoint p : reader.getPoints()) {
            // read something from point
            p.getClassification();
        }

See also [LASReaderTest](src/test/java/com/github/mreutegg/laszip4j/LASReaderTest.java)
on how to use the LASReader class.

[![Build Status](https://semaphoreci.com/api/v1/mreutegg/laszip4j/branches/master/badge.svg)](https://semaphoreci.com/mreutegg/laszip4j)