class R {
    String str;
    R r;
    R(String str, R r) {
        this.str = str;
        this.r = r;
    }
}

class ExamplesR {
    R ex1 = new R("Hello", 8);
}

/*
    No, I wasn't able to construct an example R, and I think
    this is because one of the fields is type R inside the R
    class. Therefore, I don't think it'd be possible to initialize
    the field 'r'.

    ExamplesR.java:11: error: incompatible types: 
    int cannot be converted to R
        R ex1 = new R("Hello", 8);
                               ^
    Note: Some messages have been simplified; recompile with 
    -Xdiags:verbose to get full output
    1 error
    Exception in thread "main" java.lang.RuntimeException: 
    The ExamplesR class could not be found.
    Please make sure to specify the name of your examples class 
    properly (with no typos).
        at java.base/jdk.internal.loader.BuiltinClassLoader.load
        Class(BuiltinClassLoader.java:641)
        at java.base/jdk.internal.loader.ClassLoaders$AppClass
        Loader.loadClass(ClassLoaders.java:188)
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader
        .java:520)
        at java.base/java.lang.Class.forName0(Native Method)
        at java.base/java.lang.Class.forName(Class.java:375)
        at tester.Main.main(Main.java:228)
*/