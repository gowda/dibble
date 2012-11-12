(ns dibble.test.numbers-test
  (:require [midje.sweet :refer :all]
            [dibble.numbers :refer :all]))

(def integer-column {:type :integer :min -10 :max 10})
(def double-column {:type :double :min -1.0 :max 1.0})

(fact (some #{(random-integer 0 1)} (range 0 2)) =not=> nil)
(fact (some #{(random-integer 0 9)} (range 0 10)) =not=> nil)
(fact (some #{(random-integer -10 10)} (range -10 11)) =not=> nil)
(fact (some #{(random-integer -10 -5)} (range -10 -4)) =not=> nil)

(fact (>= (randomized-integer integer-column {:min 0}) 0) => true)
(fact (>= (randomized-integer integer-column {:min 5}) 5) => true)
(fact (<= (randomized-integer integer-column {:max 0}) 0) => true)
(fact (<= (randomized-integer integer-column {:max 5}) 5) => true)

(fact (randomized-integer integer-column {:min 5 :max 5}) => 5)
(fact (some #{(randomized-integer integer-column {:min 5 :max 6})} (range 5 7)) =not=> nil)

(fact (float? (randomized-decimal double-column {})) => true)

(fact (>= (randomized-decimal double-column {:min 3.14}) 3.14) => true)
(fact (<= (randomized-decimal double-column {:max 3.14}) 3.14) => true)

(fact (#(and (>= % 1.23) (<= % 2.01))
       (randomized-decimal double-column {:min 1.23 :max 2.01})) => true)

