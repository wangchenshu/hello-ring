# How to run

## Install leiningen
Please reference [My Clojure-102](https://github.com/wangchenshu/clojure-102/blob/master/clojure-102.org)

## Run
      $ lein deps
      $ lein repl
      $ user=> (use 'ring.adapter.jetty)
      $ user=> (use 'hello-ring.core)
      $ user=> (run-jetty main-routes {:port 3000})
      2016-06-11 16:38:38.658:INFO:oejs.Server:nREPL-worker-1: jetty-9.2.10.v20150310
      2016-06-11 16:38:38.705:INFO:oejs.ServerConnector:nREPL-worker-1: Started ServerConnector@c0e76d3{HTTP/1.1}{0.0.0.0:3000}
      2016-06-11 16:38:38.706:INFO:oejs.Server:nREPL-worker-1: Started @66007ms

