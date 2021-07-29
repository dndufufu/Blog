(ns com.fcf.blog.env.interface
  (:require [cprop.source :as source]
            [cprop.core :refer [load-config]]
            [mount.core :as mount :refer [args defstate]]))

(declare env)

(defstate env
          :start
          (load-config
            :merge [(args)
                    (source/from-resource "common-config.edn")
                    (source/from-system-props)
                    (source/from-env)])
          :stop ())