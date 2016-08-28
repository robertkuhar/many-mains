(defproject many-mains "0.1.0-SNAPSHOT"
  :description "Project containing multiple main methods"

  :dependencies [[org.clojure/clojure "1.8.0"]]

  :main nil

  :target-path "target/%s"

  :profiles {:main-a {:main many-mains.abc}
             :main-b {:main many-mains.def}
             :core {:main many-mains.core}
             :uberjar {:aot :all}})

