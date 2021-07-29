(ns com.fcf.blog.mongo.interface.state
  (:require [com.fcf.blog.mongo.interface :refer [db db*]]))

(def states [#'db* #'db])