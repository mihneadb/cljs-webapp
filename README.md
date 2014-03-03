# cljs-webapp

A Leiningen template for CLJS webapps.

Comes with two cljsbuild configs - `dev` and `prod`.
There's also an `index.html` including the generated JS.

## Getting started

Create a new project:

    lein new cljs-webapp myapp

Start the auto rebuild loop:

    cd myapp
    lein cljsbuild auto dev

Now fire up a Web server in `resources/public`.

## License

Copyright © 2013 Mihnea Dobrescu-Balaur

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

