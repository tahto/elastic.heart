(defproject im.chit/elastic.heart "0.1.0-SNAPSHOT"
  :description "elasticsearch, wrapped with love"
  :url "https://github.com/zcaudate/elastic.heart"
  :license {:name "The MIT License"
            :url "http://http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :profiles {:dev {:plugins [[lein-midje "3.1.3"]
                             [lein-hydrox "0.1.16"]]
                   :dependencies [[midje "1.6.3"]
                                  [helpshift/hydrox "0.1.16"]
                                  [prismatic/schema "1.1.0"]]}})