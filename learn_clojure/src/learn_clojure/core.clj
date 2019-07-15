(ns learn-clojure.core
  (:gen-class) )

(defn hello-world []
  (println "Hello World"))

(hello-world)

(defn example []
  (prn (str "Hello World"))
  (println (+ 1 2)))

(example)

(defn tuto []
  ;; The below code declares a integer variable
  (def x 1)
  ;; The below code declares a float variable
  (def y 1.25)
  ;; The below code declares a string variable
  (def str1 "Hello")
  (println x)
  (println y)
  (println str1)
  )

(defn Example []
  (def x 1)
  (def y 2.22)
  (def st "Hello")
  (def sts true)
  )

(defn pipi []
  (def _num1 2))



