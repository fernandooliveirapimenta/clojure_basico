(ns todo.database
  (:require [korma.db :as korma]))

(def db-connection-info
  (korma/mysql
    {:class-name "com.mysql.jdbc.Driver"
     :subprotocol "mysql"
     :user "root"
     :subname "localhost:3306/menagerie"
     }))

;set up korma


(korma/defdb db db-connection-info)