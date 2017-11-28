(defn Sum
  ([x y] 
      (+ x y))
  ([x] 
       (Sum x x)))
(defn Sub 
  ([x y] 
      (- x y))
  ([x]
      (Sub x x)))
(defn Times 
  ([x y] 
      (* x y))
    ([x]
      (Times x x)))
(defn Div 
  ([x y] 
      (/ x y))
    ([x] 
      (Div x x)))

(def Func [Sum Sub Times Div])


((get Func 
      (. Integer parseInt 
         (read-line)))
       (. Double  parseDouble
          (read-line)) 
       (. Double  parseDouble 
          (read-line)))
        
;;(def test2 {:s + :u - :t * :d /})

;;((get test2 
;;      (keyword 
;;          (read-line)))
;;      2 2)