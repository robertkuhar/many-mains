# many-mains

Tease out how to support multiple mains in a Leiningen Uberjar

## Usage

    $ lein do clean, deps, compile, test, uberjar
    $ lein with-profile main-abc run
    Hello, from many-mains.abc!
    $ lein with-profile main-def run
    Hello, from many-mains.def!
    $ lein with-profile main-ghi run
    Hello, from org.rekdev.mm.ghi!
    $ lein with-profile core run
    Hello, World!

## Executing straight from the uberjar.

Note that '-' becomes '_' so that the Clojure Namespace can be seen as a valid Java Classname.

    $ java -cp target/uberjar/many-mains-0.1.0-SNAPSHOT-standalone.jar many_mains.abc
    Hello, from many-mains.abc!
    $ java -cp target/uberjar/many-mains-0.1.0-SNAPSHOT-standalone.jar many_mains.def
    Hello, from many-mains.def!
    $ java -cp target/uberjar/many-mains-0.1.0-SNAPSHOT-standalone.jar org.rekdev.mm.ghi
    Hello, from org.rekdev.mm.ghi!
    $ java -cp target/uberjar/many-mains-0.1.0-SNAPSHOT-standalone.jar many_mains.core
    Hello, World!
