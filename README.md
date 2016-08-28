# many-mains

Tease out how to support multiple mains in a Leiningen Uberjar

## Usage

    $ lein with-profile main-a run
    Hello, from many-mains.abc!
    $ lein with-profile main-b run
    Hello, from many-mains.def!

FIXME: explanation

    $ java -jar many-mains-0.1.0-standalone.jar [args]

## What I want

    $ java -cp many-mains-0.1.0-standalone.jar many-mains.abc

    $ java -cp many-mains-0.1.0-standalone.jar many-mains.def
