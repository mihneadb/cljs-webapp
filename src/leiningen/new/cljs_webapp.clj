(ns leiningen.new.cljs-webapp
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "cljs-webapp"))

(defn cljs-webapp
  "Create a new cljs webapp project"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh cljs-webapp project..")
    (->files data
             ["project.clj" (render "project.clj" data)]
             ["LICENSE" (render "LICENSE" data)]
             ["resources/public/index.html" (render "index.html" data)]
             ["src-cljs/{{sanitized}}/main.cljs" (render "main.cljs" data)])
    (main/info "Start right away with `lein cljsbuild auto dev`"
               "and check out resources/public/index.html!")))

