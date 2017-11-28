(defn error-message
  [severity]
  (str "OH GOD! IT'S A DISASTER! WE'RE "
       (if (= severity :mild)
           "MIDLY"
           "DOOM")))
(error-message :mild)

(defn multi-arity
  ([first second third]
          (+ first second third))
  ([first second]
          (+ first second))
  ([first]
    (inc first)))
(multi-arity 1 2 3)
(multi-arity 1 2)
(multi-arity 1)

(defn x-chop
  "Describe the kind of chop you're inflicting on someone"
  ([name chop-type]
     (str "I " chop-type " chop " name "! Take that!"))
  ([name]
     (x-chop name "karate")))
   
(x-chop "None")

(reduce + [1 2 3 4])

(reduce + 15 [1 2 3 4])

(defn sum100 [a] (+ a 100))
(sum100 1)

(defn dec-maker
  [dec-by]
  #(- % dec-by))

(def dec9 (dec-maker 9))

(dec9 10)
((dec-maker 2) 4)