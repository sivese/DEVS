;; DEVS = Discrete Event Simulation

;; Clojure basic data container -> lists, vectors, maps, sets
;; list (linked list) - first, rest, cons, conj
;; '( 1 ... )
;; vectors (array list) - first, rest, nth, last
;; [ 1 ... ]
;; maps - dissoc, assoc
;; {:key value}, (:key sets) -> return value
;; sets
;; #{ 1 ... } if there are duplicate key, it will return error

(ns devs.core)

(defrecord Agent [action type])

(def bot (->Agent "?" "bot"))
; object member reference (:ref object)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

( [20 30 40 50] 2)