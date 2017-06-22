(defproject lein-ring "0.12.1-SNAPSHOT"
  :description "Leiningen Ring plugin"
  :url "https://github.com/weavejester/lein-ring"
  :scm {:name "git"
        :url  "https://github.com/weavejester/lein-ring"}
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/data.xml "0.0.8"]
                 [org.clojure/tools.namespace "0.2.11"]
                 [leinjacker "0.4.2"]]
  :ring {:handler leiningen.ring/handler}
  :eval-in-leiningen true)
