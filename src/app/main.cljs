(ns app.main
  (:require [left-pad :as lp]))

(js/console.log (lp/leftPad "f00" 6))
