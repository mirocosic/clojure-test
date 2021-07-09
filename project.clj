(defproject org.clojars.mirocosic/retrogeek "0.1.0"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :scm {:name "git" :url "https://github.com/mirocosic/clojure-test"}
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :main ^:skip-aot retrogeek.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
