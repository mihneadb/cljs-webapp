(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2080"]]
  :plugins [[lein-cljsbuild "1.0.1-SNAPSHOT"]]

  :cljsbuild {
    :builds {
             :dev {
                   :source-paths ["src-cljs"]
                   :compiler {:output-to "resources/public/js/cljs.js"
                              :output-dir "resources/public/js"
                              :optimizations :none
                              :pretty-print true
                              :source-map "resources/public/js/cljs.js.map"}}}})

