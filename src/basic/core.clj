(ns basic.core
  (:use ring.adapter.jetty))

(defn app [req]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body "Hello, world"})

(defn -main []
  (run-jetty app {:host "localhost"
                  :port 8000}))
