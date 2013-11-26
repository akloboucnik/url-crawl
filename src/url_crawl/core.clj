(ns url-crawl.core
  (:require [net.cgrand.enlive-html :as html]
            [taoensso.timbre :as timbre :refer (trace debug)]))

; itsy is a web spider,
; it uses cemerick.url for url abstraction

; stack of visited uris
(def visited-uris [])

(defn fetch-url
  "Fetches URL using enlive's html-resource"
  [url]
  (html/html-resource (java.net.URL. url)))

; TODO implement src's
; TODO limit only to As, LINKs, IMGs and SCRIPTs
; TODO add parsing of urls in CSSs
(defn get-urls
  "Returns all kinds of URIs (a[href]s, link[href]s, img[src]s, script[src]s)
  found in content"
  [content]
  (map
    #(first (html/attr-values % :href)) ; attr-values returns set of matches, so take just the first href found
    (html/select content [(html/attr? :href)])))

(defn parse
  [url]
  (get-urls (fetch-url url)))
