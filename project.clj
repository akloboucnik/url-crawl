(defproject url-crawl "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [com.taoensso/timbre "2.7.1"] ; logging
                 [enlive "1.1.4"] ; for scraping and now also getting html
                 [com.cemerick/url "0.1.0"] ; URl abstraction
                 ])
