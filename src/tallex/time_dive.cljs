(ns ^:figwheel-hooks tallex.time-dive)

(defn ^:after-load re-render []
  (js/console.log "Hello, Time Dive!"))
