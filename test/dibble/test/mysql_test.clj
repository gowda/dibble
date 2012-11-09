(ns dibble.test.mysql-test
  (:require [midje.sweet :refer :all]
            [dibble.mysql :refer :all]))

(fact (mysql-to-clj-type [:name "varchar"]) => nil)
(fact (mysql-to-clj-type [:name "varchar(1)"]) => {:name {:type :string :max-chars 1}})
(fact (mysql-to-clj-type [:name "varchar(10)"]) => {:name {:type :string :max-chars 10}})
(fact (mysql-to-clj-type [:name "varchar(32)"]) => {:name {:type :string :max-chars 32}})

(fact (mysql-to-clj-type [:age "int"]) => {:age {:type :integer :bytes 4}})
(fact (mysql-to-clj-type [:age "int(5)"]) => {:age {:type :integer :bytes 4}})
(fact (mysql-to-clj-type [:age "int(11)"]) => {:age {:type :integer :bytes 4}})
