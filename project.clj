(defproject dibble "0.1.5-SNAPSHOT"
  :description "A Clojure library for seeding databases"
  :url "https://github.com/MichaelDrogalis/dibble"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories {"stuart" "http://stuartsierra.com/maven2"}  
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [midje "1.4.0"]
                 [com.stuartsierra/lazytest "1.2.3"]
                 [korma "0.3.0-beta11"]
                 [mysql/mysql-connector-java "5.1.21"]
                 [postgresql "9.0-801.jdbc4"]
                 [org.xerial/sqlite-jdbc "3.6.16"]
                 [cheshire "5.0.0"]
                 [clj-time "0.4.4"]
                 [log4j "1.2.15" :exclusions [javax.mail/mail
                                              javax.jms/jms
                                              com.sun.jdmk/jmxtools
                                              com.sun.jmx/jmxri]]]
  :plugins [[lein-midje "2.0.0-SNAPSHOT"]])

