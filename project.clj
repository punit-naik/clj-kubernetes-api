(defproject kubernetes-api "0.1.1"
  :description "Kubernetes Client API Library"
  :url "https://github.com/yanatan16/clj-kubernetes-api"
  :license {:name "MIT"
            :url "https://github.com/yanatan16/clj-kubernetes-api/blob/master/LICENSE"}
  :deploy-repositories [["releases" :clojars]]
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/core.async "0.4.474"]
                 [org.clojure/data.json "0.2.6"]
                 [http-kit "2.3.0"]]

  :codox {:namespaces [#"kubernetes\.api\.v\d.*"]}

  :profiles {:dev {:plugins [[lein-codox "0.9.0"]]}})
