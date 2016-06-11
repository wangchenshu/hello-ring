(ns hello-ring.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]))

(defn get-handle [x]
  (str "<h1>Get: " x "</h1>"))

(defn post-handle [x]
  (str "<h1>Post: " x "</h1>"))

(defn user-handle [req]
  (str "<h1>User: " (-> req :params :name) "</h1>"))

(defn index []
  (str "<h1>Hello, World</h1>"))

(defn handler [request]  
  {:status 200
   :header {"Content-Type" "text/html"}
   :body "hello, world!"})

(defroutes main-routes
  (GET "/" [] (index))
  (GET "/en" [] (index))
  (GET "/:greeting" [greeting] (get-handle greeting))
  (POST "/user/:name" req (user-handle req))
  (POST "/:greeting" [greeting] (post-handle greeting)))

;(defn -main []
;  (jetty/run-jetty main-routes {:port 3000}))
  
